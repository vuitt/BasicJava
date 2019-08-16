package com.gmo.tuanlq;

import java.util.Scanner;



public class Exercise_01 extends Exercise{
	
	public void caculateNumber(Scanner sc) {
		int x = 0;
		int y = 0; 
		System.out.println("<==========BAI 1=============>");
		System.out.print("Nhap vao x = ");
		x = getInputInteger(sc);
		System.out.print("Nhap vao y = ");
		y = getInputIntegerExtend(sc, "y");	
		System.out.println("==> x = " + x + " va y = " + y);
		System.out.println("==> x + y = " + sumNumber(x, y));
		System.out.println("==> x - y = " + subNumber(x, y));
		System.out.println("==> x * y = " + multipNumber(x, y));
		System.out.println("==> x / y = " + divNumber(x, y));
		System.out.println("<============================>");
	
	}
}
