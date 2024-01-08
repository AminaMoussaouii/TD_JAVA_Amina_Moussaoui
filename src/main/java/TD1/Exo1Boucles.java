package TD1;

import java.util.Scanner;

public class Exo1Boucles {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
                System.out.print("Entrez un entier naturel N : ");
                int N = sc.nextInt();
                    long f=N;

                    for (int i = 1; i <N; i++) {
                        f=f*(N-i);
                    }

                    System.out.println("Le factoriel de " + N + " est : " + f);
                }

            }