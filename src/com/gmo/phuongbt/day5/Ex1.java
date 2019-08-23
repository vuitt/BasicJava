package com.gmo.phuongbt.day5;

public class Ex1 {

	public static final char SPACE = ' ';
	public static final char TAB = '\t';
	public static final char BREAK_LINE = '\n';

	public static void main(String[] args) {
		String str = "hoc java     co ban den nang cao" + "      \n test";
		System.out.print("Số từ của chuỗi đã cho là: " + countWords(str));
	}

	public static int countWords(String input) {
		if (input == null) {
			return -1;
		}
		int count = 0;
		boolean notCounted = true;
		for (int i = 0; i < input.length(); i++) {
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
