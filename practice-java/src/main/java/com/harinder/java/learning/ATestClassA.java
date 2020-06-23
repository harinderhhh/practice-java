package com.harinder.java.learning;

class ATestClassA {
	class InnerClass {
		public void m1()
		{
			System.out.println("Inner Class instance method");
		}
	}

	public void m2()
	{
		this.new InnerClass().m1();
//		InnerClass i = new InnerClass();
//		i.m1();
	}
	public static void main(String[] args) {
		System.out.println("Outer Class main method");
		ATestClassA o = new ATestClassA();
		o.m2();
		InnerClass i = o.new InnerClass();
		i.m1();
	}

}
