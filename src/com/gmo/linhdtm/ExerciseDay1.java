package com.gmo.linhdtm;

import java.util.Scanner;

public class ExerciseDay1 {

	public static void main(String[] args) {
		
		System.out.println("Ex1: ");
		System.out.println("Hello World");

		System.out.println("Ex2: ");
		System.out.println("++++++");
		System.out.println("@@@@@@");
		System.out.println("******");
		System.out.println("######");

		int a = 10;
		double b = 20.3;
		double c = 3.14785;
		System.out.println("Ex3: " + "\n" + a + "," + b + "," + c);

		boolean ex = true;
		ex = false;
		System.out.println("Ex4: ");
		System.out.println(ex);

		/*
		 * Exercise 3 in slide
		 */
		System.out.println("Exercise 3:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập 3 cạnh của tam giác");
		System.out.println("Nhập cạnh a: ");
		int a1 = sc.nextInt();
		System.out.println("Nhập cạnh b: ");
		int b1 = sc.nextInt();
		System.out.println("Nhập cạnh c: ");
		int c1 = sc.nextInt();
		if (a1 == b1 && b1 == c1 && c1 == a1) {
			System.out.println("Đây là tam giác đều.");
		} else if (a1 == b1 || b1 == c1 || c1 == a1) {
			System.out.println("Đây là tam giác cân.");
		} else if (Math.pow(a1, 2) == Math.pow(b1, 2) + Math.pow(c1, 2)
				|| Math.pow(b1, 2) == Math.pow(a1, 2) + Math.pow(c1, 2)
				|| Math.pow(c1, 2) == Math.pow(b1, 2) + Math.pow(a1, 2)) {
			System.out.println("Đây là tam giác vuông.");
		} else if ((Math.pow(a1, 2) == Math.pow(b1, 2) + Math.pow(c1, 2)
				|| Math.pow(b1, 2) == Math.pow(a1, 2) + Math.pow(c1, 2)
				|| Math.pow(c1, 2) == Math.pow(b1, 2) + Math.pow(a1, 2)) && (a1 == b1 || b1 == c1 || c1 == a1)) {
			System.out.println("Đây là tam giác vuông cân.");
		} else {
			System.out.println("Đây là tam giác thường.");
		}

		/* Exercise 4 in slide */
		System.out.println("Exercise 4:");
		sc = new Scanner(System.in);
		System.out.println("Nhập số n: ");
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("n = " + n * n);

		} else {
			System.out.println("n = " + n);
		}

		/* Exercise 5 in the slide */
		System.out.println("Exercise 5:");
		sc = new Scanner(System.in);
		System.out.println("Nhập số n1: ");
		int n1 = sc.nextInt();
		if (n1 > 5) {
			System.out.println("n1 = " + (n1 + 2));

		} else {
			System.out.println("n1 = " + 0);
		}

		/* Exercise 7 */
		System.out.println("Exercise 7:");
		String m = "1";
		for (int i = 2; i <= 99; i++) {
			if (i % 2 != 0) {
				m = m + ";" + i;
			}
		}
		System.out.println("Những số lẻ từ 1 đến 99 là: " + m);

		/* Exercise 8 */
		System.out.println("Exercise 8:");
		int sum = 0;
		for (int o = 1; o <= 100; o++) {
			if (o % 7 == 0) {
				sum += o;
			}
		}
		System.out.println("Tổng các số là bội số của 7 ( từ 1 đến 100): " + sum);

		/* Exercise 9 */
		System.out.println("Exercise 9:");
		int sum1 = 0;
		sc = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n2 = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			sum1 += i;
		}
		System.out.println("Tổng từ 1 tới " + n2 + " là:" + sum1);

		/* Exercise 10 */
		System.out.println("Exercise 10:");
		int sum2 = 0;
		sc = new Scanner(System.in);
		System.out.println("Nhập n: ");
		int n3 = sc.nextInt();
		if (n3 % 2 == 0) {
			for (int i = 1; i <= n3; i++) {
				if (i % 2 == 0) {
					sum2 += i;
				}
			}
			System.out.println("Tổng: " + sum2);
		} else {
			for (int i = 1; i <= n3; i++) {
				if (i % 2 != 0) {
					sum2 += i;
				}
			}
			System.out.println("Tổng: " + sum2);

		}

		/* Exercise 11 */
		System.out.println("Exercise 11:");
		sc = new Scanner(System.in);
		System.out.println("Nhập số lượng số bạn muốn nhập:");
		int p = sc.nextInt();
		int arr[] = new int[p];
		sc = new Scanner(System.in);
		for (int i = 0; i < p; i++) {
			System.out.println("Nhập số thứ " + (i + 1));
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		for (int i = 0; i < p; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		int min = arr[0];
		for (int i = 1; i < p; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Số lớn nhất là " + max);
		System.out.println("Số nhỏ nhất là " + min);

		/* Exercise 12 */
		System.out.println("Exercise 12:");
		sc = new Scanner(System.in);
		System.out.println("Nhập các tham số của phương trình ax + b = 0");
		System.out.print("a =  ");
		int a3 = sc.nextInt();
		System.out.print("b =  ");
		int b3 = sc.nextInt();
		if (a3 == 0 && b3 == 0) {
			System.out.println("Phương trình có vô số nghiệm.");
		} else if (a3 == 0 && b3 != 0) {
			System.out.println("Phương trình vô nghiệm.");
		} else {
			System.out.println("Phương trình có nghiệm là x = " + (-b3 / a3));
		}
	}

}
