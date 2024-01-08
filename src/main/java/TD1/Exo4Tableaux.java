package TD1;

import java.util.Scanner;

public class Exo4Tableaux {
    private static double[][] saisirMatrice(int taille) {
        Scanner sc = new Scanner(System.in);
        double[][] matrice = new double[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print("Entrez l'élément à la position [" + i + "][" + j + "] : ");
                matrice[i][j] = sc.nextDouble();
            }
        }
        return matrice;
    }
    private static double[][] additionnerMatrices(double[][] matrice1, double[][] matrice2) {
        int taille = matrice1.length;
        double[][] somme = new double[taille][taille];

        for (int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                somme[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        return somme;
    }

    private static void afficherMatrice(double[][] matrice) {
        int taille = matrice.length;

        for(int i = 0; i < taille; i++) {
            for (int j = 0; j < taille; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        } }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
                System.out.print("Entrez la taille de la matrice carrée : ");
                int taille = sc.nextInt();
                System.out.println("Saisie de la première matrice :");
                double[][] matrice1 = saisirMatrice(taille);
                System.out.println("Saisie de la deuxième matrice :");
                double[][] matrice2 = saisirMatrice(taille);
                double[][] somme = additionnerMatrices(matrice1, matrice2);
                System.out.println("La somme des matrices est :");
                afficherMatrice(somme);
            }
}



