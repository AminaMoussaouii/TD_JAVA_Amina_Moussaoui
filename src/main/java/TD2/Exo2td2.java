package TD2;

public class Exo2td2 {
    public static class Point{
        private char nom;
        private double x;
        private double y;
        public Point(){};
        public Point(char nom,double x,double y){
            this.nom=nom;
            this.x=x;
            this.y=y;
        }
        public void setNom(char nom){
            this.nom=nom;
        }
        public void setX(double x){
            this.x=x;
        }
        public void setY(double y){
            this.y=y;
        }
        public double getX(){
            return x;
        }

        public char getNom() {
            return nom;
        }

        public double getY() {
            return y;
        }
        private double distance;
        public double Norme(){
            distance=Math.sqrt(x*x+y*y);
            return distance;
        }

    }
    public static void main(String[] args){
        Point point1 = new Point('A',3.5,4.5);
        point1.getX();
        System.out.println("voila la norme de ce point par rapport à l'origine du repère :"+point1.Norme());

    }
}
