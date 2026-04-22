package exo2;

public class Voiture extends Vehicule {

     int nbPortes;
     String carburant;

    //  Appel explicite au constructeur parent
    public Voiture(String marque, int nbPortes, String carburant) {
        super(marque);
        this.nbPortes = nbPortes;
        this.carburant = carburant;
    }

    public void afficherDetails() {
        afficherMarque();
        System.out.println("Nombre de portes : " + nbPortes);
        System.out.println("Carburant : " + carburant);
    }

    public void klaxonner() {
        System.out.println("Bip bip !");
    }
}
