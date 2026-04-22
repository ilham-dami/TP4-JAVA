package exo3;

public class CompteEpargne extends Compte {

    double tauxInteret;

    public CompteEpargne(double solde, double tauxInteret) {
        super(solde);
        this.tauxInteret = tauxInteret;
    }

    public double calculerInterets() {
        return solde * tauxInteret;
    }

    public void ajouterInterets() {
        solde += calculerInterets();
    }

    public void afficher() {
        System.out.println("Compte Épargne | Solde : " + solde + " | Taux : " + tauxInteret);
    }
}

