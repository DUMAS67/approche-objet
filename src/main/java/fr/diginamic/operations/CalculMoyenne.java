package fr.diginamic.operations;

public class CalculMoyenne {

	private double[] td = new double[0];

	public void ajout(double aTableau) {

		double[] temp = new double[td.length + 1];

		for (int i = 0; i < td.length; i++) {
			temp[i] = td[i];
		}
		temp[td.length + 1] = aTableau;
		td = temp;
	}
	
	public double calculMoyenne(){
		double somme = 0;
		for (int i = 0; i < td.length; i++) {
			somme+=td[i];
		}
		return (somme/td.length);
	}

	public double[] getTd() {
		return td;
	}

	public void setTd(double[] td) {
		this.td = td;
	}
	
}
