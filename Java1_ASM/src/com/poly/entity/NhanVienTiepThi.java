package com.poly.entity;

import java.util.Scanner;

/**
 *
 * @author manht
 */
// Tao lop NhanVienTiepThi ke thua NhanVien
public class NhanVienTiepThi extends NhanVien {
    private double hueHong;
    private double doanhSo;
    
    // Tham so khong co doi so
    public NhanVienTiepThi() {
        
    }
    
    // Tham so co day du doi so
    public NhanVienTiepThi(double doanhSo, double hueHong, String ma, String hoTen,double luong) {
        super(ma, hoTen,luong);
        
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }
    
    // Goi lai ham nhap tu lop cha
    @Override
    public void nhap(Scanner sc){
        super.nhap(sc);
        
        System.out.print("Doanh So: ");
        doanhSo = sc.nextDouble();
        System.out.print("Hue Hong: ");
        hueHong = sc.nextDouble();
        sc.nextLine();
    }
    
    // Goi lai ham xuat tu lop cha
    @Override
    public void xuat(){
        super.xuat();
        
        System.out.printf("- Doanh so: %.0f\n", doanhSo);
        System.out.printf("- Hue Hong: %.0f\n", hueHong);
    }
    
    public double getDoanhSo() {
        return doanhSo;
    }
    
    public void setDoanhSo(double doanhSo) {
        this.doanhSo = doanhSo;
    }
    
    public double getHueHong() {
        return hueHong;
    }
    
    public void setHueHong(double hueHong) {
        this.hueHong = hueHong;
    }
    
    // Goi lai ham getThuNhap tu lop cha
    @Override
    public double getThuNhap() {
       return luong + doanhSo * hueHong / 100;
    }
    
}
