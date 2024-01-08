package TD2;

public class Exercice6td2 {
    public static class Compte{
        private  int Ncompte;
        private float solde;
        private String cin;
        public Compte(){}
        public Compte(int Ncompte,float solde,String cin){
            this.cin=cin;
            this.Ncompte=Ncompte;
            this.solde=solde;
        }
        public Compte(Compte compte){
            this.cin=compte.cin;
            this.solde=compte.solde;
            this.Ncompte=compte.Ncompte;
        }

        private float somme;
        public void deposer(float somme){
            solde=solde+somme;
        }
        public void retirer(float somme){
            if(somme<=solde){
            solde=solde-somme;
        }else System.out.println("la somme que vous voulez retirer est superieure à votre solde actuel");

        }
        public float avoirsolde(){
            return solde;
        }
        public String avoirInf(){
            return ("le numero de votre compte est:"+Ncompte+"\n"+
                    "votre solde est:"+solde+"\n"+
                    "votre cin est:"+ cin);
        }


    }

    public static void main(String[] args) {
        Compte compte=new Compte(1245897,1458,"J587");
        System.out.println(" les infos de votre compte:");
        compte.avoirInf();
        System.out.println("votre solde est:");
        compte.avoirsolde();
        System.out.println("veuillez déposer une somme:");
        compte.deposer(1589);
        System.out.println("votre solde après dépot est:");
        compte.avoirsolde();
        System.out.println("saisir la somme à retirer");
        compte.retirer(124);

    }


}
