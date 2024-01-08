package TD1;
import java.util.Random;
public class Exo6boucles {
    public static void main(String[] args) {
                Random random = new Random();
                for (int i =1; i < 10; i++) {
                    int n1 = random.nextInt(9) ;
                    int n2 = random.nextInt(9) ;
                    int n3 = 15 - n1 - n2;
                    if (n3 >= 1 && n3 <= 9) {
                        System.out.println("possiblité " + (i) + ": " + n1 + " + " + n2 + " + " + n3 + " = 15");
                    } else {
                        i--;
                    }
                }
    }}

