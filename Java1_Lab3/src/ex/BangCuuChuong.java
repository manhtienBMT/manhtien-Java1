package ex;

/**
 *
 * @author manht
 */
public class BangCuuChuong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++) {
            System.out.println("Bang cuu chuong" +i);
            for(int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j);
                System.out.println("");
            }
        }
        
    }
    
}
