package TD3.EXO2;

public class Point {
        private int x, y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void deplacer(int dx, int dy) {
            x += dx;
            y += dy;
        }

        public void affCoord() {
            System.out.println("Les Coordonnees sont : " + x + " " + y);
        }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}


