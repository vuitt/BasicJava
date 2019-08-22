package com.gmo.ngannt.day1_bai2;

import java.util.Scanner;

public class Ex_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Giải phương trình bậc 1, với a, b nhập từ b�?n phím
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập hệ số của phương trình bậc nhất");
		System.out.println("Nhập hệ số a: ");
		int a = sc.nextInt();
		System.out.println("Nhập hệ số b: ");
		int b = sc.nextInt();
		double x = (double) -b / a;
		if (a == 0)
			if (b == 0)
				System.out.println("Phương trình có vô số nghiệm");
			else
				System.out.println("Phương trình vô nghiệm");
		else
			System.out.println("Phương trình có nghiệm x= " + x);
	}

}
