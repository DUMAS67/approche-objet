package fr.diginamic.resencement;


public class Departement implements Comparable<Departement>{
	
	private int nbDepartement;
	private double populationTotale;
	
	
	public Departement(int nbDepartement, double populationTotale) {
		this.nbDepartement = nbDepartement;
		this.populationTotale = populationTotale;
	}

	public int compareTo(Departement o) {

		if (this.populationTotale > o.getPopulationtotale()) {
			return 1;
		} else if (this.populationTotale < o.getPopulationtotale()) {
			return -1;
		}
		return 0;
	}
	@Override
	public String toString() {
		return "Departement : " + nbDepartement + ", populationtotale= " + populationTotale + "]";
	}


	public int getNbDepartement() {
		return nbDepartement;
	}


	public void setNbDepartement(int nbDepartement) {
		this.nbDepartement = nbDepartement;
	}


	public double getPopulationtotale() {
		return populationTotale;
	}


	public void setPopulationtotale(double populationtotale) {
		this.populationTotale = populationtotale;
	}
	

}
