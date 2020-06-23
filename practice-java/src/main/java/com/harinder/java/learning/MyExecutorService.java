package com.harinder.java.learning;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class MyExecutorService {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService e = Executors.newFixedThreadPool(4);
		for (int i = 1; i <= 4; i++) {
			Callable task = new MyCallableTaskPrintingStar(i);
			e.submit(task).get();
		}
		e.shutdown();
	}

}
