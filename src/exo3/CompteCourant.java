package exo3;

public class CompteCourant extends Compte {

    double decouvertAutorise;

    public CompteCourant(double solde, double decouvertAutorise) {
        super(solde);
        this.decouvertAutorise = decouvertAutorise;
    }

    // Autoriser le découvert
    public void autoriserDecouvert(double montant) {
        this.decouvertAutorise = montant;
    }

    // Redéfinition de retirer()
    
    public void retirer(double montant) {
        if (montant <= solde + decouvertAutorise) {
            solde -= montant;
        } else {
            System.out.println("Dépassement du découvert autorisé !");
        }
    }

    public double calculerFrais() {
        return solde < 0 ? 50 : 0; // exemple simple
    }

 
    public void afficher() {
        System.out.println("Compte Courant | Solde : " + solde + " | Découvert autorisé : " + decouvertAutorise);
    }
}