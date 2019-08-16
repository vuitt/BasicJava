package com.gmo.tuanlq;

import java.util.Scanner;



public class Exercise_09 extends Exercise {

	public void sumNumberToN(Scanner sc) {
		int sum = 0;
		int n = 0;
		System.out.println("<========== BAI 9 =============>");
		System.out.print("HAY NHAP n DE THUC HIEN TINH TONG 1 + 2 + 3 +...+ n: n = ");
		n = getInputInteger(sc);
		for(int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.print("==> Tong cac so tu 1 -> " + n + " : " + sum);
		System.out.println("");
		System.out.println("<============================>");
	}
}
