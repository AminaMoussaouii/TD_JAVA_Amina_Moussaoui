package TD3.EXO7;

public class TestEmploye {
    public static void main(String[] args) {
        Patron patron = new Patron("Alami", "Driss", 8500);
        TravailleurCommission travailleurCommission = new TravailleurCommission("Ali", "Mohammed", 9000, 50);
        TravailleurHoraire travailleurHoraire = new TravailleurHoraire("ELMalki", "Hanae", 150);

        System.out.println(patron.toString() + " "+" les gains: " + patron.gains());
        System.out.println(travailleurCommission.toString() + " "+" les gains: " + travailleurCommission.gains());
        System.out.println(travailleurHoraire.toString() + " "+" les gains: " + travailleurHoraire.gains());
    }
}
