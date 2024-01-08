package TD1;

import java.util.Scanner;

public class Exo5boucles {
    private static long calculerFibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return calculerFibonacci(n - 1) + calculerFibonacci(n - 2);
        }
    }
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Entrez un entier positif n : ");
                int n = scanner.nextInt();
                    long result = calculerFibonacci(n);
                    System.out.println("Le " + n + "-ème terme de la suite de Fibonacci est : " + result);
            }

        }