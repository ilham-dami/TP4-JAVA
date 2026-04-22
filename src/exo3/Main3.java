package exo3;

public class Main3 {
    public static void main(String[] args) {

        // Compte courant
        CompteCourant cc = new CompteCourant(1000, 500);
        cc.retirer(1300); // autorisé grâce au découvert
        cc.afficher();
        System.out.println("Frais : " + cc.calculerFrais());

        System.out.println("\n------------------\n");

        // Compte épargne
        CompteEpargne ce = new CompteEpargne(2000, 0.05);
        ce.ajouterInterets();
        ce.afficher();
    }
}