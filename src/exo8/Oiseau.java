package exo8;

public class Oiseau implements Volant {

    private int altitude;

  
    public void voler() {
        System.out.println("L'oiseau vole dans le ciel");
    }

  
    public void atterrir() {
        altitude = 0;
        System.out.println("L'oiseau atterrit");
    }

   
    public void changerAltitude(int altitude) {
        this.altitude = altitude;
        System.out.println("Nouvelle altitude de l'oiseau : " + altitude + " m");
    }

    // Méthodes spécifiques
    public void migrer() {
        System.out.println("L'oiseau migre vers un autre pays");
    }

    public void construireNid() {
        System.out.println("L'oiseau construit un nid");
    }
}