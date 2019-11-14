package fr.diginamic.banque.entites;

public class Compte {
	
	private String numeroCompte;
	private String soldeCompte;
	
	
	public Compte(String numeroCompte, String soldeCompte) {
		this.numeroCompte = numeroCompte;
		this.soldeCompte = soldeCompte;
	}

	public String toString(){
		return numeroCompte+" "+soldeCompte;
	}

	public String getNumeroCompte() {
		return numeroCompte;
	}


	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}


	public String getSoldeCompte() {
		return soldeCompte;
	}


	public void setSoldeCompte(String soldeCompte) {
		this.soldeCompte = soldeCompte;
	}


	}
