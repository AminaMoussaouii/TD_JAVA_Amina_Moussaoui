package TD1;

import java.util.Scanner;

public class Exo1Tableaux {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("saisir la longueur du tableau:");
        int N=sc.nextInt();
        if(N<10 || N>50){
            System.out.println("entrer une longueur du tableau comprise entre 10 et 50 ");
            return;
        }
        int[] Tableau=new int[N];
        System.out.println("remplir votre tableau selon la longueur que vous venez de préciser");
        for(int i=0;i<N;i++){
            Tableau[i]=sc.nextInt();
        }
        System.out.println("voilà le tableau que vous avez rempli:\n");
        for (int i = 0; i < Tableau.length; i++) {
            System.out.print(Tableau[i] + " ");
        }
        System.out.println("\n");
        int max=Tableau[0];
        int min=Tableau[0];
        for(int i=1;i<N;i++){
            if(Tableau[i]<min){
                min=Tableau[i];
            }
            if(Tableau[i]>max){
                max=Tableau[i];
            }
        }
        System.out.println("la valeur maximale de votre tableau est : max="+max+"\n"+
                "la valeur minimale de votre tableau est : min="+min);

    }
}
