package TD1;
import java.util.Scanner;
public class Exercice5td1 {
    public static void main(String[]args){
                Scanner scanner = new Scanner(System.in);

                System.out.print("Entrez l'heure (0-23) : ");
                int heure = scanner.nextInt();
                System.out.print("Choisissez la langue (f pour français, a pour anglais) : ");
                char choixLangue = scanner.next().charAt(0);
                switch (choixLangue) {
                    case 'f':
                        if (heure >= 0 && heure < 18) {
                            System.out.println("Bonjour");
                        } else if (heure >= 18 && heure < 22) {
                            System.out.println("Bonsoir");

                        } else {
                            System.out.println("Bonne nuit");
                        }
                        break;
                    case 'a':
                        if (heure >= 0 && heure < 18) {
                            System.out.println("Good Morning");
                        } else if (heure >= 18 && heure < 22) {
                            System.out.println("Good Evening");
                        } else {
                            System.out.println("Good Night");
                        }
                        break;
                    default:
                        System.out.println("Choix de langue invalide.");
                }
            }
        }

