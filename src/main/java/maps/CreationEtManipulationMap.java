package maps;

// Classe executable qui affice les clefs et les valeurs de la MAP

import java.util.HashMap;
import java.util.Iterator;

public class CreationEtManipulationMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> mapVilles = new HashMap<>();
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(33, "Bordeaux");
		mapVilles.put(69, "Lyon");
		mapVilles.put(59, "Lille");

		System.out.println("Nom des Clefs : ");
		Iterator<Integer> iteratorClef = mapVilles.keySet().iterator();
		while (iteratorClef.hasNext()) {
			Integer mapInteger = iteratorClef.next();

			System.out.print(mapInteger+ "|");

		}
		System.out.println("\nValeur des Clefs : ");
		Iterator<String> iteratorValeur = mapVilles.values().iterator();

		while (iteratorValeur.hasNext()) {
			String valeur = iteratorValeur.next();
			System.out.print(valeur+"|");
		}

		System.out.println("\nTaille de la Map : "+ mapVilles.size());

	}
}
