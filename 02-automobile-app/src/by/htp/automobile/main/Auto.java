package by.htp.automobile.main;

import java.util.ArrayList;

public class Auto {
	
	private String model;
	private int currentSpeed;
	private int fuelAmount;
	
	private Engine engine;
	private ArrayList<Wheel> wheels;
	
	
	public Auto(String model) {
		this.model = model;
	}
	
	public Auto(int currentSpeed, int fuelmount) {
		this.currentSpeed = currentSpeed;
		this.fuelAmount = fuelAmount;
	}
	
	public Auto(String model, Engine engine, ArrayList<Wheel> wheels) {
		 this.model = model;
		 this.currentSpeed = 0;
		 this.fuelAmount = 0;
		 this.engine = engine;
		 this.wheels = wheels;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public int getFuelAmount() {
		return fuelAmount;
	}

	public void setFuelAmount(int fuelAmount) {
		this.fuelAmount = fuelAmount;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public ArrayList<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(ArrayList<Wheel> wheels) {
		this.wheels = wheels;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + currentSpeed;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + fuelAmount;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((wheels == null) ? 0 : wheels.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (currentSpeed != other.currentSpeed)
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (fuelAmount != other.fuelAmount)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (wheels == null) {
			if (other.wheels != null)
				return false;
		} else if (!wheels.equals(other.wheels))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Auto [model=" + model + ", currentSpeed=" + currentSpeed + ", fuelAmount=" + fuelAmount + ", engine="
				+ engine + ", wheels=" + wheels + ", getModel()=" + getModel() + ", getCurrentSpeed()="
				+ getCurrentSpeed() + ", getFuelAmount()=" + getFuelAmount() + ", getEngine()=" + getEngine()
				+ ", getWheels()=" + getWheels() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

	
}
	