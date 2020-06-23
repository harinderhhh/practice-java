package com.harinder.java.learning;
public class ThreadVolatile {
    
    static volatile int x = 0, y = 0;
    
    static void method1() {
           x++; y++;
    }
    static void method2() {
           System.out.println("x=" + x + " y=" + y);
    }
    
    public static void main(String[] args) {
           Thread thread1=new Thread(){
                  public void run(){
                        for(int i=0; i<10;i++)
                        {
                        	System.out.println("METHOD 1");
                               method1();
                        }
                        
                  }
           };
 
           Thread thread2=new Thread(){
                  public void run(){
                        for(int i=0; i<10;i++)
                        {
                        	System.out.println("METHOD 2");
                               method2();
                        }
                  }
           };
           
           thread1.start();
           thread2.start();
    }
}
