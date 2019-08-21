package com.gmo.anhlq;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyExerciseDay2 {

	public static void main(String[] args) {

		// ex1
//		System.out.print("Nhập a: ");
//		double a = getDoubleInput();
//		System.out.print("Nhập b: ");
//		double b = getDoubleInput();
//		System.out.println("Tổng = " + sum(a, b));
//		System.out.println("Hiệu = " + sub(a, b));
//		System.out.println("Tích = " + mul(a, b));
//		try {
//			double div = div(a, b);
//			System.out.println("Thương = " + div);
//		} catch (ArithmeticException e) {
//			System.out.println("Thương = Lỗi => Không thể chia cho 0");
//		}
		// ex2
//		System.out.print("Nhập a: ");
//		int a = getIntegerInput();
//		if(isEven(a))
//			System.out.println(a + " là số chẵn");
//		else
//			System.out.println(a + " là số lẻ");

		// ex4
//		System.out.print("Nhập a: ");
//		int a = getIntegerInput();
//		if(isEven(a))
//			System.out.println(a + " là số chẵn. Giá trị x2 = " + (a*2));
//		else
//			System.out.println(a + " là số lẻ. Không x2 giá trị");

		// ex5
//		System.out.print("Nhập a: ");
//		int a = getIntegerInput();
//		System.out.println(getInt(a));

		printOutEven(11);

		printOutOdd(1, 99);

		printOutBoiSo(1, 100, 7);

		printOutBoiSo(3, 300, 3);
		
		System.out.println(sumLienTiep(9));
		
		System.out.println(sumChanLe(9));
		
		System.out.println(sumChanLe(8));
	}

	// nhập chuỗi đến khi hợp lệ
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

	// nhập 1 mảng Integer
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

	// nhập số nguyên đến khi hợp lệ
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

	// nhập số thập phân đến khi hợp lệ
	public static double getDoubleInput() {
		Scanner input = new Scanner(System.in);
		boolean b = true;
		double i = 0.0;
		while (b) {
			input = new Scanner(System.in);
			try {
				i = input.nextDouble();
				b = false;
			} catch (InputMismatchException e) {
				System.out.print("Không phải số thập phân. Nhập lại: ");
			}
		}
		return i;
	}

	// ex1
	public static double sum(double a, double b) {
		return a + b;
	}

	public static double sub(double a, double b) {
		return a - b;
	}

	public static double mul(double a, double b) {
		return a * b;
	}

	public static double div(double a, double b) {
		if (b == 0)
			throw new ArithmeticException("Số bị chia = 0");
		return a / b;
	}

	// ex2
	public static boolean isEven(int a) {
		return (a % 2 == 0);
	}

	// ex3
	public static boolean isTamGiac(double a, double b, double c) {
		if ((a + b) < c || (a + c) < b || (b + c) < a)
			return false;
		return true;
	}

	public static boolean isCan(double a, double b, double c) {
		if (!isTamGiac(a, b, c))
			return false;
		if (a != b && b != c && a != c)
			return false;
		return true;
	}

	public static boolean isDeu(double a, double b, double c) {
		if (!isTamGiac(a, b, c))
			return false;
		if (a != b || b != c || a != c)
			return false;
		return true;
	}

	public static int isVuong(double a, double b, double c) {
		if (!isTamGiac(a, b, c))
			return -1;
		if ((a * a + b * b) == (c * c))
			return 1; //vuông tại A
		if ((a * a + c * c) == (b * b))
			return 2;
		if ((c * c + b * b) == (a * a))
			return 3;
		return -1;

	}
//	public static boolean isVuongCan(double a, double b, double c) {
//		if(!isTamGiac(a, b, c))
//			return false;
//		if(!isCan(a, b, c))
//			return false;
//		if((a * a + b * b) == (c * c))
//			return true;
//		if((a * a + c * c) == (b * b))
//			return true;
//		if((c * c + b * b) == (a * a))
//			return true;
//		return false;
//	}

	// ex5
	public static int getInt(int a) {
		return (a > 5) ? (a + 2) : 0;
	}

	// ex6
	public static void printOutEven(int count) {
		String result = count + " số lẻ đầu tiên là: ";
		int number = 1;
		while (count > 0) {
			if (isEven(number)) {
				result += number + " ";
				count--;
			}
			number++;
		}
		System.out.println(result);
	}

	// ex7
	public static void printOutOdd(int start, int end) {
		String result = "Số lẻ từ " + start + " đến " + end + " là: ";
		for (int i = start; i <= end; i++) {
			if (!isEven(i))
				result += i + " ";
		}
		System.out.println(result);
	}

	// ex8 + 14
	public static void printOutBoiSo(int start, int end, int boiSo) {
		String result = "Bội số của " + boiSo + " từ " + start + " đến " + end + " là: ";
		for (int i = start; i <= end; i++) {
			if (i % boiSo == 0)
				result += i + " ";
		}
		System.out.println(result);
	}
	
	//ex9
	public static int sumLienTiep(int n) {
		if(n<=0)
			return -1;
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	//ex10
	public static int sumChanLe(int n) {
		if(n<=0)
			return -1;
		int start = isEven(n) ? 2 : 1;
		int sum = 0;
		for (int i = start; i <= n; i+=2) {
			sum += i;
		}
		return sum;
	}
}
