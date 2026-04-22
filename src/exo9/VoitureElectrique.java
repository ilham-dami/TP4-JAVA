package exo9;

public class VoitureElectrique extends Vehicule implements Electrique {

    int batterie; // %

    public VoitureElectrique(int vitesse, int batterie) {
        super(vitesse);
        this.batterie = batterie;
    }

   
    public void demarrer() {
        System.out.println("La voiture électrique démarre silencieusement");
    }

   
    public void charger() {
        batterie = 100;
        System.out.println("Batterie chargée à 100%");
    }

   
    public void verifierBatterie() {
        System.out.println("Niveau batterie : " + batterie + "%");
    }

    public void afficherAutonomie() {
        System.out.println("Autonomie estimée : " + (batterie * 3) + " km");
    }

    public void optimiserConsommation() {
        System.out.println("Mode éco activé");
    }
}