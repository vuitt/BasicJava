package com.gmo.tuanlq;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Nhap xau ky tu");
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		String[] b = a.split(" ");
		for(String w: b) {
			System.out.print(w);
		}
				

	}

}
