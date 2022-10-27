package ex;

import java.util.Scanner;

/**
 *
 * @author manht
 */
public class Bai1 {
    public static void main(String[] args) {
        nhaptendiem();
    }
    public static void nhaptendiem() {
        Scanner nhapchuoi = new Scanner(System.in);
        Scanner nhapso = new Scanner(System.in);
        String hoTen;
        float dtb;
        
        System.out.println("Nhap ho ten: ");
        hoTen = nhapchuoi.nextLine();
        
        System.out.println("Nhap diem trung binh: ");
        dtb = nhapso.nextFloat();
        
        System.out.println("Ho ten vua nhap la: "+hoTen);
        System.out.printf("Diem TB %.2f: ", dtb);
    }
    
}

