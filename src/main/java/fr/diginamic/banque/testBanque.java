package fr.diginamic.banque;

import fr.diginamic.banque.entites.*;

public class testBanque {

	public static void main(String[] args) {

		/*Compte a = new Compte("123", "12000");
		System.out.println(a);

		a.setSoldeCompte("15000");
		System.out.println(a);

		CompteTaux b = new CompteTaux("101", "333", 0.20);
		System.out.println(b);*/

		Compte[] comptes = new Compte[2];
		comptes[0] = new Compte("12", "12000");
		comptes[1] = new CompteTaux("1234", "12000", 0.20);

		for (int i = 0; i < comptes.length; i++) {
			System.out.println(comptes[i]);
		}
	}
}
