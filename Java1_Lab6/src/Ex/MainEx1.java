package Ex;

import java.util.Scanner;

/**
 *
 * @author manht
 */
public class MainEx1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String fullname = sc.nextLine();
        String ho = fullname.substring(0, fullname.indexOf(" "));
        String tenDem = fullname.substring(fullname.indexOf(" ") + 1, fullname.lastIndexOf(" "));
        String ten = fullname.substring(fullname.lastIndexOf(" ") + 1);
        System.out.println("Ho: "+ho.toUpperCase() + " | " + "Ten Dem: " +tenDem + " | " + "Ten: " +ten.toUpperCase());
    }

}
