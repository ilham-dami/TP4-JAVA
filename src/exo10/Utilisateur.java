package exo10;

import java.util.ArrayList;

class Utilisateur {
	
    private String nom;
    private int id;
    private ArrayList<Document> historique = new ArrayList<>();

    public Utilisateur(String nom, int id) {
        this.nom = nom;
        this.id = id;
    }

    public void emprunterDocument(Document d) {
        d.emprunter();
        historique.add(d);
    }

    public void retournerDocument(Document d) {
        d.retourner();
    }

    public void afficherHistorique() {
        for (Document d : historique) {
            d.afficherInformations();
        }
    }
}