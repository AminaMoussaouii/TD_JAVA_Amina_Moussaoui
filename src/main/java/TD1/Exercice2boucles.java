package TD1;

import java.util.Scanner;

public class Exercice2boucles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entrez un entier N : ");
        int N = sc.nextInt();
        int M,S=0;
        for(int i=1; i<N;i++){
            M=N-i;
            if(M%2!=0){
                S=S+M;
            }
        }
        System.out.println("la somme est:"+S);
    }
}
