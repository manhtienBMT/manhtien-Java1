package ex;

import java.util.Scanner;

/**
 *
 * @author manht
 */
public class ThongTinSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n;
        
        System.out.println("Nhap vao so SV : ");
        n = nhap.nextInt();
        
        String sv[] = new String[n];
        double diem[] = new double[n];
        
        nhapSV(sv, diem, n);
        xuatSV(sv, diem, n);
        sapXepSVTheoDiem(sv, diem, n);
        xepLoai(sv, diem, n);
    }
    
    public static void nhapSV(String sv[], double diem[], int n) {
        Scanner nhapten = new Scanner(System.in);
        Scanner nhapdiem = new Scanner(System.in);
        
        for(int i = 0; i < n; i++) {
            System.out.println("Nhap ten SV thu " +i + " : ");
            sv[i] = nhapten.nextLine();
            System.out.println("Nhap diem SV thu " +i + " : ");
            diem[i] = nhapdiem.nextDouble();
        }
    }
    
    public static void xuatSV(String sv[], double diem[], int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(sv[i] + " " + diem[i]);
            System.out.println("");
        }
    }
    
    public static void xepLoai(String sv[], double diem[], int n) {
        String hocLuc = "";
        for(int i = 0; i < n; i++) {
            if(diem[i] < 5){
                hocLuc = "Yeu";
            }
            else if(diem[i] < 6.5) {
                hocLuc = "Trung Binh";
            }
            else if(diem[i] < 7.5) {
                hocLuc = "Kha";
            }
            else if(diem[i] < 9) {
                hocLuc = "Gioi";
            }
            else {
                hocLuc = "Xuat Sac";
            }
            System.out.println("Ten SV : " + sv[i] + " " + "Diem : " + diem[i] + " " + "Hoc luc: " + hocLuc);
        }
    }
    
    public static void sapXepSVTheoDiem(String sv[], double diem[], int n) {
        for(int i = 0; i < n-1; i++) {
            for(int j = i + 1; j < n; j++) {
                if(diem[i] > diem[j]) {
                    double luuDiem = diem[i];
                    diem[i] = diem[j];
                    diem[j] = luuDiem;
                    
                    String luuTen = sv[i];
                    sv[i] = sv[j];
                    sv[j] = luuTen;
                }
            }
            System.out.println("Mang sau khi da sap xep: ");
            xuatSV(sv, diem, n);
        }
    }
    
}
