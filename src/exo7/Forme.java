package exo7;

public abstract class Forme {

    // Méthode abstraite
    public abstract double calculerSurface();

    // Méthode concrète
    public void afficherDescription() {
        System.out.println("Ceci est une forme géométrique");
    }

    // Comparer deux formes
    public int comparerSurface(Forme f) {
        if (this.calculerSurface() > f.calculerSurface()) return 1;
        else if (this.calculerSurface() < f.calculerSurface()) return -1;
        else return 0;
    }
}