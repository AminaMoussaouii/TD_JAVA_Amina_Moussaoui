package TD1;

import java.util.Scanner;

public class Exercie7td1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
                    System.out.print("Entrez un entier de trois chiffres non nuls : ");
                    int n = sc.nextInt();
                String chiffre= Integer.toString(n);
                System.out.print("Les nombres formés par les chiffres de N sont : ");
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        for (int k = 0; k < 3; k++) {
                            if (i != j && i != k && j != k) {
                                System.out.print(chiffre.charAt(i) + "" + chiffre.charAt(j) + "" + chiffre.charAt(k) + ", ");
                            }
                        }
                    }
                }

     }
}
