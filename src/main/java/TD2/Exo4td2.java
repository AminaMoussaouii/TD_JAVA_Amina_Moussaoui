package TD2;

public class Exo4td2 {
    public static class Temps {
        private int heures;
        private int minutes;
        private int secondes;

        // Constructeurs
        public Temps() {}

        public Temps(int heures) {
            this.heures = heures;
        }

        public Temps(int heures, int minutes) {
            this.heures = heures;
            this.minutes = minutes;
        }

        public Temps(int heures, int minutes, int secondes) {
            this.heures = heures;
            this.minutes = minutes;
            this.secondes = secondes;
        }

        public Temps(Temps temps) {
            this.heures = temps.heures;
            this.minutes = temps.minutes;
            this.secondes = temps.secondes;
        }
        public int getHeures() {
            return heures;
        }

        public void setHeures(int heures) {
            this.heures = heures;
        }

        public int getMinutes() {
            return minutes;
        }

        public void setMinutes(int minutes) {
            this.minutes = minutes;
        }

        public int getSecondes() {
            return secondes;
        }

        public void setSecondes(int secondes) {
            this.secondes = secondes;
        }

        public void ajouterHeures(int heures) {
            this.heures = (this.heures + heures) % 24;
        }

        public void ajouterMinutes(int minutes) {
            this.minutes = (this.minutes + minutes) % 60;
            ajouterHeures((this.minutes + minutes) / 60);
        }

        public void ajouterSecondes(int secondes) {
            this.secondes = (this.secondes + secondes) % 60;
            ajouterMinutes((this.secondes + secondes) / 60);
        }

        @Override
        public String toString() {
            return("heures="+heures+
                    "minutes="+minutes+
                    "secondes"+secondes);
        }
    }
        public static void main(String[] args) {
            Temps temps1 = new Temps(10, 30, 45);
            System.out.println("Temps actuel : " + temps1);

            Temps temps2 = new Temps();
            temps2.setHeures(5);
            temps2.setMinutes(45);
            temps2.setSecondes(15);

            System.out.println("Temps à ajouter : " + temps2);

            temps1.ajouterHeures(2);
            temps1.ajouterMinutes(15);
            temps1.ajouterSecondes(30);
            System.out.println("Temps après l'ajout : " + temps1);
        }



}
