package com.gmo.tuanlq;

import java.util.ArrayList;
import java.util.Scanner;



public class Exercise_17 extends Exercise{
	
	public void getCharterFromString(Scanner sc) {
		String s1 = "";
		int a = 0;
		System.out.println("<========== BAI 17 ==========>");
		System.out.println("LAY KY TU TAI MOT VI TRI NAO DO TRONG CHOI STRING");
		System.out.print("NHAP VAO SAU KY TU: ");
		s1 = sc.next();
		System.out.println("NHAP VAO VI TRI CAN LAY KY TU: ");
		a = getInputInteger(sc);	
		System.out.println("KY TU TAI VI TRI " + a + " CUA CHUOI " + s1 + " LA: " + s1.charAt(a-1));
		System.out.println("<============================>");
	}
}
