package fr.diginamic.banque.entites;


public class CompteTaux extends Compte {

	private double tauxDeRemuneration;

	public CompteTaux(String numeroCompte, int soldeCompte, double tauxDeRemuneration) {
		super(numeroCompte, soldeCompte);
		this.tauxDeRemuneration = tauxDeRemuneration;
		
	}

	public double getTauxDeRemuneration() {
		return tauxDeRemuneration;
	}

	public void setTauxDeRemuneration(double tauxDeRemuneration) {
		this.tauxDeRemuneration = tauxDeRemuneration;
	}

	
	public String toString() {
		String infoClasseMere= super.toString();
		return infoClasseMere+" "+ tauxDeRemuneration;
	}
	
	
}
