package TD1;

import java.util.Scanner;

public class Exo5Tableaux {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Entrez la taille du tableau : ");
                int taille = scanner.nextInt();
                char[] T1 = new char[taille];
                System.out.println("Remplissez le tableau T1 :");
                for (int i = 0; i < taille; i++) {
                    System.out.print("T1[" + i + "] : ");
                    T1[i] = scanner.next().charAt(0);
                }
                char[] T2 = new char[taille];
                for (int i = 0; i < taille - 1; i++) {
                    T2[i] = T1[i + 1];
                }
                T2[taille - 1] = T1[0];
                System.out.println("Le tableau T2 résultant est :");
                for (int i = 0; i < taille; i++) {
                    System.out.println("T2[" + i + "] : " + T2[i]);
                }

    }}
