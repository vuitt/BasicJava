package com.gmo.phuongbt.day2;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Nhập vào số nguyên n. Xuất ra n màn hình (Nếu n chẵn thì gấp đôi giá trị).

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n = ");
		n = sc.nextInt();
		if (n % 2 == 0) {
			n = n * n;
			System.out.println("Sau khi da gap doi gia tri n = " + n);
		} else {
			System.out.println("n da nhap = " + n);
		}

	}

}
