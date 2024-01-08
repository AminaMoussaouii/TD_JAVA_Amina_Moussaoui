package TD1;

import java.util.Scanner;

public class Exercice4td1 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("entrez la mention de l'étudiant");
         double N=sc.nextDouble();
         if(N>=16){
             System.out.println(" Très bien");
         }
         else if(N>=14 && N<16){
             System.out.println("Bien");
         }
         else if(N<14 && N>=12){
             System.out.println("assez bien");
         }
         else if(N<12 && N>=10){
             System.out.println("Passable");
         }
         else
             System.out.println("Non validé");

    }
}
