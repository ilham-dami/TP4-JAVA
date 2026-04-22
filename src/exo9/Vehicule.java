package exo9;

public abstract class Vehicule {

    protected int vitesse;

    public Vehicule(int vitesse) {
        this.vitesse = vitesse;
    }

    public void accelerer() {
        vitesse += 10;
        System.out.println("Accélération → vitesse : " + vitesse);
    }

    public void freiner() {
        vitesse -= 10;
        if (vitesse < 0) vitesse = 0;
        System.out.println("Freinage → vitesse : " + vitesse);
    }

    // Méthode abstraite
    public abstract void demarrer();
}