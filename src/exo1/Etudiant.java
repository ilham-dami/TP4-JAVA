package exo1;

public class Etudiant extends Personne{
	
	// Fields
	String niveau_etude;
	float moyenne;
	
	// Constructor
	public Etudiant(String nom, String prenom, int age, String niveau_etude, float moyenne) {
		super(nom, prenom, age);
		this.niveau_etude = niveau_etude;
		this.moyenne = moyenne;
	}
	
	// Indique si l’étudiant est validé 
	public boolean estAdmis() {
		return moyenne >= 10;
	}
	
	// Affiche un résumé académique 
	public void afficherProfil() {
	    afficherInformations(); // héritée
	    System.out.println("Niveau d'étude : " + niveau_etude);
	    System.out.println("Moyenne : " + moyenne);
	    System.out.println("Mention : " + calculerMention());
	    System.out.println("Admis : " + (estAdmis() ? "Oui" : "Non"));  // opérateur ternaire
	}
	
	// Retourne la mention selon la moyenne  
	public String calculerMention() {
	    if (moyenne >= 16) return "Très bien";
	    else if (moyenne >= 14) return "Bien";
	    else if (moyenne >= 12) return "Assez bien";
	    else if (moyenne >= 10) return "Passable";
	    else return "Échec";
	}

}

