package com.poly.entity;

/**
 *
 * @author manht
 */
// Tao lop NhanVienHanhChinh ke thua NhanVien
public class NhanVienHanhChinh extends NhanVien {
    
    // Tham so khong co doi so
    public NhanVienHanhChinh() {
        
    }
    
    // Tham so co day du doi so
    public NhanVienHanhChinh(String ma, String hoTen,double luong) {
        super(ma, hoTen,luong);
    }
    
    // Goi lai ham getThuNhap tu lop cha
    @Override
    public double getThuNhap() {
        return getLuong();
    }
    
}
