package com.gmo.ngannt.day1_bai2;

import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Nhập s�? n. Nếu l�? chẵn thì gấp đôi giá tr�?
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập v�?o s�? nguyên n: ");
		int n = sc.nextInt();
		if (n % 2 == 0)
			System.out.println("S�? vừa nhập l�? s�? chẵn nên được nhân đôi: " + n * 2);
		else
			System.out.println("S�? vừa nhập l�? s�? lẽ nên không thay đổi: " + n);
	}

}
