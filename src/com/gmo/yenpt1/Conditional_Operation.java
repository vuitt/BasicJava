package com.gmo.yenpt1;

public class Conditional_Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Ten = 10;
		int Twenty = 20;
		int Thirty = 30;
		boolean bValue;
		int iValue;
		bValue = (Thirty == Twenty + Ten) ? true : false;
		System.out.println("The boolean value of the variable 'bValue' is: " + bValue);

		iValue = (Thirty == Twenty + Ten) ? 50 : 100;
		System.out.println("The int Value of the variable iValue is: " + iValue);

		iValue = (!(Thirty == Twenty + Ten)) ? 50 : 100;
		System.out.println("The int Value of the variable iValue is: " + iValue);

	}

}
