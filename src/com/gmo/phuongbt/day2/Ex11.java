package com.gmo.phuongbt.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Viết chương trình in ra giá trị lớn nhất và nhỏ nhất trong một dãy các giá
		// trị user đã nhập vào từ tham số command line.
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so phan tu cua mang = ");
		n = sc.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < n; i++) {
			int x = i + 1;
			System.out.println("Nhap gia tri cua phan tu thu " + x + " :");
			arr[i] = sc.nextInt();
		}
		int min = arr[0];
		int max = arr[0];
		for (int i = 0; i < n; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Min = " + min);
		System.out.println("Max = " + max);
	}

}
