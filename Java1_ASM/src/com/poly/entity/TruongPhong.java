package com.poly.entity;

import java.util.Scanner;

/**
 *
 * @author manht
 */
// Tao lop TruongPhong ke thua NhanVien
public class TruongPhong extends NhanVien {
    private double luongTrachNhiem;
    
    // Tham so khong co doi so
    public TruongPhong() {
        
    }
    
    // Tham so co day du doi so
    public TruongPhong(String ma, String hoTen,double luong,double luongTrachNhiem) {
        super(ma, hoTen,luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }
    
    // Goi lai ham nhap tu lop cha
    @Override
    public void nhap(Scanner sc){
        super.nhap(sc);
        System.out.print("Luong Trach Nhiem: ");
        luongTrachNhiem = sc.nextDouble();
        sc.nextLine();
    }
    
    // Goi lai ham xuat tu lop cha
    @Override
    public void xuat(){
        super.xuat();
        
        System.out.printf("- Luong trach nhiem: %.0f\n", luongTrachNhiem);
    }
    
    
    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }
    
    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }
    
    // Goi lai ham getThuNhap tu lop cha
    @Override
    public double getThuNhap() {
        return getLuong() + luongTrachNhiem;
    }
     
}
