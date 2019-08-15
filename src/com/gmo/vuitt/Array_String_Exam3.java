package com.gmo.vuitt;

import java.util.Scanner;

public class Array_String_Exam3 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

//		3. Nhap 2 xau ky tu s1 va s2. Kiem tra xau s1 co chua xau s2 khong?
		
		System.out.println("******Exercise 3******");
		
		System.out.println("Nhap chuoi s1: ");
		String s1 = sc.nextLine();
		
		System.out.println("Nhap chuoi s2: ");
		String s2 = sc.nextLine();
		
		System.out.println("\nResult: " + s1.contains(s2));

//		4. Lay ky tu tai mot vi tri nao do trong chuoi String

		System.out.println("\n******Exercise 4*****");
		
		System.out.println("Nhap chuoi s3: ");
		String s3 = sc.nextLine();
		
		System.out.println("Nhap vi tri thu: ");
		int k = sc.nextInt();
		char result = s3.charAt(k-1);
		
		System.out.println("\nResult: " + result);

//		5. So sanh hai chuoi ky tu (theo ma Ascii)

		System.out.println("\n******Exercise 5******");
		
		sc = new Scanner(System.in);
		
		System.out.println("Nhap chuoi s4: ");
		String s4 = sc.nextLine();
		
		System.out.println("Nhap chuoi s5: ");
		String s5 = sc.nextLine();
		
		int p = s4.compareTo(s5);
		if (p < 0) {
			System.out.println("\"" + s4 + "\"" + " less than " + "\"" + s5 + "\"");
		} else if (p == 0) {
			System.out.println("\"" + s4 + "\"" + " equal " + "\"" + s5 + "\"");
		} else {
			System.out.println("\"" + s4 + "\"" + " greater than " + "\"" + s5 + "\"");
		}

//		6. So sanh hai chuoi ky tu khong phan biet chu hoa, chu thuong (theo ma Ascii)

		System.out.println("\n******Exercise 6******");
		
		System.out.println("Nhap chuoi s6: ");
		String s6 = sc.nextLine();
		
		System.out.println("Nhap chuoi s7: ");
		String s7 = sc.nextLine();

		int s = s6.compareToIgnoreCase(s7);
		if (s < 0) {
			System.out.println("\"" + s6 + "\"" + " less than " + "\"" + s7 + "\"");
		} else if (s == 0) {
			System.out.println("\"" + s6 + "\"" + " equal " + "\"" + s7 + "\"");
		} else {
			System.out.println("\"" + s6 + "\"" + " greater than " + "\"" + s7 + "\"");
		}

//		7. Noi mot chuoi vao chuoi khac

		System.out.println("\n******Exercise 7******");
		
		System.out.println("Nhap chuoi s8: ");
		String s8 = sc.nextLine();
		
		System.out.println("Nhap chuoi s9: ");
		String s9 = sc.nextLine();
		
		System.out.println("\nResult of concat: " + s8.concat(s9));

//		8. Viet chuong trinh nhap vao mot mang so nguyen co n phan tu va thuc hien cac cong viec sau:

//		Xuat gia tri cac phan tu cua mang

		System.out.println("\n******Exercise 8******");
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("\nNhap so phan tu cua mang: ");
			n = sc.nextInt();
		} while (n < 0);
		int arr[] = new int[n];
		System.out.println("\nNhap cac phan tu cua mang ");
//		sc = new Scanner(System.in);
		
		for (int i = 0; i < n; i++) {
			System.out.print("Phan tu thu " + i + ": ");
			arr[i] = sc.nextInt();
		}
		System.out.println("\nDanh sach cac phan tu cua mang la: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + "\t");
		}

//		Tim phan tu co gia tri lon nhat, nho nhat

		int max = arr[0];
		for (int i = 0; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		int min = arr[0];
		for (int i = 1; i < n; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("\nSo lon nhat: " + max);
		System.out.println("So nho nhat: " + min);

//		Dem so phan tu la chan

		int count = 0;
		int i = arr[0];
		for (i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		System.out.println("\nSo cac phan tu la so chan trong mang la: " + count);

//		Sap xep mang tang dan
		int sort;
		for (i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					sort = arr[i];
					arr[i] = arr[j];
					arr[j] = sort;
				}
			}
		}
		System.out.println("\nMang sau khi sap xep la: ");
		for (i = 0; i < n; i++) {
			System.out.print(arr[i] + "\t");
		}
//		Tim cac so nguyen to co trong mang

		System.out.println("\n\nDanh sach cac so nguyen to la: ");
		for (i = 0; i < n; i++) {
			if (isPrimeNumber(arr[i])) {
				System.out.print(arr[i] + " ");
			}
		}
		sc.close();
	}

	public static boolean isPrimeNumber(int m) {
		// so nguyen m < 2 khong phai la so nguyen to
		if (m < 2) {
			return false;
		}
		// check so nguyen to khi m >= 2
		int squareRoot = (int) Math.sqrt(m);
		for (int i = 2; i <= squareRoot; i++) {
			if (m % 2 == 0) {
				return false;
			}
		}
		return true;
	}

}
