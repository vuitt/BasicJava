package com.gmo.ngannt.day1_bai2;

import java.util.Scanner;

public class Ex_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// In ra tổng 1+2+3+...+n. N nhập từ b�?n phím
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập v�?o s�? phần tử của dãy s�?: ");
		int n = sc.nextInt();
		int array[] = new int[n];
		int tong = 0;

		System.out.println("Nhập phần tử v�?o dãy s�?: ");
		for (int i = 0; i < n; i++) {

			System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
			array[i] = sc.nextInt();
		}

		System.out.println("Dãy s�? vừa nhập từ b�?n phím: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + "\t");
			System.out.print("\n");
			tong += array[i];
		}

		System.out.println("Tổng của dãy s�? vừa nhập: " + tong);
	}

}
