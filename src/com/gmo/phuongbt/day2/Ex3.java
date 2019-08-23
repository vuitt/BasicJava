package com.gmo.phuongbt.day2;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) throws Exception {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a = ");
		a = sc.nextInt();
		System.out.println("Enter b = ");
		b = sc.nextInt();
		System.out.println("Enter c = ");
		c = sc.nextInt();
		if (a < b + c && b < a + c && c < a + b) {
			System.out.println("Đây là tam giác !");
		}
		if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
			System.out.println("Đây là tam giác vuông.");
		} else if ((a == b) || (b == c) || (c == a)) {
			System.out.println("Đây là tam giác cân.");
		} else if ((a == b) && (b == c) && (c == a)) {
			System.out.println("Đây là tam giác đều.");
		}
	}

}
