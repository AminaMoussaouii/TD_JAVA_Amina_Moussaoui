package TD1;

import java.util.Scanner;

public class Exo3Tableaux {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entrez le nombre d'étudiants");
        int N=sc.nextInt();
        int i;
        float[] Tab=new float[N];
        for(i=0;i<N;i++){
            System.out.println("Entrer la note de l'étudiant numéro:"+i);
            Tab[i]=sc.nextFloat();
        }
        System.out.println("Entere le seuil");
        float S=sc.nextFloat();
        int count=0;
        for(i=0;i<N;i++){
            if(Tab[i]>=S){
                count+=1;
            }
        }
        System.out.println("le nombre d'étudiants ayant une moyenne supérieur ou égale à la seuil  "+S+" est : "+count);



    }
}
