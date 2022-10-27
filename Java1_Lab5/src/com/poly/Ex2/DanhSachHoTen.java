package com.poly.Ex2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author manht
 */
public class DanhSachHoTen {
    
    private ArrayList<String> ds = new ArrayList<>();
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhap danh sach ho va ten: ");
        
        while (true) {
            System.out.print("Nhap ho ten: ");
            String ten = sc.nextLine();
            if (ten.isEmpty()) {
                System.out.println("Nhap du lieu thanh cong!");
                break;
            }
            ds.add(ten);
        }
    }
    
    public void xuat() {
        System.out.println("---------------------------------------------");
        System.out.println("Danh sach ho ten nhu sau: ");
        for (String item : ds) {
            System.out.println(item);
        }
    }
    
    public void ngauNhien() {
        Collections.shuffle(ds);
        xuat();
    }
    
    public void sapXep() {
        Collections.sort(ds);
        Collections.reverse(ds);
        xuat();
    }
    
    public void xoa() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap vao ho ten muon xoa: ");
        String hoTen = sc.nextLine();
        
        for (String item : ds) {
            if (item.equalsIgnoreCase(hoTen)) {
                ds.remove(item);
                System.out.println("Xoa ho ten thanh cong!");
                break;
            }
        }
    }
    
    public void menu() {    
        Scanner sc = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("\n---------------------------------------------");
            System.out.println("Menu chuong trinh");
            System.out.println("1. Nhap danh sach ho va ten");
            System.out.println("2. Xuat danh sach");
            System.out.println("3. Xuat danh sach ngau nhien");
            System.out.println("4. Sap xep giam dan va xuat danh sach");
            System.out.println("5. Tim va xoa ho ten");
            System.out.println("0. Ket thuc");
            System.out.println("---------------------------------------------");
            System.out.print("Moi ban chon chuc nang: ");
            chon = sc.nextInt();
            switch (chon) {
                case 0 : break;
                
                case 1 : 
                    nhap();
                    break;
                    
                case 2 : 
                    xuat();
                    break;
                    
                case 3 : 
                    ngauNhien();
                    break;
                    
                case 4 : 
                    sapXep();
                    break;
                    
                case 5 : 
                    xoa();
                    break;             
            }
        }
        while (chon != 0);
    }
    
}
