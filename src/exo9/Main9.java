package exo9;

public class Main9 {
    public static void main(String[] args) {

        // Polymorphisme
        Vehicule v1 = new VoitureElectrique(50, 80);
        Vehicule v2 = new Moto(60, "Sport");

        System.out.println("=== Démarrage ===");
        v1.demarrer();
        v2.demarrer();

        System.out.println("\n=== Accélération / Freinage ===");
        v1.accelerer();
        v2.freiner();

        System.out.println("\n=== Spécifique ===");

        if (v1 instanceof VoitureElectrique) {
            VoitureElectrique ve = (VoitureElectrique) v1;
            ve.verifierBatterie();
            ve.afficherAutonomie();
            ve.charger();
        }

        if (v2 instanceof Moto) {
            Moto m = (Moto) v2;
            m.afficherTypeMoto();
            m.faireRoueArriere();
        }
    }
}