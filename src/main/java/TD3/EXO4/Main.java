package TD3.EXO4;

public class Main {
    public static void main(String[] args) {
        Batiment batiment = new Batiment("5 Rue de Zerktouni smaala");
        System.out.println(batiment);

        Maison maison = new Maison("1012 Avenue Dimachq EL KAMAL  ", 4);
        System.out.println(maison);

        Immeuble immeuble = new Immeuble("1502 EL Farah", 12);
        System.out.println(immeuble);
    }
}
