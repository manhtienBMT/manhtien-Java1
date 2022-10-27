package Entity;

import java.util.Scanner;

/**
 *
 * @author manht
 */
public class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }

    public SanPham() {
    }
    
    public SanPham(String tenSP, double donGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = 0;
    }
    
    public SanPham(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }
    
    public void NhapSP() {
        Scanner nhap = new Scanner(System.in);
        Scanner nhapso = new Scanner(System.in);
        
        System.out.println("Nhap ten SP: ");
        this.setTenSP(nhap.nextLine());
        
        System.out.println("Nhap gia SP: ");
        this.setDonGia(nhapso.nextDouble());
        
        System.out.println("Nhap giam gia : ");
        this.setGiamGia(nhapso.nextDouble());
    }
    
    public double ThueNK() {
        return 0.1*(this.getDonGia() - this.getGiamGia());
    }
    
    public void XuatSP() {
        System.out.println("Ten SP: " +this.getTenSP() + " | " + "Don gia: " +this.getDonGia() + " | " + "Giam gia: " +this.getGiamGia());
        System.out.println("Thue nhap khau: " +this.ThueNK());
    }
}
