package fr.diginamic.banque.entites;

public class Cercle implements ObjetGeometrique {

	private double rayon;
	
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}
	
	@Override
	public double perimetre() {
		// TODO Auto-generated method stub
		return 2.0*rayon*Math.PI;
	}


	@Override
	public double surface() {
		// TODO Auto-generated method stub
		return Math.PI *rayon*rayon;
	};
	public void getInfos(){
		System.out.println("Cercle de rayon : "+rayon+"cm");
	}
}
