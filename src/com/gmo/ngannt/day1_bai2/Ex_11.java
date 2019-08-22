package com.gmo.ngannt.day1_bai2;

import java.util.Scanner;

public class Ex_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// in ra giá tr�? lớn nhất v�? nh�? nhất trong dãy s�? được nhập
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập s�? phần tử của dãy s�?: ");
		int n = sc.nextInt();
		int array[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
			array[i] = sc.nextInt();
		}
		int max = array[0];
		int min = array[0];
		System.out.println("Dãy s�? vừa nhập: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + "\t");
			if (max < array[i])
				max = array[i];
			if (min > array[i])
				min = array[i];
		}
		System.out.println("\nS�? lớn nhất của dãy s�? vừa nhập: " + max);
		System.out.println("S�? bé nhất của dãy s�? vừa nhập: " + min);
	}

}
