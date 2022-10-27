package com.poly.Ex1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author manht
 */
public class MangSoThuc {
    
    //Khai bao ArrayList
    private ArrayList<Double> list = new ArrayList<>();
    
    // Khoi tao ham nhap
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap danh sach so thuc: ");
        while (true) {
            System.out.println("Nhap so: ");
            Double x =  sc.nextDouble();
            list.add(x);
            sc.nextLine();
            System.out.println("Ban muon nhap tiep ? (Y/N): ");
            if(sc.nextLine().equals("N")) {
                break;
            }
        }
    }
    
    // Khoi tao ham xuat
    public void xuat() {
        System.out.println("---------------------------------------");
        System.out.println("Mang ban da nhap nhu sau: ");
        for (Double item : list) { // Gan gia tri cua list cho item
            System.out.println("" +item);
        }
    }
    
    // Khoi tao ham tinh tong
    public void tinhTong() {
        double tong = 0;
        for (Double item : list) {
            tong += item;
        }
        System.out.println("Tong: " +tong);
    }
    
}
