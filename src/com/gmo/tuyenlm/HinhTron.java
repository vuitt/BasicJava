package com.gmo.tuyenlm;

import java.util.Scanner;

public class HinhTron extends HinhHoc {
	public float banKinh;
	 
    // Constructor
    public HinhTron() {
        ten = "H�nh Tr�n";
    }
 
    public void nhapBanKinh() {
        System.out.print("B�n k�nh = ");
        Scanner scanner = new Scanner(System.in);
        banKinh = scanner.nextFloat();
    }
 
    public void tinhChuVi() {
        chuVi = 2 * PI * banKinh;
    }
 
    public void tinhDienTich() {
        dienTich = PI * banKinh * banKinh;
    }
}
