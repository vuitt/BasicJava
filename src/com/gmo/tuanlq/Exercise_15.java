package com.gmo.tuanlq;

import java.util.ArrayList;
import java.util.Scanner;



public class Exercise_15 extends Exercise{
	
	public void countNumberCharacters(Scanner sc) {
		int n = 0;
		int k = 0;
		System.out.println("<========== BAI 15 ==========>");
		System.out.println("NHAP VAO SAU KY TU: ");
		String a = sc.nextLine();		
		System.out.println("==> SO TU CUA SAU DO LA: " + getNumberArray(a.split(" ")));
		System.out.println("<============================>");
	}
}
