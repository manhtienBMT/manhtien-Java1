package entity;

import java.util.Scanner;

/**
 *
 * @author manht
 */
public class SanPham {
    String tenSp;
    double donGia;
    String hang;

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }
    

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten san pham: ");
        tenSp = sc.nextLine();
        System.out.print("Don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Hang: ");
        hang = new Scanner(System.in).nextLine();
    }

    public void xuat() {
        System.out.println("-----------------------------------");
        System.out.println("Ten san pham: " + tenSp);
        System.out.println("Don gia: " + donGia);
        System.out.println("Hang: " + hang);
    }
}
