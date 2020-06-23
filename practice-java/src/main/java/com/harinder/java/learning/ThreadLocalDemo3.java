package com.harinder.java.learning;

class ParentThread extends Thread
{
	static InheritableThreadLocal tl = new InheritableThreadLocal()
	{
		@Override
		public Object childValue(Object p)
		{
			return "CC";
		}
	};
	public void run()
	{
		tl.set("PP");
		System.out.println("ParentThread tl = " + tl.get());
		ChildThread c = new ChildThread();
		c.start();
	}
}

class ChildThread extends Thread
{
	public void run()
	{
		System.out.println("Child Thread tl = " + ParentThread.tl.get());
	}
}

public class ThreadLocalDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ParentThread p = new ParentThread();
		p.start();
	}

}
