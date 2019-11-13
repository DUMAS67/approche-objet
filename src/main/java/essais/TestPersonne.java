package essais;

import entites.*;

public class TestPersonne {

	public static void main(String args[]) {

		Personne a = new Personne();
		Personne b = new Personne();
		
		a.nom = "GAG";
		a.prenom = "Julien";
		a.adressePostale = new AdressePostale();
		a.adressePostale.numeroRue =14;
		a.adressePostale.libelleRue = "République";
		a.adressePostale.codePostal = 11000;
		a.adressePostale.ville="Marseille";
		
		b.nom ="MARTIN";
		b.prenom = "Marc";
		b.adressePostale = new AdressePostale();
		b.adressePostale.numeroRue = 17;
		b.adressePostale.libelleRue = "de la Mairie";
		b.adressePostale.codePostal = 17000;
		b.adressePostale.ville="La Rochelle";
		System.out.println(a.adressePostale.ville);
			}
}
