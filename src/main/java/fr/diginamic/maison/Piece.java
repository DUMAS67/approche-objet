package fr.diginamic.maison;

public abstract class Piece {

	double superficie;
	int etage;
	
	public abstract String getTypePiece();
	
	public Piece(int etage, double superficie) {
		super();
		this.superficie = superficie;
		this.etage = etage;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public int getEtage() {
		return etage;
	}

	public void setEtage(int etage) {
		this.etage = etage;
	}
	
	
	
}
