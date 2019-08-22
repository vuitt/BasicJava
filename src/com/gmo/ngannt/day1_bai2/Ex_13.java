package com.gmo.ngannt.day1_bai2;

import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Đọc giá tr�? nhập từ b�?n phím. In ra l�? s�? chẵn, lẽ hay zero

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên: ");
		int n = sc.nextInt();
		System.out.println("Số vừa nhập: " + n);
		if (n == 0)
			System.out.println("Số vừa nhập  zero");
		else {
			if (n % 2 == 0)
				System.out.println("S�? vừa nhập l�? s�? chẵn");
			else
				System.out.println("S�? vừa nhập l�? s�? lẽ");
		}
	}

}
