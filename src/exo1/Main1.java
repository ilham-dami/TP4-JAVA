package exo1;

public class Main1 {
	
    public static void main(String[] args) {

        // Création d'un étudiant
        Etudiant e1 = new Etudiant("Dami", "Ilham", 21, "ID1", 19.5f);

        // Test des méthodes héritées
        System.out.println("=== Informations Personne ===");
        e1.afficherInformations();

        System.out.println("\n=== Présentation ===");
        System.out.println(e1.sePresenter());

        System.out.println("\n=== Majeur ? ===");
        System.out.println(e1.estMajeur() ? "Oui" : "Non");

        // Test des méthodes spécifiques Etudiant
        System.out.println("\n=== Profil Étudiant ===");
        e1.afficherProfil();

        System.out.println("\n=== Vérification ===");
        System.out.println("Admis : " + (e1.estAdmis() ? "Oui" : "Non"));
        System.out.println("Mention : " + e1.calculerMention());
    }
}
