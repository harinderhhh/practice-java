package com.harinder.java.learning;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizationDemo implements Externalizable{
	int id;
	int txnid;
	String name;
	
	public ExternalizationDemo()
	{
		System.out.println("No-arg constructor");
	}
	
	public ExternalizationDemo(int id, int txnid, String name)
	{
		this.id = id;
		this.txnid = txnid;
		this.name = name;
	}
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(id);
	}

	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		String nameFromFile = (String) in.readObject();
		int idFromFile = in.readInt();
	}

	@Override
	public String toString() {
		return "ExternalizationDemo [id=" + id + ", txnid=" + txnid + ", name=" + name + "]";
	}
}

class TestExternalizationDemo
{
	public static void main(String... args) throws Exception
	{
		ExternalizationDemo ed = new ExternalizationDemo(10, 20, "harinder");
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ed);
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizationDemo ed1 = (ExternalizationDemo)ois.readObject();
		
		System.out.println(ed1.id + " " + ed1.txnid + " " + ed1.name);
	
	}
}