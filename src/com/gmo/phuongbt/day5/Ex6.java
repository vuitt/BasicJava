package com.gmo.phuongbt.day5;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "Sweet But Psycho - Ava Max 1";
		String str2 = "Sweet But Psycho - Ava Max 2";

		System.out.println("String 1: " + str1);
		System.out.println("String 2: " + str2);

		int result = str1.compareToIgnoreCase(str2);

		if (result < 0) {
			System.out.println("\"" + str1 + "\"" + " nhỏ hơn " + "\"" + str2 + "\"");
		} else if (result == 0) {
			System.out.println("\"" + str1 + "\"" + " bằng " + "\"" + str2 + "\"");
		} else {
			System.out.println("\"" + str1 + "\"" + " lớn hơn " + "\"" + str2 + "\"");
		}
	}

}
