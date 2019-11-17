package fr.diginamic.banque.entites;

import static org.hamcrest.CoreMatchers.allOf;

public class CompteDaoMem implements CompteDao {

	private Compte[] compteClient;

	public CompteDaoMem() {
		super();
		this.compteClient = compteClient;
	}

	@Override
	public Compte[] lister() {
		
		for (int i = 0; i < compteClient.length; i++) {
			//if (compteClient[i]
			System.out.println("Numero"+compteClient[i].getNumeroCompte()+"Nombre d'opérations :"+"Solde :"+ compteClient[i].getSolde());
		return compteClient;}
	}
		// TODO Auto-generated method stub
		
		
		//Numero : 1 – Nombre d’opérations: 2 – Solde: 225.50 €
		//Numero : 2 – Nombre d’opérations: 0 – Solde: 1500.00 € – Taux : 0.75 %
	

	@Override
	public void sauvegarder(Compte nvCompte) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean supprimer(String numero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existe(String numero) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Compte getCompte(String numero) {
		// TODO Auto-generated method stub
		for (int i = 0; i < compteClient.length; i++) {
			if (compteClient[i].numeroCompte.equals(numero)) {
				return compteClient[i];
							}
			else
			{System.out.println("Pas de compte associé");
		}
	}

}
