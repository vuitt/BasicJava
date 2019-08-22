package com.gmo.ngannt.day1_bai2;

import java.util.Scanner;

public class Ex_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// n được nhập từ b�?n phím. In ra tổng 1+3+5+...+n nếu n l�? s�? chắn
		// 2+4+6+...+n nếu n l�? s�? lẻ
		int tong = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập s�? nguyên n= ");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			for (int i = 1; i <= n; i++) {
				if (i % 2 != 0) {
					tong += i;
				}
			}
			System.out.println("n l�? s�? chẵn nên có tổng: " + tong);
		} else {

			for (int i = 1; i <= n; i++) {
				if (i % 2 == 0) {
					tong += i;
				}
			}
			System.out.println("n l�? s�? chẵn nên có tổng: " + tong);

		}
	}

}
