package exo7;

public class Rectangle extends Forme {

    double longueur;
    double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

   
    public double calculerSurface() {
        return longueur * largeur;
    }

    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }

    public boolean validerDimensions() {
        return longueur > 0 && largeur > 0;
    }
}