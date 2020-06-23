package com.harinder.designpatterns;

public class CarFactory {
	public static Car getCar(String type, String engine, String fuelType) {
		if ("Maruti".equalsIgnoreCase(type))
			return new Maruti(engine, fuelType);
		else if ("Honda".equalsIgnoreCase(type))
			return new Honda(engine, fuelType);

		return null;
	}
}