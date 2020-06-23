package com.harinder.designpatterns;

public class TestFactory {
	public static void main(String[] args) {
		Car maruti = CarFactory.getCar("maruti", "1500", "Diesel");
		Car honda = CarFactory.getCar("Honda", "1200", "Petrol");

		System.out.println("Maruti Factory : " + maruti);
		System.out.println("Honda Factory : " + honda);
	}
} 