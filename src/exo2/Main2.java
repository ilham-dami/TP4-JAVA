package exo2;

public class Main2 {
    public static void main(String[] args) {

        System.out.println("=== Création voiture ===");
        Voiture v1 = new Voiture("Toyota", 5, "Diesel");

        System.out.println("\n=== Tests ===");
        v1.afficherDetails();

        System.out.println("\n=== Comportement ===");
        v1.demarrer();
        v1.klaxonner();
        v1.arreter();
    }
}