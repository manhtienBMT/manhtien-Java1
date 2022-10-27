package ex;

import java.util.Scanner;

/**
 *
 * @author manht
 */
public class SoNguyenTo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int n;
        boolean ok = true;
        
        System.out.println("Nhap n: ");
        n = nhap.nextInt();
        
        for(int i = 2; i < n - 1; i++) {
            if(n % i == 0) {
                ok = false;
                break;
            }
            i++;
        }
        if(ok == true) {
            System.out.println("La so nguyen to");
        }
        else {
            System.out.println("Khong la so nguyen to");
        }
    }
    
}
