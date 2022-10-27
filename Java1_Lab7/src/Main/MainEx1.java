package Main;

import entity.ChuNhat;
import entity.Vuong;

/**
 *
 * @author manht
 */
public class MainEx1 {

    public static void main(String[] args) {
        ChuNhat cn1 = new ChuNhat(4,5);
        cn1.xuat();
        System.out.println();
        Vuong hv1 = new Vuong(5);
        hv1.xuat();
    }
}
