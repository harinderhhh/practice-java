package com.harinder.designpatterns;

public class Honda extends Car {
	private String engine;
	private String fuelType;

	public Honda(String engine, String fuelType) {
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