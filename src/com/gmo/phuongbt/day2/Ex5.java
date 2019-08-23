package com.gmo.phuongbt.day2;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Nhập vào số nguyên n. Nếu n>5 thì tăng n lên 2 đơn vị và trả về giá trị n,
		// ngược lại trả về giá trị 0

		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n = ");
		n = sc.nextInt();
		if (n > 5) {
			n = n + 2;
			System.out.println("Gia tri n = " + n);
		} else {
			n = n - n;
			System.out.println(n);
		}

	}

}
