package com.gmo.tuanlq;

import java.util.ArrayList;
import java.util.Scanner;



public class Exercise_11 extends Exercise {

	public void findMaxAndMin(Scanner sc) {
		int n = 0;
		System.out.println("<========== BAI 11 ===========>");
		System.out.print("HAY NHAP SO LUONG CHU SO TRONG DAY n : ");
		n = getInputInteger(sc);
		ArrayList<Integer> a = new ArrayList<>();
		a = getListInput(sc, n);
		System.out.println("==> GIA TRI MAX: " + getNumberMax(a) );
		System.out.println("==> GIA TRI MIN: " + getNumberMin(a) );
		System.out.println("<============================>");
		
	}
}
