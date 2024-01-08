package TD1;
import java.util.Scanner;

public class Exercice1td1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrez trois variables");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double Vmax=Math.max(Math.max(a,b),c);
        System.out.println("la valeur maximale des trois variables est :"+Vmax);

    }
}
