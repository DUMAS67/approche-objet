package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;

public class testBanque {

	public static void main(String[] args) {

		
		Compte[] comptes = new Compte[2];
		comptes[0] = new Compte("12", 12000);
		comptes[1] = new CompteTaux("1234", 15000, 0.20);

		for (int i = 0; i < comptes.length; i++)  {
			System.out.println(comptes[i]);
			
		}
	}
}
