package fr.diginamic.formes;

public class Rectangle extends Forme{
	
	private double largeur=0.0d;
	private double longueur=0.0d;
	

	public Rectangle(double largeur, double longueur) {
		super();
		this.largeur = largeur;
		this.longueur = longueur;
	}

	@Override
	public double calculerSurface() {
		double surface = largeur*longueur;
		return surface;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		double perimetre = 2*(largeur+longueur);
		return perimetre;
			}

}
