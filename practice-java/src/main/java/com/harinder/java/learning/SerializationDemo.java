package com.harinder.java.learning;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String args[]) {
		try {
			String s1 = new String("harinder singh");
			FileOutputStream fos = new FileOutputStream("string.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);
			oos.close();
			
			FileInputStream fis = new FileInputStream("string.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			String s2 = (String) ois.readObject();
			ois.close();
			System.out.println(s2);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}