package com.gmo.tuyenlm;

public abstract class NhanVien {
	protected String ten;
    protected long luong;
      
    public NhanVien() { 
    }
      
    public NhanVien(String ten) {
        this.ten = ten;
    }
      
    // Lớp con phải override để lo vụ loại nhân viên này
    protected abstract String loaiNhanVien();
      
    // Lớp con phải override để lo vụ tính lương này
    public abstract void tinhLuong();
      
    public void xuatThongTin() {
        System.out.println("===== Nhân viên: " + ten + " =====");
        System.out.println("- Loại nhân viên: " + loaiNhanVien());
        System.out.println("- Lương: " + luong + " VND");
    }
}
