package com.gmo.anhlq.operators;

public class MyDemo {
	// Normal Assignment
	static int speed = 80; // speed variable gets the value 80
	static int distance = 20; // distance variable gets the value 20
	static int time = 10; // time variable gets the value 10
	static String name = "ToolsQA"; // name variable gets the value ToolsQA
	static boolean isGood = true; // isGood variable gets the value true

	public static void main(String[] args) {

		System.out.println("Value stored in the speed variable is : " + speed);
		System.out.println("Value stored in the distance variable is : " + distance);
		System.out.println("Value stored in the time variable is : " + time);
		System.out.println("Value stored in the name variable is : " + name);
		System.out.println("Value stored in the isGood variable is : " + isGood);

		speed = 100; // Previous value of speed is overwritten with 100
		time = distance; // Previous value of time is overwritten with distance value
		name = "ForumsQA"; // Previous value of name is overwritten with ForumsQA
		isGood = false; // Previous value of isGood is overwritten with false
		System.out.println("Value stored in the speed variable is : " + speed);
		System.out.println("Value stored in the time variable is : " + time);
		System.out.println("Value stored in the name variable is : " + name);
		System.out.println("Value stored in the isGood variable is : " + isGood);

		// Multiple Assignments
		speed = distance = 0; // 100 (20 = 0)
		System.out.println("Value stored in the speed variable is : " + speed);

		// Illegal Assignments - Compile time errors
//		 speed = "ToolsQA"; //String can not be assign to integer
//		 name = 10; // Integer can not be assign to String
//		 isGood = "ToolsQa" // String can not be assign to Boolean

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

		int ten = 10;
		int twenty = 20;
		int thirty = 30;

		System.out.println("<<<<<< GREATER THAN OPERATOR >>>>>>");
		System.out.println(" ten > twenty ==> " + (ten > twenty)); // false
		System.out.println(" twenty > ten ==> " + (twenty > ten)); // true
		System.out.println(" thirty > twenty ==> " + (thirty > twenty)); // true

		System.out.println("<<<<<< GREATER THAN OR EQUAL TO OPERATOR >>>>>>");
		System.out.println(" ten >= twenty ==> " + (ten >= twenty)); // false
		System.out.println(" twenty >= ten ==> " + (twenty >= ten)); // true
		System.out.println(" thirty >= twenty ==> " + (thirty >= twenty)); // true

		System.out.println("<<<<<< LESS THAN OPERATOR >>>>>>");
		System.out.println(" ten < twenty ==> " + (ten < twenty)); // true
		System.out.println(" twenty < ten ==> " + (twenty < ten)); // false
		System.out.println(" thirty < twenty ==> " + (thirty < twenty)); // false

		// less than or equal to
		System.out.println("<<<<<< LESS THAN OR EQUAL TO OPERATOR >>>>>>");
		System.out.println(" ten <= twenty ==> " + (ten <= twenty)); // true
		System.out.println(" twenty <= ten ==> " + (twenty <= ten)); // false
		System.out.println(" thirty <= twenty ==> " + (thirty <= twenty)); // false

		// equal to
		System.out.println("<<<<<< EQUAL TO OPERATOR >>>>>>");
		System.out.println(" ten == twenty ==> " + (ten == twenty)); // false
		System.out.println(" thirty == twenty + ten ==> " + (thirty == twenty + ten)); // true

		// not equal to
		System.out.println("<<<<<< NOT EQUAL TO OPERATOR >>>>>>");
		System.out.println(" ten != twenty ==> " + (ten != twenty)); // true
		System.out.println(" thirty != twenty + ten ==> " + (thirty != twenty + ten)); // false

		boolean output1 = true;
		boolean output2 = false;
		System.out.println("Check if both the boolean variables are true : " + (output1 && output2));
		System.out.println("Check if even one of the boolean varibale is true : " + (output1 || output2));
		System.out.println("Change the state of the Output_1 to false : " + (!output1));
	}
}
