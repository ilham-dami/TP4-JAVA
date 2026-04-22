package exo5;

public class Cercle extends Figure {

    private double rayon;

    public Cercle(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    
    public void dessiner() {
        System.out.println("Dessiner un cercle de rayon " + rayon);
    }

    
    public void redimensionner(double facteur) {
        rayon *= facteur;
    }

    public double calculerPerimetre() {
        return 2 * Math.PI * rayon;
    }

    public double calculerSurface() {
        return Math.PI * rayon * rayon;
    }
}