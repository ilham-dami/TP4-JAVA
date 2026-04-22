package exo5;

public class Figure {

    protected double x;
    protected double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void dessiner() {
        System.out.println("Dessiner une figure...");
    }

    public void deplacer(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public void redimensionner(double facteur) {
        System.out.println("Redimensionnement avec facteur : " + facteur);
    }
}