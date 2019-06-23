package by.htp.automobile.main;

import java.util.ArrayList;

import by.htp.automobile.*;

public class Logic {
	
	public Auto createAuto() {
		Engine engine = new Engine(500, "V8");
		
		ArrayList<Wheel> wheels = new ArrayList<Wheel>();
		
		Wheel wheel1 = new Wheel(1,"left");
		Wheel wheel2 = new Wheel(1,"right");
		Wheel wheel3 = new Wheel(2,"left");
		Wheel wheel4 = new Wheel(2,"right");
		wheels.add(wheel1);
		wheels.add(wheel2);
		wheels.add(wheel3);
		wheels.add(wheel4);
		
		Auto auto = new Auto("Camaro", engine, wheels);
		
		return auto;
	}
	
	public boolean drive(Auto auto) {
		if (auto.getCurrentSpeed() >0 && auto.getFuelAmount() >0) {
		return true;
		} else {
			return false;
		}
	}
	
	public boolean refuel(Auto auto) {
		if (auto.getFuelAmount() == 0) {
		return true;
		} else {
			return false;
		}
	}
	
	public Auto changeWheel(Auto auto, Wheel wheel) {
		Wheel wheelForChange = null;
		
		ArrayList<Wheel> allWheels = auto.getWheels();
		for (Wheel autoWheel: allWheels) {
			if (autoWheel.getNumberAxis() == wheel.getNumberAxis() && autoWheel.getSide().equals(wheel.getSide())) {
				wheelForChange = autoWheel;
			}
		}
		if (wheelForChange != null) {
			allWheels.remove(wheelForChange);
			allWheels.add(wheel);
			auto.setWheels(allWheels);
		}	
		return auto;
	}
}
