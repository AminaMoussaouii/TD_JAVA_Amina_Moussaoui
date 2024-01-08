package TD1;

import java.util.Scanner;
public class Exercice3boucles {
    public static void main(String[]args){
                Scanner scanner = new Scanner(System.in);
                int max= Integer.MIN_VALUE;
                //max
                for (int i = 1; i <= 20; i++) {
                    System.out.print("Entrez le nombre " + i + " : ");
                    int n= scanner.nextInt();

                    if (n > max) {
                        max = n;
                    }
                }

                System.out.println("Le maximum parmi les 20 nombres est : " + max);
                //position
                System.out.println("Afficher la position du maximum parmi les 20 nombres saisis");

                int max2= Integer.MIN_VALUE;
                int position = 0;

                for (int i = 1; i <= 20; i++) {
                    System.out.print("Entrez le nombre " + i + " : ");
                    int n = scanner.nextInt();

                    if (n> max2) {
                        max2 = n;
                        position = i;
                    }
                }

                System.out.println("Le maximum parmi les 20 nombres est : " + max2 +"Il se trouve dans la position : " + position);
                //3
                int max3 = Integer.MIN_VALUE;
                int n;

                do {
                    System.out.print("Entrez un nombre (0 pour terminer) : ");
                    n = scanner.nextInt();

                    if (n != 0 && n > max3) {
                        max3 = n;
                    }
                } while (n != 0);

                System.out.println("Le maximum de la suite saisie est : " + max3);

                scanner.close();
            }
        }
