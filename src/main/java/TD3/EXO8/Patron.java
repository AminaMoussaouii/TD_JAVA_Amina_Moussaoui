package TD3.EXO8;

class Patron implements Employe, Salaire {
    private String nom;
    private String prenom;
    private double salaire;

    public Patron(String nom, String prenom, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
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
    public double gains() {
        return salaire;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", et prénom: " + prenom + ", et le salaire: " + salaire;
    }
}
