package exo10;

public class Main10 {
	
    public static void main(String[] args) {

        Document d1 = new Livre(1, "Java", "Ali", 200, "Informatique");
        Document d2 = new Magazine(2, "TechMag", "Sara", 10, "2026");
        Document d3 = new DocumentNumerique(3, "PDF Guide", "Omar", "PDF", 5.5);

        Document[] docs = {d1, d2, d3};

        for (Document d : docs) {
            d.afficherInformations();
            System.out.println("Durée max: " + d.calculerDureeEmpruntMax());
            System.out.println("------------------");
        }
    }
}
