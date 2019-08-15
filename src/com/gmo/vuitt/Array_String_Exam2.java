package com.gmo.vuitt;

import java.util.HashMap;
import java.util.Scanner;

public class Array_String_Exam2 {
	static Scanner sc = new Scanner(System.in);
	public static final char SPACE = ' ';
	public static final char TAB = '\t';
	public static final char BREAK_LINE = '\n';

	public static void main(String[] args) {

		// 2. Nhap vao 1 xau ky tu. Liet ke so lan xuat hien cua cac tu trong xau do
		System.out.println("******Exercise2******");
		
		System.out.println("Nhap chuoi: ");
		String str = sc.nextLine();
		System.out.println(str);
		System.out.println("---------------------------------");

		// Liet ke so lan xuat hien cua cac tu trong chuoi
		System.out.println("So lan xuat hien cua cac tu trong chuoi la: ");
		HashMap<String, Integer> wordMap = countWords(str);
		for (String key : wordMap.keySet()) {
			System.out.print(key + " " + wordMap.get(key) + "\n");
		}
	}

	private static HashMap<String, Integer> countWords(String input) {

		// khoi tao wordMap
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
		if (input == null) {
			return wordMap;
		}
		int size = input.length();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < size; i++) {
			if (input.charAt(i) != SPACE && input.charAt(i) != TAB && input.charAt(i) != BREAK_LINE) {
				// build mot tu
				sb.append(input.charAt(i));
			} else {
				// them tu vao wordMap
				addWord(wordMap, sb);
				sb = new StringBuilder();
			}
		}
		// them tu cuoi cung tim duoc vao wordMap
		addWord(wordMap, sb);
		return wordMap;
	}

	public static void addWord(HashMap<String, Integer> wordMap, StringBuilder sb) {
		String word = sb.toString();
		if (word.length() == 0) {
			return;
		}
		if (wordMap.containsKey(word)) {
			int count = wordMap.get(word) + 1;
			wordMap.put(word, count);
		} else {
			wordMap.put(word, 1);
		}
	}
}