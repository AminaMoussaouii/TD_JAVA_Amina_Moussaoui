package TD3.EXO8;

public class EmployeA implements Employe{
    protected String nom;
    protected String prenom;

    public EmployeA(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
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
    public double gains() {
        return 0;
    }

    @Override
    public String toString() {
        return "Nom: " + nom + ", et prénom: " + prenom;
    }
}
