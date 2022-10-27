package ex;

import java.util.Scanner;

/**
 *
 * @author manht
 */
public class Bai4 {
    public static void main(String[] args) {
        System.out.println("Giai phuong trinh bac 2");
        Scanner nhap = new Scanner(System.in);
        
        int a, b, c;
        double delta, candelta;
        
        System.out.println("Nhap so a: ");
        a = nhap.nextInt();
        
        System.out.println("Nhap so b: ");
        b = nhap.nextInt();
        
        System.out.println("Nhap so c: ");
        c = nhap.nextInt();
        
        delta = Math.pow(b, 2) - 4*a*c;
        candelta = Math.sqrt(delta);
        
        System.out.println("Delta co gia tri: " +delta);
        System.out.println("Can delta: " +candelta);
    }
}
