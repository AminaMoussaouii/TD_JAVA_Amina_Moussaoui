package TD1;

import java.util.Scanner;

public class Exercice2td1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrez les facterus successifs de votre équation du second degré");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Votre équation est:"+a+"x~2+"+b+"x+"+c+"=0");
        double delt=b*b - 4*a*c;
        double x,x1,x2;
        if(delt==0){
            x=(-b)/2*a;
            System.out.println("la solution de votre équation est: x="+x);
        }
        else if(delt>0){
            x1=(-b+Math.sqrt(delt))/2*a;
            x2=(-b-Math.sqrt(delt))/2*a;
            System.out.println("votre équation posséde deux solutions qui sont : x1="+x1+"x2="+x2);
        }
        else {
            System.out.println("votre équation n'a pas de solution");
        }
    }
}
