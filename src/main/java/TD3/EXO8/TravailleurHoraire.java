package TD3.EXO8;

class TravailleurHoraire implements Employe, RémunerationHoraire {
    private String nom;
    private String prenom;
    private double retribution;
    private double heures;

    public TravailleurHoraire(String nom, String prenom, double retribution) {
        this.nom = nom;
        this.prenom = prenom;
        this.retribution = retribution;
        this.heures = 0;
    }

    @Override
    public String getNom() {
        return nom;
    }

    @Override
    public String getPrenom() {
        return prenom;
    }

    @Override
    public double getRetribution() {
        return retribution;
    }

    @Override
    public void setRetribution(double retribution) {
        this.retribution = retribution;
    }

    @Override
    public double getHeures() {
        return heures;
    }

    @Override
    public void setHeures(double heures) {
        this.heures = heures;
    }

    @Override
    public double gains() {
        return retribution * heures;
    }

    @Override
    public String toString() {
        return "Le nom est : " + nom + ", Le  prénom est : " + prenom + ",la  rémunération horaire set : " + retribution +
                ",et les heures: " + heures;
    }
}
