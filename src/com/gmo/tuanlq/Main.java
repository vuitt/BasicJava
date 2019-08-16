package com.gmo.tuanlq;

import java.util.Scanner;

public class Main {
	protected static  Scanner sc;
	public Main(Scanner sc) {
		
		this.sc = new Scanner(System.in);
		
	}
	
	protected int getInputIntegerExceptionExcercise(Scanner sc) {
		boolean check = true;
		int n = 0;
		do {
			try {
				n = sc.nextInt();
				if((n >= 1) && (n <= 22)) {
				check = false;
				} else {
					System.out.println("VUI LONG NHAP SO BAI TAP TU 1 -> 22");
					check = true;
				}
			} catch (Exception e) {
				System.out.println("VUI LONG NHAP SO NGUYEN TU 1 -> 22");
				sc.nextLine();
			}

		} while (check);

		return n;
	}
	
	protected int getInputIntegerExceptionContinue(Scanner sc) {
		boolean check = true;
		int n = 0;
		do {
			try {
				n = sc.nextInt();
				if((n == 1) || (n == 0)) {
				check = false;
				} else {
					System.out.println("VUI LONG NHAP SO NGUYEN O HOAC 1");
					check = true;
				}
			} catch (Exception e) {
				System.out.println("VUI LONG KHONG NHAP KY TU KHAC 0 VA 1");
				sc.nextLine();
			}

		} while (check);

		return n;
	}
	
	protected String getInputChar(Scanner sc) {
		boolean check = true;
	    String n = "" ;
		do {
			try {
				n = sc.next();
				if(n.length()==1 && (n.equals("Y") || n.equals("y") || n.equals("n")||n.equals("N")) ){
				check = false;
				} else if(n.length() > 1) {
					System.out.println("VUI LONG NHAP MOT KY TU Y HOAC N");
					check = true;
				}
				else {
					System.out.println("VUI LONG NHAP DUNG KY TU Y HOAC N");
					check = true;
				}
			} catch (Exception e) {
				System.out.println("VUI LONG NHAP KY TU Y HOAC N");
				sc.nextLine();
			}

		} while (check);

		return n;
	}
}
