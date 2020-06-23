package com.harinder.java.learning;

class Animal {
    public void eats()
    {
    	System.out.println("Animal eats food....");
    }
	public void lives()
	{
		System.out.println("Animal lives either on land or in water....");
	}
}

class Lion extends Animal{
	@Override
	public void eats()
	{
		System.out.println("Lion eats meat..");
	}
	
	@Override
	public void lives()
	{
		System.out.println("Lion lives on land....");
	}
}

class Fish extends Animal {
	public void eats()
	{
		System.out.println("Fish eats smaller fishes...");
	}
	public void lives()
	{
		System.out.println("Fish lives in water...");
	}
}
public class Overriding {

	public static void main(String args[])
	{
		Fish old_l = new Fish();
		old_l.eats();
		old_l.lives();
		System.out.println("=============");
		Lion l = new Lion();
		l.eats();
		l.lives();
	}
}
