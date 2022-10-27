package ex;

import java.util.Scanner;

/**
 *
 * @author manht
 */
public class Bai2 {
    public static void main(String[] args) {
        float dai, rong, cv, dt, canhnho;
        Scanner nhap = new Scanner(System.in);
        
        System.out.println("Nhap chieu rong: ");
        rong = nhap.nextFloat();
        System.out.println("Nhap chieu dai: ");
        dai = nhap.nextFloat();
        
        cv = (dai + rong) * 2;
        dt = dai * rong;
        
        canhnho = Math.min(dai, rong);
        
        System.out.println("Chu vi hinh chu nhat la: "+cv);
        System.out.println("Dien tich hinh chu nhat la: "+dt);
        System.out.println("Canh nho nhat la: " + canhnho);
    }
    
}
