package com.gmo.ngannt;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Day4_Bai3 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Bài tập sile bài 3 !!!");
		System.out.println("Nhập vào chuỗi 1: ");
		String str1 = sc.nextLine();

		System.out.println("Nhập vào chuỗi 2: ");

		String str2 = sc.nextLine();
//		DemTuCuaChuoi(str1);
//		DemLanXuatHien(str1);
//		S1ChuaS2(str1, str2);
		LayKiTu_ViTri(str1);
		SoSanh2Chuoi(str1, str2);
		SoSanh2Chuoi_HoaThuong(str1, str2);
		NoiChuoi(str1, str2);
		NhapMang();
	}

	// Câu 1: Nhập sâu ký tự. Đếm số từ của sâu đó
	public static void DemTuCuaChuoi(String chuoi) {
		System.out.println("Câu 1: Nhập sâu ký tự. Đếm số từ của sâu đó !!!");
		StringTokenizer stringTokenizer = new StringTokenizer(chuoi);
		int demTuTrongChuoi = stringTokenizer.countTokens();
		System.out.println("Số từ trong chuỗi \"" + chuoi + "\": " + demTuTrongChuoi);
	}

	// Câu 2: Nhập sâu ký tự. Đếm số lần xuất hiện của các từ của sâu đó
	public static void DemLanXuatHien(String chuoi) {
		System.out.println("Câu 2: Nhập sâu ký tự. Liệt kê số lần xuất hiện của các từ trong sâu !!!");
		chuoi = chuoi.replaceAll(",", "");
		System.out.println(chuoi);
		String[] array = chuoi.split(" ");
		String key = "";
		Integer value;
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < array.length; i++) {
			key = array[i];
			if (map.containsKey(key)) {
				value = map.get(key);
				map.remove(key);
				map.put(key, value + 1);
			} else {
				map.put(key, 1);
			}
		}
		Set set = map.keySet();
		Iterator i = set.iterator();

		while (i.hasNext()) {
			key = (String) i.next();
			System.out.println("Từ '" + key + "' xuất hiện " + map.get(key) + " lần");
		}
	}

	// Câu 3: Nhập 2 sâu ký tự s1 và s2. Kiểm tra xem sâu s1 có chứa s2 không?
	public static void S1ChuaS2(String str1, String str2) {
		System.out.println("Câu 3: Nhập 2 sâu ký tự s1 và s2. Kiểm tra xem sâu s1 có chứa s2 không?");
		if (str1.contains(str2))
			System.out.println("Chuỗi 1 có chứa chuỗi 2");
		else
			System.out.println("Chuỗi 1 không chứa chuỗi 2");
	}

	// Câu 4: Lấy ký tự tại một vị trí nào đó trong chuỗi String
	public static void LayKiTu_ViTri(String str1) {
		System.out.println("Câu 4: Lấy ký tự tại một vị trí nào đó trong chuỗi String");
		System.out.println("Nhập vào vị trí muốn lấy ký tự: ");
		int kyTu = sc.nextInt();
		int kyTu1 = (kyTu - 1);
		//string array[] = new String()
		int index = str1.charAt(kyTu1);
		System.out.println("Ký tự ở vị trí thứ " + kyTu  + ": " + (char) index);

	}

	// Câu 5: So sánh hai chuỗi ký tự (theo mã Ascii)
	public static void SoSanh2Chuoi(String str1, String str2) {
		System.out.println("Câu 5: So sánh hai chuỗi ký tự (theo mã Ascii)");

		// So sánh 2 chuỗi. Lưu kết quả vào result
		int result = str1.compareTo(str2); // compareTo: So sánh chuỗi

		// Kiểm tra giá trị result
		if (result < 0)
			System.out.println("\"" + str1 + "\"" + " nhở hơn " + "\"" + str2 + "\"");
		else if (result == 0)
			System.out.println("\"" + str1 + "\"" + " bằng " + "\"" + str2 + "\"");
		else
			System.out.println("\"" + str1 + "\"" + " lớn hơn " + "\"" + str2 + "\"");
	}

	// Câu 6: So sánh hai chuỗi ký tự không phân biệt chữ hoa chữ thường (theo mã
	// Ascii)

	public static void SoSanh2Chuoi_HoaThuong(String str1, String str2) {

		System.out.println("Câu 5: So sánh hai chuỗi ký tự (theo mã Ascii) không phân biệt chữ hoa thường");

		// So sánh 2 chuỗi. Lưu kết quả vào result
		int result = str1.compareToIgnoreCase(str2);// compareToIgnoreCase: so sánh chuỗi không phân biệt chữ hoa thường

		// Kiểm tra giá trị result
		if (result < 0)
			System.out.println("\"" + str1 + "\"" + " nhở hơn " + "\"" + str2 + "\"");
		else if (result == 0)
			System.out.println("\"" + str1 + "\"" + " bằng " + "\"" + str2 + "\"");
		else
			System.out.println("\"" + str1 + "\"" + " lớn hơn " + "\"" + str2 + "\"");
	}

	// Câu 7: Nối một chuỗi vào cuối chuỗi khác
	public static void NoiChuoi(String str1, String str2) {
		System.out.println("Câu 7: Nối một chuỗi với một chuỗi khác");
		System.out.println("Chuỗi 1: " + str1);
		System.out.println("Chuỗi 2: " + str2);
		String str = str1.concat(str2);// nối chuỗi
		System.out.println("Chuỗi sau khi được nối: " + str);

	}

	// Câu 8: Nhập vào mảng số nguyên có n phần tử:
	// Xuất giá trị các phần tử của mảng
	// Tìm phần tử có giá trị lớn nhất, nhỏ nhất
	// Đếm số phần tử là số chẵn
	// Tìm các số nguyên tố trong mảng
	// Sắp xếp mảng tăng dần

	public static void NhapMang() {
		System.out.println("Câu 8: ");
		System.out.println("Nhập số phần tử của mảng");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Nhập phần tử của mảng");
		for (int i = 0; i < n; i++) {
			System.out.println("Nhập phần tử thứ " + (i + 1) + ": ");
			array[i] = sc.nextInt();
		}

		// 8.1: Xuất ra giá trị các phần tử của mảng
		System.out.println("Phần tử mảng: ");
		for (int i = 0; i < n; i++) {
			System.out.print(array[i] + "  ");
		}

		// 8.2: Tìm phần tử lớn nhất, nhỏ nhất

		int max = 0;
		int min = 0;
		for (int i = 0; i < n; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			if (min > array[i])
				min = array[i];
		}
		System.out.println("\nPhần tử có giá trị lớn nhất: " + max);
		System.out.println("Phần tử có giá trị bé nhất: " + min);

		// 8.3: Đếm số phần tử là số chẵn
		int dem = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0)
				dem += 1;
		}
		System.out.println("Mảng có " + dem + " phần tử là số chẵn");

		// 8.4: Tìm số nguyên tố có trong mảng
		System.out.print("Số nguyên tố có trong mảng: ");
		for (int i = 0; i < n; i++) {
			if (isPrimeNumber(array[i]))
				System.out.print("  " + array[i]);
		}

		// 8.5: Sắp xếp mảng tăng dần
		System.out.println("\nSắp xếp mảng tăng dần: ");
		int tmp = 0;
		System.out.print("Danh sách mảng được sắp xếp tăng dần: ");
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (array[i] > array[j]) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}

		}
		for (int i = 0; i < n; i++)
			System.out.print(array[i] + "\t");
	}

	// Check số nguyên tố
	public static boolean isPrimeNumber(int n) {
		// so nguyen n < 2 khong phai la so nguyen to
		if (n < 2) {
			return false;
		}
		// check so nguyen to khi n >= 2
		int squareRoot = (int) Math.sqrt(n);
		for (int i = 2; i <= squareRoot; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
