package fr.diginamic.essais;

import fr.diginamic.salaire.*;

public class TestIntervenant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Salarie sal1 = new Salarie("Martin","Jean",  2500.0);
		Pigiste pig1 = new Pigiste("Parto","Lucie", 15, 150.0);
		
		sal1.afficherIntervenantSalaire();
		pig1.afficherIntervenantSalaire();
		sal1.afficherDonnees();
		pig1.afficherDonnees();
	}

}
