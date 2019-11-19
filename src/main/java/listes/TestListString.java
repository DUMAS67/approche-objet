package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListString {

	public static void main(String[] args) {

		List<String> listVille = new ArrayList<>();
		listVille = Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes");
		List<String> listDeVille = new ArrayList<>();
		listDeVille.addAll(listVille);
		

		int indexVille = 0;
		int nbMaxLettre = listDeVille.get(0).length();
		for (int i = 0; i < listDeVille.size(); i++) {
			if (listDeVille.get(i).length() > nbMaxLettre) {
				nbMaxLettre = listDeVille.get(i).length();
				indexVille = i;
			}
		}
		String m = listDeVille.get(indexVille);
		System.out.println("La ville ayant le plus de lettre : " + m + " avec " + nbMaxLettre + " lettres");
		String tV = listDeVille.get(0);
		System.out.println("Ville en Majuscule");
		for (String st : listDeVille) {
			tV = st;
			st = tV.toUpperCase();
			System.out.print(st + "|");
		}
		boolean aEffacerN = false;
		int indexAEffacer = 0;
		boolean effacerUneFois = false;
		char premiereLettre = listDeVille.get(0).charAt(0);
		while (!aEffacerN) {
			int i = 0;
			if (effacerUneFois == true) {
				listDeVille.remove(indexAEffacer);
				effacerUneFois = false;
			} else {
				while (i < listDeVille.size() && (!effacerUneFois)) {
					premiereLettre = listDeVille.get(i).charAt(0);
					if (premiereLettre == 'N') {
						indexAEffacer = i;
						effacerUneFois = true;
					} else {
						i++;
					}
				}
				if (i == listDeVille.size() && (!effacerUneFois)) {
					aEffacerN = true;
				}
			}
		}
		System.out.println("\nVille ne commençant pas par N :");
		for (String stt : listDeVille) {
			System.out.print(stt + "|");
		}
	}

}
