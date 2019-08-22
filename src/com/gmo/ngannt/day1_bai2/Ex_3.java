package com.gmo.ngannt.day1_bai2;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Nhập v�?o 3 cạnh của tam giác. Xuất ra loại của tam giác
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập 3 cạnh của tam giác: ");
		System.out.println("Nhập cạnh thứ nhất: ");
		float a = sc.nextFloat();
		System.out.println("Nhập cạnh thứ 2: ");
		float b = sc.nextFloat();
		System.out.println("Nhập cạnh thứ 3: ");
		float c = sc.nextFloat();

		if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
			System.out.println("Tam giác được tạo bởi 3 cạnh trên l�? tam giác vuông");
		} else if (a == b || a == c || b == c) {
			System.out.println("Tam giác được tạo bởi 3 cạnh trên l�? tam giác cân");
		} else if ((a == b) && (b == c) && (c == a))
			System.out.println("Tam giác được tạo bởi 3 cạnh trên l�? tam giác đều");
		else if ((a + b > c) || (a + c > b) || (b + c > a))
			System.out.println("Tam giác được tạo bởi 3 cạnh trên l�? tam giác thường");

	}

}
