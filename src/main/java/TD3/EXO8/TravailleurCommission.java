package TD3.EXO8;

class TravailleurCommission implements Employe, Salaire, Commission {
    private String nom;
    private String prenom;
    private double salaire;
    private double commission;
    private int quantite;

    public TravailleurCommission(String nom, String prenom, double salaire, double commission) {
        this.salaire = salaire;
        this.commission = commission;
        this.quantite = 0;
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
    public double getSalaire() {
        return salaire;
    }

    @Override
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public double getCommission() {
        return commission;
    }

    @Override
    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public int getQuantite() {
        return quantite;
    }

    @Override
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public double gains() {
        return salaire + commission * quantite;
    }

    @Override
    public String toString() {
        return "Le nom est : " + nom + "Le Prénom est : " + prenom + ", Le Salaire set : " + salaire +
                ",La Commission est: " + commission + ", et la Quantité est : " + quantite;
    }
}
