package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		

		List<Integer> initiale = Arrays.asList(-1, 5, 7, 3, -2, 4, 8, 5);
		List<Integer> listEntier = new ArrayList<>();
		listEntier.addAll(initiale);

		for (Integer i : listEntier) {
			System.out.println(i);
		}
		System.out.println("Taille de la liste : " + listEntier.size());
		int max = listEntier.get(0);
		for (Integer valeur : listEntier) {

			if (valeur > max) {
				max = valeur;
			}

		}
		System.out.println("Valeur maximale : " + max);
		int indexMin = 0;
		int valeurMin = listEntier.get(0);

		for (int i = 0; i < listEntier.size(); i++) {

			if (listEntier.get(i) < valeurMin) {
				valeurMin = listEntier.get(i);
				indexMin = i;
			}
		}
		System.out.println(indexMin);
		listEntier.remove(indexMin);
		for (Integer i : listEntier) {
			System.out.println(i);
		}

		for (int i = 0; i < listEntier.size(); i++) {

			if (listEntier.get(i) < 0) {
				int x = listEntier.get(i);
				listEntier.set(i, Math.abs(x));
			}
		}
		for (Integer i : listEntier) {
			System.out.print(i + "|");
		}
	}
}
