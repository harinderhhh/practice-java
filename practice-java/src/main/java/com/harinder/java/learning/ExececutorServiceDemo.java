package com.harinder.java.learning;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Printjob implements Runnable
{
	String name;
	Printjob(String name)
	{
		this.name = name;
	}
	public void run()
	{
		System.out.println(name + "--job started by Thread: " + Thread.currentThread().getName());
		try{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println(name + "--job completed by Thread: " + Thread.currentThread().getName());
	}
}

public class ExececutorServiceDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Printjob[] jobs = {
				new Printjob("Harinder"),
				new Printjob("Pawan"),
				new Printjob("Durga"),
				new Printjob("Maheep"),
				new Printjob("Saurabh"),
				new Printjob("Harry")
		};
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (Printjob job : jobs)
		{
			service.submit(job);
		}
		service.shutdown();
	}

}
