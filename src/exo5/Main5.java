package exo5;

public class Main5 {
    public static void main(String[] args) {

        // Polymorphisme
        Figure f1 = new Cercle(0, 0, 5);
        Figure f2 = new Triangle(0, 0, 3, 4, 5);

        System.out.println("=== Dessin ===");
        f1.dessiner();
        f2.dessiner();

        System.out.println("\n=== Déplacement ===");
        f1.deplacer(2, 3);
        f2.deplacer(1, 1);

        System.out.println("\n=== Redimensionnement ===");
        f1.redimensionner(2);
        f2.redimensionner(2);

        System.out.println("\n=== Calculs spécifiques ===");

        if (f1 instanceof Cercle) {
            Cercle c = (Cercle) f1;
            System.out.println("Périmètre cercle : " + c.calculerPerimetre());
            System.out.println("Surface cercle : " + c.calculerSurface());
        }

        if (f2 instanceof Triangle) {
            Triangle t = (Triangle) f2;
            System.out.println("Périmètre triangle : " + t.calculerPerimetre());
            System.out.println("Surface triangle : " + t.calculerSurface());
        }
    }
}