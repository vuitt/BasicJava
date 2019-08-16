package com.gmo.tuanlq;

import java.util.Scanner;



public class Exercise_14 extends Exercise{
	
	public void printMultiplesOfN(Scanner sc) {
		int n = 0;
		int k = 0;
		System.out.println("<========== BAI 14 ==========>");
		System.out.print("BAN MUON IN DAY SO LA BOI SO CUA n = ");
		n = getInputInteger(sc);
		System.out.print("BOI SO CUA " + n + " TU 300 -> 3 : ");
		System.out.println("");
		for (int i = 300; i > 0; i--) {
			if (isMultiplesOfN(i, n)) {
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
