package com.gmo.vuitt;

public class JavaDay1 {

	public static void main(String[] args) {
// *****DATA TYPES AND VARIABLES*****
//      Sample: Data type - boolean
		boolean TestResult;
		TestResult = true;
		System.out.println("Test Result is: " + TestResult);
		TestResult = false;
		System.out.println("Test Result is: " + TestResult);
//      Sample: Data type - integer
		int carSpeed;
		carSpeed = 20;
		System.out.println("Car is running at the speed of: " + carSpeed);
		carSpeed = carSpeed + 20;
		System.out.println("Current speed of the car is: " + carSpeed);
//      Sample: Data type - char
		char u;
		u = 'P';
		System.out.println("Value of char is: " + u);
//      Sample: Data type - double
		double pi;
		pi = 3.14159;
		System.out.println("pi: " + pi);

//      Exercises: Write a Java program to print “Hello World” on the screen
//		System.out.println("Hello World");
		String h;
		h = "Hello world";
		System.out.println("h = " + h);

//      Exercises: Write a Java program to print the following output:
//      ++++++
//		@@@@@@
//		******
//		######
		System.out.println("+++++");
		System.out.println("@@@@@@");
		System.out.println("*****");
		System.out.println("######");

//		Exercises: Write a Java program to declare three variable  a, b, & c and store the values respectively 10, 20.3 & 3.14785 . Then display their values on the screen.
		int a = 10;
		double b = 20.3;
		double c = 3.14785;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);

//      Exercises: Write a Java program to declare a Boolean variable with initial value of “true” and later change it to “false” before printing it.
		boolean t = true;
		t = false;
		System.out.println("t = " + t);

//*****OPERATORS*****

//      Sample: Operator if-else
		int i = 5;
		if (i % 2 == 0)
			System.out.println("i la so chan");
		else
			System.out.println("i la so le");

//      Sample: Operator ?:
		String a1;
		a1 = (i % 2 == 0) ? "so chan" : "so le";
		System.out.println("Value of a1: " + a1);

//      Sample: Operator switch
//        switch (i) {
//        case 1:
//        	System.out.println("La so 1");
//        	break;
//        case 2:
//        	System.out.println("La so 2");
//        	break;
//        default:
//        	System.out.println("Gia tri default");
//        	break;

//      Sample: Operator do-while
//        int n = 4;
//        do
//        {
//        	System.out.println(n);
//        	n++;
//        } while (n<=5);
//	
		int n = 1;
		int i1 = 1;
		do {
			n *= i;
			i1++;
		} while (i1 <= 5);
		System.out.println("5! = " + n);

	}
}
