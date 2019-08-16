package com.gmo.tuanlq;

import java.util.ArrayList;
import java.util.Scanner;



public class Exercise_16 extends Exercise{
	
	public void countNumberCharacters(Scanner sc) {
		String s1 = "";
		String s2 = "";
		System.out.println("<========== BAI 16 ==========>");
		System.out.println("KIEM TRA SAU KY TU S1 CO CHUA S2 KHONG?");
		System.out.print("NHAP VAO SAU KY TU s1: " +s1 );
		s1 = getInputCharacter(sc);
		System.out.print("NHAP VAO SAU KY TU s2: " +s2 );
		s2 = getInputCharacter(sc);
		System.out.println("s1: " + s1 );
		System.out.println("s2: " + s2 );		
		if(isInclue(s1, s2)) {
			System.out.println("SAU S1 CO CHUA S2");
		}else
			System.out.println("SAU S1 KHONG CHUA S2");
		System.out.println("<============================>");
	}
}
