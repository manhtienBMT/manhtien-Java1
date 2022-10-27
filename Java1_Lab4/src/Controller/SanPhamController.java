package Controller;

import Entity.SanPham;
import java.util.Scanner;

/**
 *
 * @author manht
 */
public class SanPhamController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        boolean cont = true;
        
        do {
            System.out.println("-----------------------------------");
            System.out.println("\n---------------MENU----------------");
            System.out.println("1. Bai 1.");
            System.out.println("2. Bai 2.");
            System.out.println("3. Bai 3.");
            System.out.println("4. Bai 4.");
            System.out.println("5. Ket thuc!");
            System.out.println("-----------------------------------");
            System.out.print("Chon (1 - 4): ");
            int chon = nhap.nextInt();
                switch(chon) {
                    case 1:
                        System.out.println("");
                        Bai1();
                        break;
                    case 2:
                        System.out.println("");
                        Bai2();
                        break;
                    case 3:
                        System.out.println("");
                        Bai3();
                        break;
                    case 4:
                        System.out.println("");
                        Bai4();
                        break;
                    case 5:
                        System.out.println("\nBan da dung lai!");
                        cont = false;
                        break;
                    default:
                        System.out.println("\n######## Phai chon tu 1 - 5 #######");
                        break;     
                }
        }
        while (cont);
    }
    
    public static void Bai1() {
        SanPham sp = new SanPham();
        sp.NhapSP();
        sp.XuatSP();
    }
    
    public static void Bai2() {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        
        System.out.println("Nhap SP1");
        sp1.NhapSP();
        
        System.out.println("");
        
        System.out.println("Nhap SP2");
        sp2.NhapSP();
        
        System.out.println("");
        
        System.out.println("SP1: ");
        sp1.XuatSP();
        
        System.out.println("");
        
        System.out.println("SP2: ");
        sp2.XuatSP();
    }
    
    public static void Bai3() {
        SanPham sp1 = new SanPham("Pepsi", 12000, 2500);
        sp1.XuatSP();
        System.out.println("");
        SanPham sp2 = new SanPham("Soda", 9500);
        sp2.XuatSP();
    }
    
    public static void Bai4() {
        SanPham sp1 = new SanPham("Pepsi", 12000, 2500);
        sp1.XuatSP();
        
        System.out.println("");
        
        String ten = sp1.getTenSP();
        System.out.println("Ten Sp: " +ten);
        sp1.setTenSP("SP Hide");
        sp1.XuatSP();
        
        System.out.println("");
        
        SanPham sp2 = new SanPham("Soda", 9500);
        sp2.XuatSP();
    }
    
}
