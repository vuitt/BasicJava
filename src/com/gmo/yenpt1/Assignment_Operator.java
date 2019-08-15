package com.gmo.yenpt1;

public class Assignment_Operator {
	static int speed = 80;
	static int distance = 20;
	static int time = 10;
	static String name = "ToolsQA";
	static boolean isGood = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Value stored in the speed variable is:" + speed);
		System.out.println("Value stored in the distance variable is:" + distance);
		System.out.println("Value stored in the time variable is:" + time);
		System.out.println("Value stored in the time variable is:" + name);
		System.out.println("Value stored in the isGood variable is:" + isGood);

		speed = 100;
		time = distance;
		name = "ForumsQA";
		isGood = false;
		System.out.println("Value stored in the speed variable is:" + speed);
		System.out.println("Value stored in the distance variable is:" + distance);
		System.out.println("Value stored in the time variable is:" + time);
		System.out.println("Value stored in the time variable is:" + name);
		System.out.println("Value stored in the isGood variable is:" + isGood);

		speed = distance = 0;
		System.out.println("Value stored in the speed variable is:" + speed);
	}

}
