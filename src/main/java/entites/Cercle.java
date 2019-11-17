package entites;

/* Classe qui donne la surface et le périmètre d'un Cercle*/

public class Cercle {

	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	public double perimetre() {
		return 2 * rayon * Math.PI;

	}

	public double surface() {
		return 2 * rayon * rayon;
	}
	
	public String getInfos(){
		return "Cercle de rayon : "+rayon+" cm";
}
}
