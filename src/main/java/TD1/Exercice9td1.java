package TD1;

import java.util.Scanner;

public class Exercice9td1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("entrer le premier nombre:");
        int x=sc.nextInt();
        System.out.println("entrer le deuxième nombre:");
        int y=sc.nextInt();
        if(x<y){
            System.out.println(x+"  "+y);
        }
        else
            System.out.println(y+"   "+x);


    }
}
