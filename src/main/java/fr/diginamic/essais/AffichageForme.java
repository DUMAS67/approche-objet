package fr.diginamic.essais;

import fr.diginamic.formes.*;

public class AffichageForme {

	public void afficher(Forme formeObjet) {
		System.out.println("Surface : " + formeObjet.calculerSurface());
		System.out.println("Perimetre : " + formeObjet.calculerPerimetre());
	}

}
