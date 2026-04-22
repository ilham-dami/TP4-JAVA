package exo4;

public class Main4 {
    public static void main(String[] args) {

        // Création des objets
        Animal a1 = new Chien(); // polymorphisme
        Animal a2 = new Chat();

        System.out.println("=== Test polymorphisme ===");

        a1.crier(); // appelle crier() de Chien
        a2.crier(); // appelle crier() de Chat

        System.out.println("\n=== Méthodes communes ===");
        a1.manger();
        a2.dormir();

        System.out.println("\n=== Méthodes spécifiques ===");

        // Cast pour accéder aux méthodes spécifiques
        if (a1 instanceof Chien) {
            Chien c = (Chien) a1;
            c.garder();
            c.jouer();
        }

        if (a2 instanceof Chat) {
            Chat c = (Chat) a2;
            c.ronronner();
            c.grimper();
        }
    }
}