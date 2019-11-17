package fr.dinamic.maison;

public class Maison {

	private Piece[] PiecesDeLaMaison;

	public Maison(Piece[] PiecesDeLaMaison) {
		this.PiecesDeLaMaison = PiecesDeLaMaison;
	}

	public void ajouterPiece(Piece unePiece) {

		Piece[] tmp = new Piece[PiecesDeLaMaison.length + 1];

		if ((unePiece == null) || (unePiece.getEtage() < 0) || (unePiece.getSuperficie() < 0)) {
			System.out.println("Erreur dans déclaration");
		} else {
			for (int i = 0; i < tmp.length - 1; i++) {
				tmp[i] = PiecesDeLaMaison[i];
			}
			tmp[PiecesDeLaMaison.length] = unePiece;
			this.PiecesDeLaMaison = tmp;
		}

	}

	public double superficieTotaleMaison() {
		double somme = 0.0d;

		for (int i = 0; i < PiecesDeLaMaison.length; i++) {
			somme += PiecesDeLaMaison[i].getSuperficie();
		}
		return somme;
	}

	public double superficieParEtage(int etage) {
		double somme = 0.0d;

		for (int i = 0; i < PiecesDeLaMaison.length; i++) {
			if (PiecesDeLaMaison[i].getEtage() == etage) {
				somme += PiecesDeLaMaison[i].getSuperficie();
			}
		}
		return somme;
	}

	public double superficieParPiece(String type) {
		double somme = 0.0d;
		for (int i = 0; i < PiecesDeLaMaison.length; i++) {
			if (PiecesDeLaMaison[i].getTypePiece().equals(type)) {
				somme += PiecesDeLaMaison[i].getSuperficie();
			}
		}
		return somme;
	}

	public int nbPieceType(String type) {

		int compteur = 0;
		for (int i = 0; i < PiecesDeLaMaison.length; i++) {
			if (PiecesDeLaMaison[i].getTypePiece().equals(type)) {
				compteur += 1;
			}

		}
		return compteur;
	}
}
