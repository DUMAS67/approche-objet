package fr.diginamic.essais;

import fr.dinamic.maison.*;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Piece [] mesPieces = new Piece[0];
		Cuisine cuisine = new Cuisine(0,12.0);
		Salon salon = new Salon(0,25.0);
		Chambre chambre1 = new Chambre(1,12.0);
		Chambre chambre2 = new Chambre(1,12.0);
		Chambre chambre3 = new Chambre(1,12.0);
		WC wc1 = new WC(0,3.0);
		WC wc2 = new WC(0,4.0);
		SalleDeBain salleDeBain = new SalleDeBain(1,13.0);
		
		Maison maison = new Maison(mesPieces);
		
		maison.ajouterPiece(salon);
		maison.ajouterPiece(salleDeBain);
		maison.ajouterPiece(wc2);
		maison.ajouterPiece(chambre1);
		maison.ajouterPiece(chambre2);
		maison.ajouterPiece(chambre3);
		maison.ajouterPiece(cuisine);
		maison.ajouterPiece(wc1);
		maison.ajouterPiece(salleDeBain);
		maison.ajouterPiece(null);
		
		System.out.println("Surface Totale de la Maison : "+maison.superficieTotaleMaison());
		System.out.println("Surface du Rez-de-Chaussée de la Maison : " +maison.superficieParEtage(0));
		System.out.println("Surface du Premier étage de la Maison : " +maison.superficieParEtage(1));
		System.out.println("Superfie des chambres : "+ maison.superficieParPiece("Chambre"));	
		System.out.println("Nombre de Chambre dans la maison : " + maison.nbPieceType("Chambre"));
	}

}
