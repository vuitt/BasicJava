package com.gmo.phuongbt.day2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Viết chương trình in ra tổng 1+2+3….+n với n được nhập từ tham số command
		// line

		int n;
		double number, sum = 0;
		ArrayList<Double> arrListDouble = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập vào số phần tử của ArrayList: ");
		n = scanner.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			number = scanner.nextDouble();
			arrListDouble.add(number);
		}

		// tính tổng các phần tử của arrListDouble
		for (double element : arrListDouble) {
			sum += element;
		}
		System.out.println("Tổng của các phần tử trong arrListDouble = " + sum);

	}

}
