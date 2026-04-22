package exo7;

public class Main7 {
    public static void main(String[] args) {

        Forme f1 = new Rectangle(5, 3);
        Forme f2 = new Cercle(4);

        System.out.println("=== Description ===");
        f1.afficherDescription();
        f2.afficherDescription();

        System.out.println("\n=== Surfaces ===");
        System.out.println("Rectangle : " + f1.calculerSurface());
        System.out.println("Cercle : " + f2.calculerSurface());

        System.out.println("\n=== Comparaison ===");
        int res = f1.comparerSurface(f2);

        if (res > 0) System.out.println("Rectangle plus grand");
        else if (res < 0) System.out.println("Cercle plus grand");
        else System.out.println("Surfaces égales");

        System.out.println("\n=== Méthodes spécifiques ===");

        if (f1 instanceof Rectangle) {
            Rectangle r = (Rectangle) f1;
            System.out.println("Périmètre rectangle : " + r.calculerPerimetre());
        }

        if (f2 instanceof Cercle) {
            Cercle c = (Cercle) f2;
            System.out.println("Périmètre cercle : " + c.calculerPerimetre());
        }
    }
}