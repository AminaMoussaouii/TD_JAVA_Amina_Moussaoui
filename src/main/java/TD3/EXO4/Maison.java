package TD3.EXO4;

public class Maison extends Batiment{
    private int nbChambres;

    public Maison() {
        super();
        this.nbChambres = 0;
    }

    public Maison(String adresse, int nbChambres) {
        super(adresse);
        this.nbChambres = nbChambres;
    }

    public int getNbChambres() {
        return nbChambres;
    }

    public void setNbChambres(int nbChambres) {
        this.nbChambres = nbChambres;
    }

    @Override
    public String toString() {
        return super.toString() + "Le nombre des chambres est : " + nbChambres;
    }
}
