package com.gmo.phuongbt.day2;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ax+b=0
		int a, b;
		double nghiem;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a = ");
		a = sc.nextInt();
		System.out.println("Enter b = ");
		b = sc.nextInt();
		if (a == 0) {
			if (b == 0) {
				System.out.println("Phuong trinh co vo so nghiem.");
			} else {
				System.out.println("Phuong trinh vo nghiem");
			}
		} else {
			nghiem = -b / a;
			System.out.println("Phuong trinh co nghiem = " + nghiem);
		}

	}

}
