package fr.diginamic.testenumeration;

public enum Saison {

	
	PRINTEMPS("Printemps"), ETE("Eté"), AUTOMNE("Automne"), HIVER("Hiver"), UN(1), DEUX(2), TROIS(3), QUATRE(4);

	private String saison;
	private int ordre;

	private Saison(String saison) {
		this.saison = saison;
	}

	private Saison(int ordre) {
		this.ordre = ordre;
	}
// methode static qui retourne une instance à partir d'un libelle
	public static void getInstance(String libelle) {
		for (Saison m : Saison.values()) {
			if ((m.getSaison() != null) && (m.getSaison().equals(libelle))) {
				System.out.println(m);
			}
		}
	}

	public String getSaison() {
		return saison;
	}

	public void setSaison(String saison) {
		this.saison = saison;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

}
