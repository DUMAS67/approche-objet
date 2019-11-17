package fr.diginamic.salaire;

public abstract class  Intervenant {

	String nom;
	String prenom;

	public Intervenant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public abstract double getSalaire();
	public abstract String getType();

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void afficherIntervenantSalaire(){
		
		System.out.println("Salaire du mois pour : "+getNom() +" "+ getPrenom()+" "+getSalaire());
	}
	
	public void afficherDonnees(){
		System.out.println(getNom() +" "+ getPrenom()+" "+getType()+" "+getSalaire());
		
	}
}
