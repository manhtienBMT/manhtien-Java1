package com.poly.Ex3;

/**
 *
 * @author manht
 */
public class SanPham {
    private String tenSP;
    private double giaSP;
    
    public SanPham() {
        this.tenSP = null;
        this.giaSP = 0;
    }

    public SanPham(String tenSP, double giaSP) {
        this.tenSP = tenSP;
        this.giaSP = giaSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }
    
}
