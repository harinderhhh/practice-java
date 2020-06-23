package com.harinder.java.learning;

public class FirstMultiThreadedProgram {

	private static class FirstThreadClass implements Runnable{
		public void run()
		{
			for (int i = 0; i < 50; i++) {
				System.out.println("Child Thread!");
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t = new Thread(new FirstThreadClass());
		t.start();
		for (int i = 0; i < 50; i++) {
			System.out.println("Main Thread before!");
		}
        
	}
}

