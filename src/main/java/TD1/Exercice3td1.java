package TD1;
import java.util.Scanner;
public class Exercice3td1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("donner le premier variable:");
        double a = sc.nextDouble();
        System.out.println("donner le deuxième variable");
        double b = sc.nextDouble();
        double s = a + b;
        double p = a * b;
        System.out.println("Choisir un nombre:\n" +
                "1-savoir si la somme est paire\n" +
                "2-savoir si le produit est paire\n" +
                "3-savoir le signe de la somme\n" +
                "4-savoir le signe du produit\n");
        int choix = sc.nextInt();
        switch (choix) {
            case 1:
                if (s % 2 == 0) {
                    System.out.println("la somme est paire");
                } else System.out.println("la somme est impaire");
                break;
            case 2:
                if (p % 2 == 0) {
                    System.out.println("le produit est paire");
                } else System.out.println("le produit est impaire");
                break;
            case 3:
                if (s > 0) {
                    System.out.println("la somme est positive");
                } else if (s < 0) {
                    System.out.println("la somme est négative");
                } else System.out.println("la somme est nulle");
                break;
            case 4:
                if (p > 0) {
                    System.out.println("le produit est positif");
                } else if (p < 0) {
                    System.out.println("le produit est négatif");
                } else System.out.println("le produit est nul");
                break;
            default:
                System.out.println("entrer un nombre parmi les choix proposés");
        }
    }
}
