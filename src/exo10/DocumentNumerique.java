package exo10;

class DocumentNumerique extends Document implements Consultable {
    private String format;
    private double tailleFichier;

    public DocumentNumerique(int id, String titre, String auteur, String format, double taille) {
        super(id, titre, auteur);
        this.format = format;
        this.tailleFichier = taille;
    }

    public int calculerDureeEmpruntMax() {
        return 30;
    }

    public void consulter() {
        System.out.println("Consultation du document numérique.");
    }

    public void afficherResume() {
        System.out.println("Résumé du document numérique.");
    }

    public void telecharger() {
        System.out.println("Téléchargement...");
    }

    public void afficherTaille() {
        System.out.println("Taille: " + tailleFichier + " MB");
    }
}
