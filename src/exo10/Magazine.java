package exo10;

class Magazine extends Document implements Empruntable {
    private int numero;
    private String datePublication;

    public Magazine(int id, String titre, String auteur, int num, String date) {
        super(id, titre, auteur);
        this.numero = num;
        this.datePublication = date;
    }

    public int calculerDureeEmpruntMax() {
        return 7;
    }

    public boolean estDisponible() {
        return disponible;
    }

    public void reserver() {
        System.out.println("Magazine réservé.");
    }

    public boolean estRecent() {
        return true; // simplification
    }

    public void afficherEdition() {
        System.out.println("Numéro: " + numero + ", Date: " + datePublication);
    }
}
