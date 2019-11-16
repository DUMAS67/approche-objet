package fr.diginamic.banque.entites;

public class Rectangle implements ObjetGeometrique {

	public Rectangle(double largeur, double longueur) {
		super();
		this.largeur = largeur;
		this.longueur = longueur;
	}

	private double largeur;
	private double longueur;
	
	
	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return 2*(largeur+longueur);
	}

	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return largeur*longueur;
	}
public void getInfos(){
	System.out.println("Rectangle de longueur : "+longueur+ "cm et de largeur :" +largeur+"cm");
}
}
