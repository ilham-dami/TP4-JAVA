package exo8;

public class Main8 {
    public static void main(String[] args) {

        // Polymorphisme avec interface
        Volant v1 = new Oiseau();
        Volant v2 = new Avion();

        System.out.println("=== Test Volant ===");

        v1.voler();
        v1.changerAltitude(100);
        v1.atterrir();

        System.out.println("\n------------------\n");

        v2.voler();
        v2.changerAltitude(10000);
        v2.atterrir();

        System.out.println("\n=== Méthodes spécifiques ===");

        // Cast pour accéder aux méthodes spécifiques
        if (v1 instanceof Oiseau) {
            Oiseau o = (Oiseau) v1;
            o.migrer();
            o.construireNid();
        }

        if (v2 instanceof Avion) {
            Avion a = (Avion) v2;
            a.embarquerPassagers();
            a.afficherAltitude();
        }
    }
}