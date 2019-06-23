package by.htp.automobile.main;


public class Main {
	
	public static void main(String[] args) {
		
		Logic newauto1 = new Logic();
		Auto auto1 = newauto1.createAuto();
			
		System.out.println("The model of the car is " + auto1.getModel());
	}
}