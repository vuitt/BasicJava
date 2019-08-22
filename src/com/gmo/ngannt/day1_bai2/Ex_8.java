package com.gmo.ngannt.day1_bai2;

public class Ex_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// xuất ra tổng các bội s�? của 7 từ 1 đến 100
		int tong = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0)
				tong += i;
		}
		System.out.println("Tổng các bội s�? của 7 từ 1 đến 100: " + tong);
	}

}
