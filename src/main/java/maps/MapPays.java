package maps;

// Création d'une Map, traitement sur la MAP et affichage

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import sets.Pays;

public class MapPays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Pays> mpPays = new HashMap<>();

		mpPays.put("USA", new Pays("USA", 300_000_000, 1.2d));
		mpPays.put("France", new Pays("France", 65_000_000, 1.4d));
		mpPays.put("Allemagne", new Pays("Allemagne", 83_000_000, 1.6d));
		mpPays.put("UK", new Pays("UK", 70_000_000, 1.6d));
		mpPays.put("Italie", new Pays("Italie", 58_000_000, 1.0d));
		mpPays.put("Chine", new Pays("Chine", 1_250_000_000, 1.9d));
		mpPays.put("Russie", new Pays("Russie", 400_000_000, 0.9d));
		mpPays.put("Inde", new Pays("Inde", 1_000_000_000, 1.1d));

		Iterator<Pays> mapIterator = mpPays.values().iterator();
		int habitant = mpPays.get("USA").getNbHabitant();
		String key = "";
		while (mapIterator.hasNext()) {
			Pays it = mapIterator.next();
			if (habitant >= it.getNbHabitant()) {
				habitant = it.getNbHabitant();
				key = it.getNom();
			}
		}
		mpPays.remove(key);
		System.out.println("Affichage des Valeurs de la Map  :");
		Iterator<Pays> mapIterator1 = mpPays.values().iterator();
		while (mapIterator1.hasNext()) {
			Pays it = mapIterator1.next();
			System.out.println(it);
		}
	}
}
