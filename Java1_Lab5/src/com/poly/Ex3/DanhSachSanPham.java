package com.poly.Ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author manht
 */
public class DanhSachSanPham {
    private ArrayList<SanPham> list = new ArrayList<>();
    
    public void nhap() {
        int i = 1;
        System.out.println("\nNhap danh sach san pham");
        do {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Nhap ten SP thu %d: ", i);
            String ten = sc.nextLine();
            if (ten == null || ten.equals("")) {
                break;
            }
            i++;
            System.out.printf("Gia san pham: ");
            double gia = sc.nextDouble();
            list.add(new SanPham(ten, gia));
        }
        while (true);
    }
    
    public void xuat() {
        System.out.println("\nDanh sach san pham");
        System.out.println("Ten\t\t |\t\tGia\t\t");
        System.out.println("-------------------------------------------------------");
        for (SanPham sp : list) {
            System.out.printf("%s\t\t |\t\t%.2f \n", sp.getTenSP(), sp.getGiaSP());
        }
    }
    
    public void sapXep() {
        Comparator<SanPham> comp = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham o1, SanPham o2) {
                return Double.compare(o1.getGiaSP(), o2.getGiaSP());
            }
        };
        Collections.sort(list, comp);
        Collections.reverse(list);
        xuat();
    }
    
    public void xoa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap ten SP can tim: ");
        String ten = sc.nextLine();
        
        SanPham sp = null;
        
        for (SanPham sp1 : list) {
            if (sp1.getTenSP().equals(ten)) {
                sp = sp1;
                break;
            }
        }
        if (sp != null) {
            list.remove(sp);
            System.out.println("Xoa SP thanh cong!");
        }
        else {
            System.out.println("Khong tim thay ten SP!");
        }
        
    }
    
    public void giaTB() {
        double avg = 0, sum = 0;
        for (SanPham sp : list) {
            sum += sp.getGiaSP();
        }
        avg = sum / list.size();
        System.out.println("\nGia trung binh: " +avg);
    }
    
    public void menu() {    
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("\n-------------------------------------------------------");
            System.out.println("Menu chuong trinh");
            System.out.println("1. Nhap danh sach san pham");
            System.out.println("2. Xuat danh sach duoc sap xep giam dan theo gia");
            System.out.println("3. Tim va xoa san pham theo ten san pham");
            System.out.println("4. Xuat gia trung binh cua cac san pham");
            System.out.println("0. Ket thuc");
            System.out.println("-------------------------------------------------------");
            System.out.print("Moi ban chon chuc nang: ");
            chon = sc.nextInt();
            switch (chon) {
                case 0 : break;
                
                case 1 : 
                    nhap();
                    break;
                    
                case 2 : 
                    sapXep();
                    break;
                    
                case 3 : 
                    xoa();
                    break;
                    
                case 4 : 
                    giaTB();
                    break;   
            }
        }
        while (chon != 0);
    }
    
}
