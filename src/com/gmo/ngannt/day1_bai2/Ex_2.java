package com.gmo.ngannt.day1_bai2;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// nh·∫≠p s·ª? b·∫•t k·ª≥. Ki·ªÉm tra ch·∫µn l·∫Ω v√? in ra m√?n h√¨nh
		Scanner sc = new Scanner(System.in);
		System.out.println("Nh·∫≠p s·ª?: ");
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println(n + " l√? s·ª? ch·∫Øn");
		} else
			System.out.println(n + " l√? s·ª? l·∫Ω");
	}

}
