package TD3.EXO8;

public class TestEmploye {
    public static void main(String[] args) {
        Employe patron = new Patron("Alaoui", "Ahmed", 10000);
        Employe travailleurCommission = new TravailleurCommission("Maria", "Manal", 9500, 100);
        Employe travailleurHoraire = new TravailleurHoraire("Sabik", "Saad", 120);

        System.out.println(patron.toString() + " "+" Les gains: " + patron.gains());
        System.out.println(travailleurCommission.toString() + " " + " les gains: " + travailleurCommission.gains());
        System.out.println(travailleurHoraire.toString() + " " +" Les gains: " + travailleurHoraire.gains());
    }
}
