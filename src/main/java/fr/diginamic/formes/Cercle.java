package fr.diginamic.formes;


public class Cercle extends Forme {

	private double rayon=0;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	
	public double calculerSurface(){
		double surface = rayon*rayon*Math.PI;
		return surface;
	}

	@Override
	public double calculerPerimetre(){
		double perimetre = 2 * rayon * Math.PI; 
		return perimetre;
	}

}
