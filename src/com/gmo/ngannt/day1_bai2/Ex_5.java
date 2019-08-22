package com.gmo.ngannt.day1_bai2;

import java.util.Scanner;

public class Ex_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Nhập n. Nếu n > 5 thì +2 v�? trả v�? n. Ngược lại trả v�? 0
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập s�? n: ");
		int n = sc.nextInt();
		if (n > 5)
			System.out.println("S�? vừa nhập lớn hơn 5 nên được tăng lên 2 đơn v�?: " + (n + 2));
		else
			System.out.println("S�? vừa nhập bé hơn 5 nên được trả v�? 0: 0");

	}

}
