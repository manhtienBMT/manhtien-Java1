package com.poly.entity;

import java.util.Scanner;

/**
 *
 * @author manht
 */
// Lop truu tuong (abstract) || Comparable sap xep cac phan tu cua collection
public abstract class NhanVien implements Comparable<NhanVien> {
    String ma, hoTen;
    double luong;
    
    public abstract double getThuNhap();

    public NhanVien() {
        
    }

    public NhanVien(String ma, String hoTen, double luong ) {
        this.ma = ma;
        this.hoTen = hoTen;
                this.luong = luong;
    }
    
    public void nhap(Scanner sc){
        
        pattern kt = new pattern();
        do {
            System.out.print("\nMaNV: ");
            ma = sc.nextLine(); 
            if(kt.ktMA(ma)) {
                break;
            }
            System.out.println("Ma khong hop le! Vui long nhap lai ^-^"); 
        }
        while (true);
        
        do {
            System.out.print("Ho ten: ");
            hoTen = sc.nextLine(); 
            if(kt.ktTen(hoTen)){
                break;
            }
            System.out.println("Ho ten khong hop le! Vui long nhap lai ^-^");
        }
        while (true);
            System.out.print("Luong: ");
            luong = sc.nextDouble();
         
            sc.nextLine();
    
    }
    
    public void xuat() {
        System.out.printf("\n- MaNV: %s\n", ma);
        System.out.printf("- Ho ten: %s\n", hoTen);
        System.out.printf("- Luong: %.0f\n", luong);
        System.out.printf("- Thu Nhap: %.0f\n", getThuNhap());
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    @Override
    public int compareTo(NhanVien sc) {
        return this.hoTen.compareTo(sc.hoTen);
    } 
    
}
