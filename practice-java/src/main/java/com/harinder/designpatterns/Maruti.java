package com.harinder.designpatterns;

public class Maruti extends Car {
	private String engine;
	private String fuelType;

	public Maruti(String engine, String fuelType) {
		this.engine = engine;
		this.fuelType = fuelType;
	}

	@Override
	public String getEngine() {
		return this.engine;
	}

	@Override
	public String getFuelType() {
		return this.fuelType;
	}
}