package fr.diginamic.chaines;

import java.util.Spliterator;

public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String chaine = "Durand;Marcel;012543;1 523.5";
		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println("Longueur de la chaine " + chaine.length());
		int index= chaine.indexOf(';');
		System.out.println(index);
		String nom = chaine.substring(0, index);
		System.out.println(nom.toUpperCase());
		System.out.println(nom.toLowerCase());
		String [] tab =chaine.split(";");
		for (int j = 0; j < tab.length; j++) {
			System.out.println(tab[j]);
		}
		//tab[2] = tab[2].re
		//Compte nCompte = new Compte(tab[1],tab[2]);
	}

}
