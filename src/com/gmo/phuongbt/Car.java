package com.gmo.phuongbt;

public class Car {

	 private String sModel;
	int iGear;
	int iHighestSpeed;
	String sColor;
	private int iMake;
	boolean bLeftHandDrive;
	String sTransmission;
	int iTyres;
	private int iDoors;

	public Car(String model, int make, int doors) {
		sModel = model;
		iMake = make;
		iDoors = doors;
	}

	public void DisplayCharacterstics() {
		System.out.println("Model of the Car: " + sModel);
		System.out.println("Number of gears in the Car: " + iGear);
		System.out.println("Max speed of the Car: " + iHighestSpeed);
		System.out.println("Color of the Car: " + sColor);
		System.out.println("Make of the Car: " + iMake);
		System.out.println("Transmission of the Car: " + sTransmission);
		System.out.println("Number of doors: " + iDoors);
	}

}
