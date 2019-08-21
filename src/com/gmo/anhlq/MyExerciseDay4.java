package com.gmo.anhlq;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class MyExerciseDay4 {

	public static void main(String[] args) {

		// ex1
		String s1 = getStringInput();
		System.out.println("Tổng số từ trong chuỗi = " + countWords(s1));

		// ex2
		String s2 = getStringInput();
		HashMap<String, Integer> results = countChars(s2);
		printOutCountChars(results);

		// ex8
		int[] arr = getIntegerArray();
		System.out.println("Phần tử bé nhất trong mảng = " + min(arr));
		System.out.println("Phần từ lớn nhất trong mảng = " + max(arr));
		System.out.println("Số các phần từ là số chẵn trong mảng = " + countEven(arr));
		System.out.print("Các số nguyên tố trong mảng là: ");
		ArrayList<Integer> primes = getPrimes(arr);
		for (int p : primes) {
			System.out.print(p + "  ");
		}
		System.out.println();
		System.out.print("Mảng sau khi được sắp xếp: ");
		sortAsc(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	//nhập chuỗi đến khi hợp lệ
	public static String getStringInput() {
		Scanner input = new Scanner(System.in);
		boolean b = true;
		String s = "";
		while (b) {
			System.out.print("Nhập chuỗi: ");
			s = input.nextLine();
			if (!s.trim().isEmpty()) {
				b = false;
				continue;
			}
			System.out.println("Chuỗi rỗng. Vui lòng nhập lại");
		}
		return s;
	}
	
	//nhập 1 mảng Integer
	public static int[] getIntegerArray() {
		System.out.print("Nhập tổng số kí tự trong mảng: ");
		int n = getIntegerInput();
		if (n <= 0)
			return null;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử " + (i + 1) + ": ");
			int number = getIntegerInput();
			arr[i] = number;
		}
		return arr;
	}
	
	//nhập số nguyên đến khi hợp lệ
	public static int getIntegerInput() {
		Scanner input = new Scanner(System.in);
		boolean b = true;
		int i = 0;
		while (b) {
			input = new Scanner(System.in);
			try {
				i = input.nextInt();
				b = false;
			} catch (InputMismatchException e) {
				System.out.print("Không phải số nguyên. Nhập lại: ");
			}
		}
		return i;
	}

	// ex1
	public static int countWords(String w) {
		w = w.trim();
		if (w == null || w.isEmpty())
			return 0;
		String[] arrayWords = w.split("\\s+");
		int size = arrayWords.length;
		return size;
	}

	// ex2
	public static HashMap<String, Integer> countChars(String s) {
		s = removeSpaces(s);
		if (s == null || s.isEmpty())
			throw new NullPointerException("Chuỗi rỗng: Không thể đếm kí tự");
		HashMap<String, Integer> results = new HashMap<String, Integer>();
		char[] arrChars = s.toCharArray();
		for (int i = 0; i < arrChars.length; i++) {
			char c = arrChars[i];
			String key = Character.toString(c).toLowerCase();
			if (!results.containsKey(key)) {
				int count = 1;
				results.put(key, count);
				continue;
			}
			int count = results.get(key);
			results.put(key, count + 1);
		}
		return results;
	}

	public static void printOutCountChars(HashMap<String, Integer> results) {
		if (results == null || results.isEmpty())
			System.out.println("HashMap rỗng");
		Set<String> keys = results.keySet();
		for (String key : keys) {
			System.out.println(key + " - " + results.get(key));
		}
	}

	public static String removeSpaces(String s) {
		s = s.trim();
		if (s == null || s.isEmpty())
			throw new NullPointerException("Chuỗi rỗng: Không thể đếm kí tự");
		String results = "";
		String[] arrStr = s.split("\\s+");
		for (String str : arrStr) {
			results = results.concat(str);
		}
		return results;
	}

	// ex3
	public static boolean isContain(String s1, String s2) {
		s1 = s1.trim();
		s2 = s2.trim();
		if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty())
			throw new NullPointerException("MyExerciseDay4<isContain>: s1 và/hoặc s2 rỗng");
		return s1.contains(s2);
	}

	// ex4
	public static String getCharByIndex(String s, int index) {
		return null;
	}

	// ex5
	public static int compareStr(String s1, String s2) {
		s1 = s1.trim();
		s2 = s2.trim();
		if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty())
			throw new NullPointerException("MyExerciseDay4<compareStr>: s1 và/hoặc s2 rỗng");
		return s1.compareTo(s2);
	}

	// ex6
	public static int compareStrIgnoreCase(String s1, String s2) {
		s1 = s1.trim();
		s2 = s2.trim();
		if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty())
			throw new NullPointerException("MyExerciseDay4<compareStrIgnoreCase>: s1 và/hoặc s2 rỗng");
		return s1.compareToIgnoreCase(s2);
	}

	// ex7
	public static String concatStr(String s1, String s2) {
		s1 = s1.trim();
		s2 = s2.trim();
		if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty())
			throw new NullPointerException("MyExerciseDay4<compareStrIgnoreCase>: s1 và/hoặc s2 rỗng");
		String s = s1.concat(s2);
		return s;
	}

	// ex8
	public static int min(int[] arr) {
		if (arr == null || arr.length == 0)
			throw new NullPointerException("MyExerciseDay4<min>: Mảng rỗng");
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int max(int[] arr) {
		if (arr == null || arr.length == 0)
			throw new NullPointerException("MyExerciseDay4<max>: Mảng rỗng");
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int countEven(int[] arr) {
		if (arr == null || arr.length == 0)
			throw new NullPointerException("MyExerciseDay4<countEven>: Mảng rỗng");
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				count++;
		}
		return count;
	}

	public static ArrayList<Integer> getPrimes(int[] arr) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (isPrime(arr[i]))
				primes.add(arr[i]);
		}
		return primes;
	}

	public static boolean isPrime(int number) {
		if (number == 0 || number == 1)
			return false;
		int count = 0;
		for (int i = 2; i <= number; i++) {
			if (number % i == 0)
				count++;
		}
		return (count <= 1);
	}

	public static void sortAsc(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
