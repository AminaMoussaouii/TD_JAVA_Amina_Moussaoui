package TD1;

import java.util.Scanner;

public class Exo2Tbleaux {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrez l'entier N que vous voulez convertir en binaire:");
        int N=sc.nextInt();
        int i;
        int[] tab=new int[100];
        for( i=0;N>0;i++){

            tab[i]=N%2;
            N=N/2;
        }
        System.out.println("le nombre "+N+"en binaire est:");
        for( i=i-1 ; i>=0;i--){
            System.out.println(tab[i]);
        }


    }
}
