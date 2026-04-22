package exo9;

public class Moto extends Vehicule {

    String typeMoto;

    public Moto(int vitesse, String typeMoto) {
        super(vitesse);
        this.typeMoto = typeMoto;
    }

    
    public void demarrer() {
        System.out.println("La moto démarre avec un bruit puissant");
    }

    public void faireRoueArriere() {
        System.out.println("La moto fait une roue arrière !");
    }

    public void afficherTypeMoto() {
        System.out.println("Type de moto : " + typeMoto);
    }
}