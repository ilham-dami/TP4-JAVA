package exo7;

public class Cercle extends Forme {

    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

   
    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }

    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    public boolean validerDimensions() {
        return rayon > 0;
    }
}