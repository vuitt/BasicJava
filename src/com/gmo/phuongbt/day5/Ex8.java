package com.gmo.phuongbt.day5;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		// Viết chương trình nhập vào một mảng số nguyên có n phần tử và thực hiện các
		// công việc sau:			
//				Sắp xếp mảng tăng dần.

		int n, soChan = 0, sum = 0, tempSort;
		Scanner scanner = new Scanner(System.in);

		do {
			System.out.println("Nhập vào số phần tử của mảng: ");
			n = scanner.nextInt();
		} while (n < 0);

		// khởi tạo và cấp phát bộ nhớ cho mảng
		int array[] = new int[n];

		System.out.println("Nhập các phần tử cho mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + i + ": ");
			array[i] = scanner.nextInt();
		}

		// Hiển thị mảng vừa nhập
		System.out.println("\nMảng ban đầu: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + "\t");
		}
		// Tìm phần tử có giá trị lớn nhất, nhỏ nhất.
		int min = array[0];
		int max = array[0];
		for (int i = 0; i < n; i++) {
			if (array[i] < min) {
				min = array[i];
			}
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("");
		System.out.println("Min = " + min);
		System.out.println("Max = " + max);

		// Đếm số phần tử là số chẵn.
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0) {
				soChan++;
			}
		}
		System.out.println("So luong so chan: "+ soChan);

		//Tìm các số nguyên tố có trong mảng
		//kiem tra so nguyen to
//		public static boolean KiemtraNguyento(int n){
//	        if(n<2)
//	            return false;
//	        for(int i=2;i < Math.sqrt(n);i++){
//	            if(n%i==0){
//	                return false;
//	            }
//	        }
//	       
//	    return true;
//	    }
	}

}
