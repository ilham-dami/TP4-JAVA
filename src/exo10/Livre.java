package exo10;

class Livre extends Document implements Empruntable {
    private int nombreDePages;
    private String genre;

    public Livre(int id, String titre, String auteur, int pages, String genre) {
        super(id, titre, auteur);
        this.nombreDePages = pages;
        this.genre = genre;
    }

    public int calculerDureeEmpruntMax() {
        return 14;
    }

    public boolean estDisponible() {
        return disponible;
    }

    public void reserver() {
        System.out.println("Livre réservé.");
    }

    public void afficherDetails() {
        afficherInformations();
        System.out.println("Pages: " + nombreDePages + ", Genre: " + genre);
    }

    public void recommander() {
        System.out.println("Livre recommandé !");
    }
}
