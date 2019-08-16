package com.gmo.yenpt1;

public class Arithmetic_Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b = 10, c = 5;
		a = b + c;
		System.out.println(" Value of 'a' after '+' Arithmetic operator is: " + a);
		a = b - c;
		System.out.println(" Value of 'a' after '-' Arithmetic operator is: " + a);
		a = b * c;
		System.out.println(" Value of 'a' after '*' Arithmetic operator is: " + a);
		a = b / c;
		System.out.println(" Value of 'a' after '/' Arithmetic operator is: " + a);
		a = b % c;
		System.out.println(" Value of 'a' after '%' Arithmetic operator is: " + a);
		b++;
		System.out.println(" Value of 'b' after '++' Arithmetic operator is: " + b);
		c--;
		System.out.println(" Value of 'c' after '--' Arithmetic operator is: " + c);
		--c;
		System.out.println(" Value of 'c' after '--' Arithmetic operator is: " + c);
	}

}
