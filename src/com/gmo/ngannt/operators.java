package com.gmo.ngannt;

public class operators {

	static int speed = 80;
	static int distance = 20;
	static int time = 10;
	static String name = "ToolsQA";
	static boolean isGood = true;

	public static void main(String[] args) {

		System.out.println("Value stored in the speed variable is : " + speed);
		System.out.println("Value stored in the distance variable is : " + distance);
		System.out.println("Value stored in the time variable is : " + time);
		System.out.println("Value stored in the name variable is : " + name);
		System.out.println("Value stored in the isGood variable is : " + isGood);

		speed = 100;
		time = distance;
		name = "ForumsQA";
		isGood = false;
		System.out.println("Value stored in the speed variable is : " + speed);
		System.out.println("Value stored in the time variable is : " + time);
		System.out.println("Value stored in the name variable is : " + name);
		System.out.println("Value stored in the isGood variable is : " + isGood);

		speed = distance = 0;
		System.out.println("Value stored in the speed variable is : " + speed);

		// Illegal Assignments - Compile time errors
//		 speed = "ToolsQA"; //String can not be assign to integer
//		 name = 10; // Integer can not be assign to String
//		 isGood = "ToolsQa" // String can not be assign to Bo

		int a, b = 10, c = 5;
		a = b + c;
		System.out.println("Value of 'a' after '+' Arithmetic operation is " + a);
		a = b - c;
		System.out.println("Value of 'a' after '-' Arithmetic operation is " + a);
		a = b * c;
		System.out.println("Value of 'a' after '*' Arithmetic operation is " + a);
		a = b / c;
		System.out.println("Value of 'a' after '/' Arithmetic operation is " + a);
		a = b % c;
		System.out.println("Value of 'a' after '%' Arithmetic operation is " + a);
		b++;
		System.out.println("Value of 'b' after '++' Arithmetic operation is " + b);
		c--;
		System.out.println("Value of 'c' after '--' Arithmetic operation is " + c);

		int Ten = 10;
		int Twenty = 20;
		int Thirty = 30;

		System.out.println("<<<<<< GREATER THAN OPERATOR >>>>>>");
		System.out.println(" Ten > Twenty ==> " + (Ten > Twenty)); // false
		System.out.println(" Twenty > Ten ==> " + (Twenty > Ten)); // true
		System.out.println(" Thirty > Twenty ==> " + (Thirty > Twenty)); // true

		System.out.println("<<<<<< GREATER THAN OR EQUAL TO OPERATOR >>>>>>");
		System.out.println(" Ten >= Twenty ==> " + (Ten >= Twenty)); // false
		System.out.println(" Twenty >= Ten ==> " + (Twenty >= Ten)); // true
		System.out.println(" Thirty >= Twenty ==> " + (Thirty >= Twenty)); // true

		System.out.println("<<<<<< LESS THAN OPERATOR >>>>>>");
		System.out.println(" Ten < Twenty ==> " + (Ten < Twenty)); // true
		System.out.println(" Twenty < Ten ==> " + (Twenty < Ten)); // false
		System.out.println(" Thirty < Twenty ==> " + (Thirty < Twenty)); // false

		// less than or equal to
		System.out.println("<<<<<< LESS THAN OR EQUAL TO OPERATOR >>>>>>");
		System.out.println(" Ten <= Twenty ==> " + (Ten <= Twenty)); // true
		System.out.println(" Twenty <= Ten ==> " + (Twenty <= Ten)); // false
		System.out.println(" Thirty <= Twenty ==> " + (Thirty <= Twenty)); // false

		// equal to
		System.out.println("<<<<<< EQUAL TO OPERATOR >>>>>>");
		System.out.println(" Ten == Twenty ==> " + (Ten == Twenty)); // false
		System.out.println(" Thirty == Twenty + Ten ==> " + (Thirty == Twenty + Ten)); // true

		// not equal to
		System.out.println("<<<<<< NOT EQUAL TO OPERATOR >>>>>>");
		System.out.println(" Ten != Twenty ==> " + (Ten != Twenty)); // true
		System.out.println(" Thirty != Twenty + Ten ==> " + (Thirty != Twenty + Ten)); // false

		boolean Output_1 = true;
		boolean Output_2 = false;
		System.out.println("Check if both the boolean variables are true : " + (Output_1 && Output_2));
		System.out.println("Check if even one of the boolean varibale is true : " + (Output_1 || Output_2));
		System.out.println("Change the state of the Output_1 to false : " + (!Output_1));

		boolean bValue;
		int iValue;

		bValue = (Thirty == Twenty + Ten) ? true : false;
		System.out.println("The boolean value of the variable 'bValue' is : " + bValue); // true

		iValue = ((Thirty == Twenty + Ten)) ? 50 : 100;
		System.out.println("The int Value of the variable iValue is : " + iValue); // 50

		// This is a use of Not Logical Operator
		iValue = (!(Thirty == Twenty + Ten)) ? 50 : 100;
		System.out.println("The int Value of the variable iValue is : " + iValue); // 100

	}

}
