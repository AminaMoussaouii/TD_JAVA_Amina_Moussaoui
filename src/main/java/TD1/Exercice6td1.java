package TD1;

import java.util.Scanner;

public class Exercice6td1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrez deux enties");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if((a<0 && b<0) || (a>0 && b>0) ){
            System.out.println("le produit des nombres est positifs");
        }
        else if((a>0 && b<0)|| (a<0 && b>0)){
            System.out.println("le produit est négatif");
        }
        else System.out.println("le produit est nul");

    }
}
