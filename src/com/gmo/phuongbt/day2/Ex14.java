package com.gmo.phuongbt.day2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Viết chương trình in ra bội số của 3 từ 300 đến 3
		int n, number;
		Random rd = new Random();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập số phần tử của arrList: ");
		n = scanner.nextInt();
		ArrayList<Integer> arrList = new ArrayList<>(n);

		for (int i = 0; i < n; i++) {
			number = 3 + rd.nextInt(298);
			arrList.add(number);
		}

		for (int i = 0; i < n; i++) {
			if (arrList.get(i) % 3 == 0) {
				System.out.print(arrList.get(i) + "\t");
			}
		}
	}

}
