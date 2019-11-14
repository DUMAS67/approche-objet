package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;


public class testBanque {

	public static void main(String[] args) {
		
		
		Compte a = new Compte(123,12000);
		
		System.out.println(a.getNumeroCompte() + " "+a.getSoldeCompte());
		
		a.setSoldeCompte(15000);
		System.out.println(a.getNumeroCompte() + " "+a.getSoldeCompte());
	}

	
}
