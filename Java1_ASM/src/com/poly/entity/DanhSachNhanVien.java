package com.poly.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author manht
 */
public class DanhSachNhanVien {
    
    private final  ArrayList<NhanVien> list = new ArrayList<>();
    
    // Ham nhap dsnv
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        list.clear(); // Xoa du lieu duoc nhap truoc do
        do {
            System.out.println("\nNhap loai nhan vien (1.Hanh Chinh, 2.Truong Phong, 3.Tiep Thi)");
            System.out.print("Chon: ");
            String loai = sc.nextLine(); // Nhap loai
            if(loai == null || loai.equals(""))
                break; // Neu loai = null hoac rong thi ket thuc
            int nloai = Integer.parseInt(loai);
            switch(nloai){
                case 1:
                    NhanVienHanhChinh nvhc = new NhanVienHanhChinh();
                    nvhc.nhap(sc);
                    list.add(nvhc);
                    break;
                case 2:
                    TruongPhong tp = new TruongPhong();
                    tp.nhap(sc);
                    list.add(tp);
                    break;
                case 3:
                    NhanVienTiepThi nvtt = new NhanVienTiepThi();
                    nvtt.nhap(sc);
                    list.add(nvtt);
                    break;
            }
        } while (true);  
    }
    
    // Xuat danh sach NV
    public void xuat(){
        System.out.println("\nDanh Sach Nhan Vien: ");
        for (NhanVien nv : list) {
            // Kiem tra doi tuong co phai la instance cua 1 class hay interface nao do hay khong
            if (nv instanceof NhanVienHanhChinh) {
                ((NhanVienHanhChinh)nv).xuat();
            }
            else if (nv instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi)nv).xuat();
            }
            else if (nv instanceof TruongPhong) {
                ((TruongPhong)nv).xuat();
            }
        }
        
    }
    
    // Xoa nhan vien theo maNV
    public void xoaNhanVientheoMa(Scanner sc){
        System.out.println("\nXoa thong tin nhan vien theo ma");
        System.out.print("Nhap ma nhan vien can xoa: ");
        String ma = sc.nextLine();
         NhanVien tim = null;
        for (NhanVien nv : list) {
            if (nv.getMa().equalsIgnoreCase(ma)) {
               tim = nv;
               break;
            }
        }
        if (tim != null) {
            list.remove(tim);
            System.out.println("\nDa xoa nhan vien co ma " + ma + " thanh cong !");
         
        }
        else{
            System.out.printf("\nKhong tim thay nhan vien co ma %s\n ", ma);
        }
        
    }
    
    // Xuat top 5 NV co thu nhap cao nhat
    public void xuatTop5NhanVien(){
        sapXepTheoThuNhap();
        int t = (list.size() < 5)?list.size(): 5;
        for (int i = 0; i < t; i++) {
            list.get(i).xuat();
        }
        
    }
    
    // Tim va hien thi thong tin NV theo maNV
    public void timVaHienThiTheoMa(Scanner sc){
        System.out.print("\nNhap ma can tim: ");
        String ma = sc.nextLine();
        NhanVien tim = null;
        for (NhanVien nv : list) {
            if (nv.getMa().equalsIgnoreCase(ma)) {
               tim = nv;
               break;
            }
        }
        if (tim != null) {
            System.out.println("\nThong tin nhan vien tim thay theo ma " +ma + " :");
            tim.xuat();
        }
        else {
            System.out.println("Khong tim thay nhan vien co ma: " + ma);
        }
        
    }
    
    // Cap nhat theo maNV
    public void capNhatTheoMa(Scanner sc){
        System.out.println("\ncap nhat thong tin nhan vien theo ma");
        System.out.print("Nhap ma nhan vien can cap nhat thong tin: ");
        String ma = sc.nextLine();
        NhanVien tim = null;
        for (NhanVien nv : list) {
            if (nv.getMa().equalsIgnoreCase(ma)) {
                tim = nv;
                break;
            }
        }
        if (tim != null) {
            System.out.println("\nNhap thong tin moi cho nhan vien can cap nhat: ");
            if (tim instanceof NhanVienHanhChinh) {
               ((NhanVienHanhChinh)tim).nhap(sc);
            }
            else  if (tim instanceof TruongPhong) {
                ((TruongPhong)tim).nhap(sc);
            }
            else if (tim instanceof NhanVienTiepThi) {
                ((NhanVienTiepThi)tim).nhap(sc);
            }
        }
        else {
            System.out.printf("\nkhong tim thay ma nhan vien: ", ma);
        }
        
    }
    
    // Sap xep theo ten
    public void sapXepTheoTen(){
       Collections.sort(list);
        for (NhanVien nv : list) {
            System.out.println("...");
        }
        System.out.println("Hay chon chuc nang 2 de kiem tra !");
    }
    
    // Sap xep theo thu nhap (giam dan)
    public void sapXepTheoThuNhap(){
       Comparator <NhanVien> haizz = new Comparator<NhanVien>(){

           @Override
           public int compare(NhanVien o1, NhanVien o2) {
               int s = 0;
               double tn1 = o1.getThuNhap(), tn2 = o2.getThuNhap();
               if (tn1 > tn2) s = -1;
               else if(tn1 < tn2) s = 1;
               return s;
           }
        };
        Collections.sort(list, haizz);
        System.out.println("Hay chon chuc nang 2 de kiem tra !");
    }
  
    // Tim nhan vien theo khoang luong
    public void timNhanVienTheoKhoangLuong(Scanner sc){
        System.out.println("\nTim nhan vien theo khoang luong");
        System.out.print("Nhap khoang luong thap nhat: ");
        double min = sc.nextDouble();
        
        System.out.print("Nhap khoang luong cao nhat: ");
        double max = sc.nextDouble();
        boolean tim = false;
        for (NhanVien nhanVien : list) {
            if (min <= nhanVien.getLuong()  &&  nhanVien.getLuong() <= max){
                System.out.println("Ket qua tim thay la: ");
                nhanVien.xuat();
                System.out.println();
                tim = true;
            }
        }
        if (tim = false) {
            System.out.println("Khong co nhan vien nao co luong trong khoang can tim");
        }
    }
    
}
