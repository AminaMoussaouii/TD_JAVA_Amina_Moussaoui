package TD2;

public class Exo1td2 {
    public static class Point {
        private char nom;
        private double abscisse;

        public Point(char nom, double abscisse) {
            this.nom = nom;
            this.abscisse = abscisse;
        }

        public void affiche() {
            System.out.println("Point " + nom + " : Abscisse = " + abscisse);
        }

        public void translate(double dx) {
            abscisse += dx;
        }
    }

    public static void main(String[] args) {
        Point pointA = new Point('C', 2.3);
        System.out.println("Avant translation :");
        pointA.affiche();
        pointA.translate(4.0);
        System.out.println("Après translation :");
        pointA.affiche();
    }
}
