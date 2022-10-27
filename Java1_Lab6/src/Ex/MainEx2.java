package Ex;

import entity.SanPham;
import java.util.ArrayList;

/**
 *
 * @author manht
 */
public class MainEx2 {

    public static void main(String[] args) {
        ArrayList<SanPham> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            SanPham sp = new SanPham();
            sp.nhap();
            list.add(sp);
        }
        
        for (SanPham sp : list) {
            if (sp.getHang().equalsIgnoreCase("Nokia")) {
                sp.xuat();
                System.out.println("");
            }
        }
    }
    
}
