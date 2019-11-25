package fr.diginamic.resencement;


public class Ville  implements Comparable<Ville>{
	
	private int codeRegion;				//. code région
	private String nomRegion;			//▪ nom de la région
	private int codeDepartement;		//▪ code département
	private String nomCommune;			//▪ nom de la commune
	private double populationTotale;	//▪ population totale
	
	
	public Ville(int codeRegion, String nomRegion, int codeDepartement, String nomCommune,
			double populationTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}
	public Ville(String codeRegion, String nomRegion, String codeDepartement, String nomCommune,
			String populationTotale) {
		super();
		this.codeRegion = Integer.parseInt(codeRegion);
		this.nomRegion = nomRegion;
		this.codeDepartement = Integer.parseInt(codeDepartement);
		this.nomCommune = nomCommune;
		this.populationTotale = Double.parseDouble(populationTotale);
	}
	
	@Override
	public String toString() {
		return "codeRegion=" + codeRegion + ", Region=" + nomRegion + ", Departement=" + codeDepartement
				+ ", Commune=" + nomCommune + ", populationTotale="
				+ populationTotale;
	}
	
	public int compareTo(Ville o) {

		if (this.populationTotale > o.getPopulationTotale()) {
			return 1;
		} else if (this.populationTotale < o.getPopulationTotale()) {
			return -1;
		}
		return 0;
	}

	public int getCodeRegion() {
		return codeRegion;
	}


	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
	}


	public String getNomRegion() {
		return nomRegion;
	}


	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}


	public int getCodeDepartement() {
		return codeDepartement;
	}


	public void setCodeDepartement(int codeDepartement) {
		this.codeDepartement = codeDepartement;
	}


	public String getNomCommune() {
		return nomCommune;
	}


	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}


	public double getPopulationTotale() {
		return populationTotale;
	}


	public void setPopulationTotale(double populationTotale) {
		this.populationTotale = populationTotale;
	}

	
}
