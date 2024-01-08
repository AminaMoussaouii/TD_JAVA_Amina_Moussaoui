package TD2;

public class Exo5td2 {
    public static class Rectangle {
        private double longueur;
        private double largeur;

        public Rectangle() {}

        public Rectangle(double longueur, double largeur) {
            setLongueur(longueur);
            setLargeur(largeur);
        }

        public Rectangle(Rectangle rectangle) {
            this.longueur = rectangle.longueur;
            this.largeur = rectangle.largeur;
        }

        public double getLongueur() {
            return longueur;
        }

        public void setLongueur(double longueur) {
            if (longueur > 0) {
                this.longueur = longueur;
            } else {
                System.out.println("La longueur doit être positive.");
            }
        }
        public double getLargeur() {
            return largeur;
        }

        public void setLargeur(double largeur) {
            if (largeur > 0) {
                this.largeur = largeur;
            } else {
                System.out.println("La largeur doit être positive.");
            }
        }
        public double perimetre() {
            return 2 * (longueur + largeur);
        }

        public double aire() {
            return longueur * largeur;
        }

        public boolean isCarre() {
            return longueur == largeur;
        }

        @Override
        public String toString() {
            return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
        }
    }
        public static void main(String[] args) {
            Rectangle rectangle = new Rectangle(5, 8);

            System.out.println("Rectangle  : " + rectangle.toString());
            System.out.println("voilà le Périmètre : " + rectangle.perimetre());
            System.out.println("voilà l'Aire : " + rectangle.aire());
            System.out.println("Est-il un carré ? " + rectangle.isCarre());


            Rectangle Carre = new Rectangle(4, 4);
            System.out.println("\nRectangle Carré : " + Carre.toString()+"\n");
            System.out.println("le Périmètre est  : " + Carre.perimetre()+"\n");
            System.out.println("l'Aire est  : " + Carre.aire()+"\n");
            System.out.println("Est-il un carré ? " + Carre.isCarre());

        }




}
