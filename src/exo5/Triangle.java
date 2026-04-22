package exo5;

public class Triangle extends Figure {

    double a, b, c;

    public Triangle(double x, double y, double a, double b, double c) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

   
    public void dessiner() {
        System.out.println("Dessiner un triangle");
    }

   
    public void redimensionner(double facteur) {
        a *= facteur;
        b *= facteur;
        c *= facteur;
    }

    public double calculerPerimetre() {
        return a + b + c;
    }

    public double calculerSurface() {
        // Formule de Heron
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}