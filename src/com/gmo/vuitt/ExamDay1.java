package com.gmo.vuitt;

import java.util.Scanner;

public class ExamDay1 {

	public static void main(String[] args) {
// 1. Nhap vao 2 so x, y. Xuat ra man hinh tong, hieu, tich, thuong cua 2 so tren
		Scanner sc = new Scanner(System.in);

		System.out.println("Nhap x: ");
		int x = sc.nextInt();

		System.out.println("Nhap y: ");
		int y = sc.nextInt();

		int add = x + y;
		int sub = x - y;
		int mul = x * y;
		int div = x / y;

		System.out.println("x + y= " + add);
		System.out.println("x - y= " + sub);
		System.out.println("x * y= " + mul);
		System.out.println("x / y= " + div);
// 2. Nhap vao so nguyen n, kiem tra xem n chan hay le va xuat ra man hinh

		System.out.println("Nhap n8: ");
		int n8 = sc.nextInt();

		if (n8 % 2 == 0)
			System.out.println("n8 la so chan");
		else
			System.out.println("n8 la so le");
// 3. Nhap vao 3 canh a, b, c cua tam giac. Xuat ra man hinh tam giac do thuoc loai tam giac gi

		System.out.println("Nhap a: ");
		int a = sc.nextInt();

		System.out.println("Nhap b: ");
		int b = sc.nextInt();

		System.out.println("Nhap c: ");
		int c = sc.nextInt();

		if (a == b && b == c && c == a)
			System.out.println("Tam giac deu");
		else if (a == b || b == c || c == a)
			System.out.println("Tam giac can");
		else if (b * b == a * a + c * c || a * a == b * b + c * c || c * c == b * b + a * a)
			System.out.println("Tam giac vuong");
		else if ((b * b == a * a + c * c && a == c) || (a * a == b * b + c * c && b == c)
				|| (c * c == b * b + a * a && b == a))
			System.out.println("Tam giac vuong can");
		else
			System.out.println("Tam giac thuong");
// 4. Nhap vao so nguyen n. Xuat ra n man hinh (Neu n chan thi gap doi gia tri)

		System.out.println("Input n7: ");
		int n7 = sc.nextInt();

		if (n7 % 2 == 0) {
			n7 *= 2;
			System.out.println("Number of screen: " + n7);
		} else
			System.out.println("Number of screen: " + n7);
// 5. Nhap vao so nguyen n. Neu n >5 thi tang n len 2 don vi va tra ve gia tri n, nguoc lai tra ve gia tri 0

		System.out.println("Input n6: ");
		int n6 = sc.nextInt();

		if (n6 > 5) {
			n6 += 2;
			System.out.println("Gia tri cua n6: " + n6);
		} else {
			n6 = 0;
			System.out.println("Gia tri cua n6: " + n6);
// 6. Viet chuong trinh in ra tong cua 10 so chan dau tien (su dung vong lap for or while)
			int sum3 = 0;
			for (int i5 = 0; i5 < 10; i5++) {
				sum3 += i5 * 2;
			}
			System.out.println("Tong gia tri cua 10 so chan dau tien la: " + sum3);
// 7. Viet chuong trinh in ra nhung so le tu 1 den 99
			int n5 = 99;
			for (int i4 = 0; i4 <= n5; i4++)
				if (i4 % 2 != 0)
					System.out.println("Gia tri:" + i4);
// 8. Viet chuong trinh in ra tong cua cac boi so cua 7 (tu 1 den 100)	
			int sum2 = 0;
			int n4 = 100;
			for (int i3 = 1; i3 <= n4; i3++) {
				if (i3 % 7 == 0)
					sum2 += i3;
			}
			System.out.println("Tong cua cac boi so cua 7 tu 1 den 100 la: " + sum2);
// 9. Viet chuong trinh in ra tong cua 1+2+3+..+n voi n duoc nhap tu tham so command line
			int sum1 = 0;

			System.out.println("Input n3: ");
			int n3 = sc.nextInt();
			for (int i2 = 1; i2 <= n3; i2++)
				sum1 += i2;
			System.out.println("Tong gia tri cua 1 den n3 la: " + sum1);
// 10. Viet chuong trinh in ra tong cua 1+3+5+..+n neu n la so le va 2+4+6+..+n neu n la so chan voi n duoc nhap tu tham so command line
			int sum = 0;
			int n;
			System.out.println("Input n: ");
			n = sc.nextInt();
//			for (int i = 0; i <= n; i++) {
//				if ((n % 2 == 0) && (i % 2 == 0)) {
//					sum += i;
//				} else if ((n % 2 != 0) && (i % 2 != 0)) {
//					sum += i;
//				}
//			}
			int i = 0;
			if (n % 2 == 0) {
				i = 0;
			} else {
				i = 1;
			}
			while (i <= n) {
				sum += i;
				i += 2;

			}
			System.out.println("Tong = " + sum);
// 12. Viet chuong trinh giai phuong trinh bac 1 voi he so a,b duoc nhap tu command line
			float a1;
			float b1;
			System.out.println("Input a1: ");
			a1 = sc.nextFloat();
			System.out.println("Input b1: ");
			b1 = sc.nextFloat();
			if (a1 == 0) {
				if (b1 == 0) {
					System.out.println("Chuong trinh vo so nghiem");
				} else
					System.out.println("Chuong trinh vo nghiem");
			} else
				System.out.println("Chuong trinh co mot nghiem duy nhat: " + -b1 / a1);
// 13. Viet chuong trinh doc mot gia tri nguyen tu ban phim va in ra do la so chan hay le hoac zero
			int n2;
			System.out.println("Input n2: ");
			n2 = sc.nextInt();
			if (n2 % 2 == 0) {
				if (n2 == 0) {
					System.out.println("n2 la so chan, n2 la zero");
				} else
					System.out.println("n2 la so chan, n2 khong phai la zero");
			} else
				System.out.println("n2 la so le");
// 14. Viet chuong trinh in ra boi so cua 3 tu 3 den 300
			int n1 = 300;
			for (int i1 = 3; i1 <= n1; i1++) {
				if (i1 % 3 == 0)
					System.out.println("Cac boi so cua 3 tu 1 den 300 la: " + i1);
			}
			sc.close();
		}
	}
}