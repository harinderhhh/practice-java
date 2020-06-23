package com.harinder.designpatterns;

public abstract class Car {

	public abstract String getEngine();

	public abstract String getFuelType();

	@Override
	public String toString() {
		return " Engine = " + this.getEngine() + ", Fuel Type = " + this.getFuelType();
	}
}