package exo2;

public class Vehicule {

    protected String marque;

    // Constructor
    public Vehicule(String marque) {
        this.marque = marque;
    }

    public void afficherMarque() {
        System.out.println("Marque : " + marque);
    }

    public void demarrer() {
        System.out.println("Le véhicule démarre");
    }

    public void arreter() {
        System.out.println("Le véhicule s'arrête");
    }
}


