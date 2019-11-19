package sets;

// Classe executable qui fait des opérations sur des sets de doubles

import java.util.HashSet;
import java.util.Set;

public class TestSetDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Double> setDouble = new HashSet<>();

		setDouble.add(1.5);
		setDouble.add(8.25);
		setDouble.add(-7.32);
		setDouble.add(13.3);
		setDouble.add(-12.45);
		setDouble.add(48.5);
		setDouble.add(0.01);
		
		System.out.println("Affichage de tous les éléments :");
		for (double i : setDouble) {
			System.out.print(i + " ");
		}
		double max = 0;
		for (double valeur : setDouble) {

			if (valeur > max) {
				max = valeur;
			}

		}
		
		System.out.println("\nValeur maximale : "+ max);
		double min = max;
		for (double valeur : setDouble) {

			if (valeur < min) {
				min = valeur;
			}

		}
		System.out.println("Valeur minimale : " + min);
		setDouble.remove(min);
		System.out.println("Affichage de tous les éléments modifiés : ");
		for (double i : setDouble) {
			System.out.print(i + " ");
		}
	}

}
