package com.gmo.phuongbt.day2;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap vao so thu nhat: ");
		x = sc.nextInt();
		System.out.println("nhap vao so thu hai: ");
		y = sc.nextInt();
		System.out.println("tong cua hai so cua nhap la: " + (x + y));
		System.out.println("hieu cua hai so vua nhap la: " + (x - y));
		System.out.println("tich cua hai so vua nhap la: " + (x * y));
		System.out.println("thuong cua hai so vua nhap la: " + (float) x / y);
	}

}
