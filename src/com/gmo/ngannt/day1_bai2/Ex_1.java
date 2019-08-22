package com.gmo.ngannt.day1_bai2;

import java.util.Scanner;

public class Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Nhập x v�? y. In ra tổng, hiệu, tích, thương

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập x: ");
		int x = sc.nextInt();
		System.out.println("Nhập y: ");
		int y = sc.nextInt();
		System.out.println("Tổng x v�? y = " + (x + y));
		System.out.println("Hiệu x v�? y = " + (x - y));
		System.out.println("Tích x v�? y = " + (x * y));
		System.out.println("Thương x v�? y = " + (x / y));
	}

}
