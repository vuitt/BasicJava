package com.gmo.phuongbt.day2;

public class Ex6 {

	public static void main(String[] args) {

		// Viết chương trình in ra tổng của 10 số chẵn đầu tiên (sử dụng vòng lặp for
		// hoặc while)

		int tongchan = 0;
		for (int i = 0; i < 10; i++) {
			tongchan += i * 2;
		}
		System.out.println("Tổng 10 số chẵn đầu tiên là: " + tongchan);
	}
}
