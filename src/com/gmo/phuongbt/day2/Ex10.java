package com.gmo.phuongbt.day2;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tong = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên n= ");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			for (int i = 1; i <= n; i++) {
				if (i % 2 != 0) {
					tong += i;
				}
			}
			System.out.println("n là số chẵn nên có tổng: " + tong);
		} else {

			for (int i = 1; i <= n; i++) {
				if (i % 2 == 0) {
					tong += i;
				}
			}
			System.out.println("n là số chẵn nên có tổng: " + tong);

		}
	}

}
