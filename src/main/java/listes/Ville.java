package listes;

public class Ville {

	private String nomVille;
	private double nbHabitant;
	
	public Ville(String nomVille, double nbHabitant) {
		super();
		this.nomVille = nomVille;
		this.nbHabitant = nbHabitant;
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public double getNbHabitant() {
		return nbHabitant;
	}

	public void setNbHabitant(double nbHabitant) {
		this.nbHabitant = nbHabitant;
	}
	
	
}
