package com.gmo.phuongbt;

import com.gmo.phuongbt.Car;

public class ExecuteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car Toyota = new Car("Roll Royce", 2018, 5);

		Toyota.bLeftHandDrive = true;
//		Toyota.iDoors = 4;
		Toyota.iGear = 5;
		Toyota.iHighestSpeed = 200;
//		Toyota.iMake = 2014;
		Toyota.iTyres = 4;
		Toyota.sColor = "Black";
		Toyota.sTransmission = "Manual";
//		Toyota.sModel = "Camry";

		// Using Car class method
		Toyota.DisplayCharacterstics();
	}

}
