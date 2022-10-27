package ex;

import java.util.Scanner;

/**
 *
 * @author manht
 */
public class PS15611 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        boolean cont = true;
        
        do {
            System.out.println("-----------------------------------");
            System.out.println("\n---------------MENU----------------");
            System.out.println("1. Giai phuong trinh bac 1");
            System.out.println("2. Giai phuong trinh bac 2");
            System.out.println("3. Tinh tien dien");
            System.out.println("4. Ket thuc");
            System.out.println("-----------------------------------");
            System.out.print("Chon (1 - 4): ");
            int chon = nhap.nextInt();
                switch(chon) {
                    case 1:
                        System.out.println("");
                        giaiPTB1();
                        break;
                    case 2:
                        System.out.println("");
                        giaiPTB2();
                        break;
                    case 3:
                        System.out.println("");
                        tinhTienDien();
                        break;
                    case 4:
                        System.out.println("\nBan da dung lai!");
                        cont = false;
                        break;
                    default:
                        System.out.println("\n######## Phai chon tu 1 - 4 #######");
                        break;
                        
                }
        }
        while (cont);
    }
    
    public static void giaiPTB1() {
        System.out.println("------Giai phuong trinh bac 1------");
        Scanner nhap = new Scanner(System.in);
        int a , b;
        
        System.out.println("Nhap gia tri a: ");
        a = nhap.nextInt();
        System.out.println("Nhap gia tri b: ");
        b = nhap.nextInt();
        
        if(a == 0) {
            if(b == 0) {
                System.out.println("PT co vo so nghiem");
            }
            else {
                System.out.println("PT vo nghiem");
            }
        }
        else {
            double x = -b / a;
            System.out.println("Nghiem cua PT la: " +x);
        }
        
    }
    
    public static void giaiPTB2() {
        System.out.println("------Giai phuong trinh bac 2-------");
        Scanner nhap = new Scanner(System.in);
        
        int a, b, c;
        double x, x1, x2, delta;
        
        System.out.println("Nhap so a: ");
        a = nhap.nextInt();
        System.out.println("Nhap so b: ");
        b = nhap.nextInt();
        System.out.println("Nhap so c: ");
        c = nhap.nextInt();
        
        if(a == 0)
            if(b == 0) {
                if(c == 0) {
                     System.out.println("PT vo so nghiem");
                }
                else {
                    System.out.println("PT vo nghiem");
                }
            }
            else{
                x = -c / b;
                System.out.println("Nghiem pt la x = " +x);
            }
        else {
            delta = (b * b) - (4 * a * c);
            if(delta == 0) {
                x = -b / (2 * a);
                System.out.println("PT co 2 nghiem kep x1 = x2 = " +x);
            }
            else if(delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("PT co 2 nghiem phan biet x1 = " +x1 + " " + "x2 = " +x2);
            }
            else {
                System.out.println("PT vo nghiem");
            }
        }
    }
    
    public static void tinhTienDien() {
        System.out.println("----------Tinh tien dien-----------");
        float b1, b2, b3, b4, b5, b6, soDien, tiendien;
        Scanner nhap = new Scanner(System.in);
        
        System.out.println("Nhap vao so kwh su dung: ");
        soDien = nhap.nextFloat();
        
        b1 = 50 * 1678;
        b2 = 50 * 1734;
        b3 = 100 * 2014;
        b4 = 100 * 2536;
        b5 = 100 * 2834;
        b6 = (soDien - 400) * 2927;
        
        if(soDien <= 50){
            tiendien = soDien * 1678;
        }
        else if(soDien <= 100) {
            tiendien = b1 + (soDien - 50) *1734;
        }
        else if(soDien <= 200) {
            tiendien = b1 + b2 + (soDien - 100) * 2014;
        }
        else if(soDien <= 300) {
            tiendien = b1 + b2 + b3 + (soDien - 100) * 2536;
        }
        else if(soDien <= 400) {
            tiendien = b1 + b2 + b3 + b4 + (soDien - 100) * 2834;
        }
        else {
            tiendien = b1 + b2 + b3 + b4 + b5 + b6;
        }
        System.out.println("Tien dien phai tra: " +tiendien);
    }
    
}
