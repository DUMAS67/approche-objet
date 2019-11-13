package essais;

import entites.*;

public class TestAdressePostale {

	public static void main(String args[]) {

		AdressePostale a = new AdressePostale();
		a.numeroRue = 89;
		a.libelleRue = " Clémenceau";
		a.codePostal = 33000;
		a.ville = "Bordeaux";
		
		AdressePostale b = new AdressePostale();
		b.numeroRue = 89;
		b.libelleRue = " Clémenceau";
		b.codePostal = 3000;
		b.ville = "Toulouse";
	}

}
