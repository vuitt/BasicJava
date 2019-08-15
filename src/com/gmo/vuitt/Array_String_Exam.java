package com.gmo.vuitt;

import java.util.Scanner;

public class Array_String_Exam {
	static Scanner sc = new Scanner(System.in);
	public static final char SPACE = ' ';
	public static final char TAB = '\t';
	public static final char BREAK_LINE = '\n';

	public static void main(String[] args) {
//1. Nhap vao 1 xau ky tu, dem so ky tu cua xau do (moi tu cach nhau boi mot khoang trang co the la 1 hoac nhieu dau cach, tab, xuong dong)
		System.out.println("****** Exercise 1******");
		
		System.out.println("Nhap chuoi: ");
		String str = sc.nextLine();
		System.out.print("So tu trong chuoi tren la: " + countWords(str));
	}

	private static int countWords(String input) {
		if (input == null) {
			return -1;
		}
		int count = 0;
		int size = input.length();
		boolean notCounted = true;
		for (int i = 0; i < size; i++) {
			if (input.charAt(i) != SPACE && input.charAt(i) != TAB && input.charAt(i) != BREAK_LINE) {
				if (notCounted) {
					count++;
					notCounted = false;
				}
			} else {
				notCounted = true;
			}
		}
		return count;
	}
}
