package essais;

import entites.*;

public class TestPersonne {

	public static void main(String args[]) {

		AdressePostale ad = new AdressePostale(14,"République",11000,"Marseille");
		Personne a = new Personne("GAG","Julien",ad);
		AdressePostale bd = new AdressePostale(15,"Mairie",17000,"La Rochelle");
		Personne b = new Personne("GAG","Julien",bd);
					}
}
