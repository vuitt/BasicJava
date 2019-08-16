package com.gmo.tuyenlm;

public class NhanVienFullTime extends NhanVien {
	private int ngayLamThem; // Ngày làm thêm của nhân viên
    private int loaiChucVu; // Chức vụ là lính hay sếp
     
    public NhanVienFullTime(String ten, int ngayLamThem, int loaiChucVu) {
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.loaiChucVu = loaiChucVu;
    }
     
    @Override
    public String loaiNhanVien() {
        if (loaiChucVu == Configs.NHAN_VIEN_LINH) {
            return "Lính toàn thời gian" + (ngayLamThem > 0 ? " (có làm thêm ngày)":"");
        } else {
            return "Sếp toàn thời gian" + (ngayLamThem > 0 ? " (có làm thêm ngày)":"");
        }
    }
     
    @Override
    public void tinhLuong() {
        if (loaiChucVu == Configs.NHAN_VIEN_LINH) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        } else if (loaiChucVu == Configs.NHAN_VIEN_SEP) {
            luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + ngayLamThem * Configs.LUONG_LAM_THEM_MOI_NGAY;
        }
    }
}
