package entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author manht
 */
public class DanhSachSinhVien {
    ArrayList<SinhVienPoly> list = new ArrayList<>();

    public void nhap() {
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("\nNhap ho ten sinh vien: ");
            String hoTen = scanner.nextLine();
            if (hoTen == null || hoTen.equals("")) {
                break;
            }
            System.out.print("Nhap ten nganh (IT/Biz): ");
            String nganh = scanner.nextLine();
            if (nganh.equalsIgnoreCase("IT")) {
                System.out.print("Diem Java: ");
                double diemJava = scanner.nextDouble();
                System.out.print("Nhap diem CSS: ");
                double diemCss = scanner.nextDouble();
                System.out.print("Nhap diem HTML: ");
                double diemHtml = scanner.nextDouble();
                SinhVienPoly newSV = new SinhVienIT(hoTen, nganh, diemJava, diemCss, diemHtml);
                list.add(newSV);
            } else if (nganh.equalsIgnoreCase("Biz")) {
                System.out.print("Nhap diem Marketting: ");
                double diemMarketting = scanner.nextDouble();
                System.out.print("Nhap diem Sales: ");
                double diemSales = scanner.nextDouble();
                SinhVienPoly newSV = new SinhVienBiz(hoTen, nganh, diemMarketting, diemSales);
                list.add(newSV);
            }
        } while (true);
    }

    public void xuat() {
        for (SinhVienPoly sv : list) {
            System.out.println("");
            System.out.printf("Ho ten: %s | Nganh: %s | DiemTB: %.2f Hoc luc: %s\n", sv.getHoTen(), sv.getNganh(), sv.getDiem(), sv.getHocLuc());
        }
    }

    public void xuatGioi() {
        for (SinhVienPoly sv : list) {
            if (sv.getHocLuc().equalsIgnoreCase("Gioi")) {
                System.out.println("");
                System.out.printf("Ho ten: %s | Nganh: %s DiemTB: %.2f Hoc luc: %s\n", sv.getHoTen(), sv.getNganh(), sv.getDiem(), sv.getHocLuc());
            }
        }
        
    }

    Comparator<SinhVienPoly> comp = new Comparator<SinhVienPoly>() {
        @Override
        public int compare(SinhVienPoly o1, SinhVienPoly o2) {
            return Double.compare(o1.getDiem(), o2.getDiem());
        }
    };

    public void sapXepTheoDiem() {
        Collections.sort(list, comp);
        System.out.println("\nSap xep tang dan theo diem");
        xuat();
    }

    public void menu() {
        Scanner s = new Scanner(System.in);
        int chon = 0;
        do {
            System.out.println("\nMenu chuong trinh");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat danh sach sinh vien");
            System.out.println("3. Xuat danh sách sinh vien co học luc gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo điem");
            System.out.println("0. Thoat");
            System.out.print("Moi ban chon: ");

            chon = s.nextInt();
            if (chon != 0) {
                switch (chon) {
                    case 0:
                        System.out.println("Ban da ket thuc!");
                        break;
                    case 1:
                        nhap();
                        break;
                    case 2:
                        xuat();
                        break;
                    case 3:
                        xuatGioi();
                        break;
                    case 4:
                        sapXepTheoDiem();
                        break;
                    default:
                        System.out.println("Nhap sai, nhap lai!");
                }
            }

        } while (chon != 0);
    }
    
}
