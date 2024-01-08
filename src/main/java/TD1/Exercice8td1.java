package TD1;

import java.util.Scanner;

public class Exercice8td1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrer le nombre du mois");
        int mois=sc.nextInt();
        switch(mois){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("le nombre de jours de ce mois est 31j");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("le nombre de jours de ce mois est : 30j");
                break;
            case 2:
                System.out.println("entrer l'année:");
                int annee=sc.nextInt();
                if(annee%4==0 && annee%100!=0){
                    System.out.println(" cette année est bisextille, et le nombre de jours du mois février est 29 ");
                }
                else if(annee%400==0){
                    System.out.println("cette année est bisextille, et le nombre de jours du mois février est 29 ");
                }
                else System.out.println("le nombre de jours du mois de février est 28j");
                break;
            default:
                System.out.println("entrer un nombre de mois valide compris entre 1 et 12");
        }

    }
}
