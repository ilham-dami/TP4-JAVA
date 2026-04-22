package exo10;

abstract class Document {
	
    protected int identifiant;
    protected String titre;
    protected String auteur;
    protected boolean disponible = true;

    public Document(int id, String titre, String auteur) {
        this.identifiant = id;
        this.titre = titre;
        this.auteur = auteur;
    }

    public abstract int calculerDureeEmpruntMax();

    public void emprunter() {
        if (disponible) {
            disponible = false;
            System.out.println(titre + " emprunté.");
        } else {
            System.out.println(titre + " non disponible.");
        }
    }

    public void retourner() {
        disponible = true;
        System.out.println(titre + " retourné.");
    }

    public void afficherInformations() {
        System.out.println("ID: " + identifiant + ", Titre: " + titre + ", Auteur: " + auteur);
    }
}