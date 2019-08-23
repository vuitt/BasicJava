package com.gmo.phuongbt.day2;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Viết chương trình xuất ra tổng các số là bội số của 7 (từ 1 đến 100)

		int tongSo = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 7 == 0) {
				tongSo += i;				
			}		
		}
		System.out.println(tongSo);

	}

}
