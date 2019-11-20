package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;

public class testBanque {

	public static void main(String[] args) {

		Compte compte1 = new Compte("125", 25000.0);
		Compte compte2 = new Compte("125", 25000.0);
		Compte compte3=compte2;
		Compte[] comptes = new Compte[2];
		comptes[0] = new Compte("12", 12000.0);
		comptes[1] = new CompteTaux("1234", 15000, 0.20);

		/*for (int i = 0; i < comptes.length; i++)  {
			System.out.println(comptes[i]);
			
			
		}*/
		boolean bCompte = compte1.equals(compte2);
		boolean bCompte1 = compte3.equals(compte2);
		System.out.println(bCompte);
		System.out.println(bCompte1);
	}
}
