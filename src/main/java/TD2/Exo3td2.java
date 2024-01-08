package TD2;

public class Exo3td2 {
    public static class Livre {
        private String titre;
        private String auteur;
        private double prix;
        private int annee;
        public Livre() {
        }
        public Livre(String titre) {
            this.titre = titre;
        }
        public Livre(String titre, String auteur) {
            this.titre = titre;
            this.auteur = auteur;
        }

        public Livre(String titre, String auteur, double prix) {
            this.titre = titre;
            this.auteur = auteur;
            this.prix = prix;
        }

        public Livre(String titre, String auteur, double prix, int annee) {
            this.titre = titre;
            this.auteur = auteur;
            this.prix = prix;
            this.annee = annee;
        }

        public Livre(Livre livre) {
            this.titre = livre.titre;
            this.auteur = livre.auteur;
            this.prix = livre.prix;
            this.annee = livre.annee;
        }
        public String toString() {
            return "Livre{" +
                    "titre='" + titre + '\'' +
                    ", auteur='" + auteur + '\'' +
                    ", prix=" + prix +
                    ", annee=" + annee +
                    '}';
        }
        public String getTitre() {
            return titre;
        }

        public void setTitre(String titre) {
            this.titre = titre;
        }

        public String getAuteur() {
            return auteur;
        }

        public void setAuteur(String auteur) {
            this.auteur = auteur;
        }

        public double getPrix() {
            return prix;
        }

        public void setPrix(double prix) {
            this.prix = prix;
        }

        public int getAnnee() {
            return annee;
        }

        public void setAnnee(int annee) {
            this.annee = annee;
        }

        public static void main(String[] args) {
            Livre livre1 = new Livre();
            Livre livre2 = new Livre("Boite à merveilles ");
            Livre livre3 = new Livre("Antigone", "Victor Hugo");
            Livre livre4 = new Livre("EloquentJavascript", " Marijn Haverbeke", 45.52);
            Livre livre5 = new Livre("EloquentJavascript", " Marijn Haverbeke", 45.55, 2011);
            Livre livre6 = new Livre(livre5);

            System.out.println("Livre 1 :\n" + livre1);
            System.out.println("Livre 2 :\n" + livre2);
            System.out.println("Livre 3 :\n" + livre3);
            System.out.println("Livre 4 :\n" + livre4);
            System.out.println("Livre 5 :\n" + livre5);
            System.out.println("Livre 6 (copie de Livre 5) :\n" + livre6);
        }
    }

}
