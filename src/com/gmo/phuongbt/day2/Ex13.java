package com.gmo.phuongbt.day2;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Viết chương trình đọc một giá trị nguyên từ bàn phím và in ra số đó là số
		// chẵn, lẻ hoặc zero

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n =");
		n = sc.nextInt();
		if (n == 0) {
			System.out.println("n = zero.");
		} else if (n % 2 != 0) {
			System.out.println("n la so le.");
		} else {
			System.out.println("n la so chan");
		}

	}

}
