package ex;

import java.util.Scanner;

/**
 *
 * @author manht
 */
public class Bai3 {
    public static void main(String[] args) {
        int canh;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Nhap canh: ");
        canh = nhap.nextInt();
        System.out.println("The tich cua khoi chu nhat: " + Math.pow(canh, 3));
    }
    
}
