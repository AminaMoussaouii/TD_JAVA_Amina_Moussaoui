package TD3.EXO2;
    class PointNom extends Point {
        private char nom;

        public PointNom(int x, int y, char nom) {
            super(x, y);
            this.nom = nom;
        }
        public void setPointNom(int x, int y, char nom) {
            super.deplacer(x - this.getX(), y - this.getY());
            this.nom = nom;
        }

        public void setNom(char nom) {

            this.nom = nom;
        }

        public void affCoordNom() {
            System.out.println("Les Coordonnees du point sont : " + this.getX() + " " + this.getY() + "et le nom est : " + nom);
        }
    }


