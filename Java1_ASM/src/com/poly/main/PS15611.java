package com.poly.main;

import com.poly.entity.DanhSachNhanVien;
import java.util.Scanner;

/**
 *
 * @author manht
 */
public class PS15611 {
    
    public static void main(String arg[]) {
        DanhSachNhanVien ds = new DanhSachNhanVien();
        Scanner sc=new Scanner(System.in);
        
        try{
            while(true){
            System.out.println("*------------------------------------------------------------*");
            System.out.println("| 1. Nhap danh sach nhan vien tu ban phim                    |");
            System.out.println("| 2. Xuat danh sach nhan vien tu ban phim                    |");
            System.out.println("| 3. Tim va hien thi nhan vien theo ma nhap tu ban phim      |");
            System.out.println("| 4. Xoa nhan vien theo ma nhap tu ban phim                  |");
            System.out.println("| 5. Cap nhat thong tin nhan vien theo ma nhap tu ban phim   |");
            System.out.println("| 6. Tim cac nhan vien theo khoang luong nhap tu ban phim    |");
            System.out.println("| 7. Sap xep nhan vien theo ho va ten                        |");
            System.out.println("| 8. Sap xep nhan vien theo thu nhap                         |");
            System.out.println("| 9. Xuat 5 nhan vien co thu nhap cao nhat                   |");
            System.out.println("| 10. Ket Thuc                                               |");
            System.out.println("*------------------------------------------------------------*");
            System.out.print("Moi ban chon chuc nang: ");
            int chon = sc.nextInt();
            sc.nextLine();
            
            if (chon == 0) {
                System.exit(0);
            }
        
        switch(chon){
            case 1:
                System.out.println("\nChuc nang 1:  Nhap danh sach nhan vien tu ban phim  ");
                ds.nhap();
                break;
            case 2:
                System.out.println("\nChuc nang 2: Xuat danh sach nhan vien tu ban phim  ");
                ds.xuat();
                break;
            case 3:
                System.out.println("\nChuc nang 3: Tim va hien thi nhan vien theo ma nhap tu ban phim ");
                ds.timVaHienThiTheoMa(sc);
                break;
            case 4:
                System.out.println("\nChuc nang 4: Xoa nhan vien theo ma nhap tu ban phim  ");
                ds.xoaNhanVientheoMa(sc);
                break;
            case 5:
                System.out.println("\nChuc nang 5: Cap nhat thong tin nhan vien theo ma nhap tu ban phim");
                ds.capNhatTheoMa(sc);
                break;
            case 6:
                System.out.println("\nChuc nang 6: Tim cac nhan vien theo khoang luong nhap tu ban phim");
                ds.timNhanVienTheoKhoangLuong(sc);
                break;
            case 7:
                System.out.println("\nChuc nang 7: Sap xep nhan vien theo ho va ten ");
                ds.sapXepTheoTen();
                break;
            case 8:
                System.out.println("\nChuc nang 8: Sap xep nhan vien theo thu nhap ");
                ds.sapXepTheoThuNhap();
                break;
            case 9:
                System.out.println("\nChuc nang 9: Xuat 5 nhan vien co thu nhap cao nhat");
                ds.xuatTop5NhanVien();
                break;
            case 10:
                System.out.println("\nKet thuc chuong trinh ^_^");
                System.exit(0);
                break;
            }
            System.out.println("\nNhan Enter de tiep tuc");
            sc.nextLine();
            }
        }
        catch(Exception ex){
            System.out.print("\nBan Hay Nhap So!\n");
        }     
    }
    
}
