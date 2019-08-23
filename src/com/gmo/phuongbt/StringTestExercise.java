package com.gmo.phuongbt;

public class StringTestExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String webSite = "phuong.com";
		System.out.println(webSite);

		char[] webSiteName = { 'P', 'H', 'U', 'O', 'N', 'G' };
		String webSite1 = new String(webSiteName);
		System.out.println(webSite1);

		String str = "String Test Exercise";
		int iLength = str.length();
		System.out.println("String = " + str);
		System.out.println("Length of string = " + iLength);
		
		
	}

}
