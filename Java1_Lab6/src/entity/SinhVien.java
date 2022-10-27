package entity;

import java.util.Scanner;

/**
 *
 * @author manht
 */
public class SinhVien {
    String hoTen;
    String email;
    String phone;
    String cmnd;

    public SinhVien() {
        
    }

    public SinhVien(String hoTen, String email, String phone, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.phone = phone;
        this.cmnd = cmnd;
    }
    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\nNhap ho ten: ");
            hoTen = sc.nextLine();
            
            if (hoTen == null | hoTen.equals("")) {
                System.out.println("Ho ten khong hop le!");
            }
            else {
                break;
            }
        }
        while(true);
        
        //Khai báo Data
        Data ds = new Data();
        
        //Check Email
        do {
            System.out.print("Nhap email: ");
            email = sc.nextLine();
            
            if (ds.isEmail(email)) {
                break;
            }
            System.out.println("Email khong hop le!");
        }
        while(true);
        
        //Check Phone
        do {
            System.out.print("Nhap so dien thoai: ");
            phone = sc.nextLine();
            
            if (ds.isPhone(phone)) {
                break;
            }
            System.out.println("SDT khong hop le!");
        }
        while(true);
        
        //Check CMND
        do {
            System.out.print("Nhap CMND: ");
            cmnd = sc.nextLine();
            
            if (ds.isCMND(cmnd)) {
                break;
            }
            System.out.println("CMND khong hop le!");
        }
        while(true);
        
    }
    
    public void xuat() {
        System.out.printf("Ho ten: %s - Email: %s - SDT: %s - CMND: %s \n", hoTen, email, phone,cmnd);
    }
    
}
