package ex;

import java.util.Scanner;

/**
 *
 * @author manht
 */
public class Bai5 {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        
        int a, b;
        float kq;
        System.out.println("Nhap so a: ");
        a = nhap.nextInt();
        
        System.out.println("Nhap so b: ");
        b = nhap.nextInt();
        
        if(a == 0 && b == 0) {
            System.out.println("Phuong trinh co vo so nghiem");
        }
        else if(a == 0 && b != 0) {
            System.out.println("Phuong trinh vo nghiem");
        }
        else{
            kq = -b/a;
            System.out.println("Nghiem cua phuong trinh la: "+kq);
        }
    }
}
