package com.gmo.tuanlq;

import java.util.Scanner;



public class Exercise_13 extends Exercise{
	
	public void checkNumberExtend(Scanner sc) {
		int n = 0;
		System.out.println("<========== BAI 13 ===========>");
		System.out.print("Nhap vao so nguyen n = ");
		n = getInputInteger(sc);
		
		if(isEvenNumber(n) && n != 0) {
			System.out.println("==> " + n + " la so chan");
		}
		else if(n == 0){
			System.out.println("==> " + n + " la zero");
		}
		else
		{
			System.out.println("==> " + n + " la so le");
		}
		System.out.println("<============================>");
	}
}
