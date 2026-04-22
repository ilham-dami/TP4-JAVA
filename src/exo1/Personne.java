package exo1;

public class Personne {
	
	// Fields
	String nom;
	String prenom;
	int age;
	
	// Constructor with arguments
	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	// Affiche les informations complètes 
	public void afficherInformations() {
		System.out.println("Nom : " + nom + " | Prenom : " + prenom + " | Age : " + age );
	}
	
	// Retourne si la personne est majeure 
	public boolean estMajeur() {
		return age >= 18;
	}
	
	// Retourne une description textuelle 
	public String sePresenter() {
		return "Je m'appelle " + prenom + " " + nom + " et j'ai " + age + " ans .";
	}
	
	
		
}

