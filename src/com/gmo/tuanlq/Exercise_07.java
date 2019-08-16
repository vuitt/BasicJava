package com.gmo.tuanlq;

import java.util.Scanner;



public class Exercise_07 extends Exercise {

	public void printOddNumber() {
		int k = 0;
		System.out.println("<========== BAI 7 =============>");
		System.out.println("==> So le tu 1 -> 99: ");
		for(int i = 1; i < 100; i++) {
			if(isOddNumber(i)) {
				System.out.print(i + " ");
				k++;
				if (k % 10 == 0) {
					System.out.println("");
				}
			}
		}
		System.out.println("");
		System.out.println("<============================>");
	}
}
