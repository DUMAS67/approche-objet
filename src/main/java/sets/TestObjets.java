package sets;
// Class executable qui crée des sets, les modifi, les détruit

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class TestObjets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Pays> pays = new HashSet<>();

		pays.add(new Pays("USA", 300_000_000, 1.2d));
		pays.add(new Pays("France", 65_000_000, 1.4d));
		pays.add(new Pays("Allemagne", 83_000_000, 1.6d));
		pays.add(new Pays("UK", 70_000_000, 1.6d));
		pays.add(new Pays("Italie", 58_000_000, 1.0d));
		pays.add(new Pays("Chine", 1_250_000_000, 1.9d));
		pays.add(new Pays("Russie", 400_000_000, 0.9d));
		pays.add(new Pays("Inde", 1_000_000_000, 1.1d));

		
		Iterator<Pays> iterator = pays.iterator();
		Pays objetPibMax = new Pays("", 0, 0.0d);
		double indexPib = 0.0;
		while (iterator.hasNext()) {
			Pays it = iterator.next();
			if (indexPib < it.getPibHabitant()) {
				indexPib = it.getPibHabitant();
				objetPibMax.setNbHabitant(it.getNbHabitant());
				objetPibMax.setNom(it.getNom());
				objetPibMax.setPibHabitant(it.getPibHabitant());
			}

		}
		System.out.println("Pays avec le PIB le plusimportant");
		System.out.println(objetPibMax);
		double indexPibTotal = 0.0d;
		Pays objetPibTotalMax = new Pays("", 0, 0.0d);

		Iterator<Pays> iterator1 = pays.iterator();
		while (iterator1.hasNext()) {
			Pays it = iterator1.next();
			if (indexPibTotal < (it.getPibHabitant() * it.getNbHabitant())) {
				indexPibTotal = it.getPibHabitant() * it.getNbHabitant();
				objetPibTotalMax = it;
			}

		}
		System.out.println("Pays avec le PIB Total le plus important");
		System.out.println(objetPibTotalMax);

		double indexPibMin = objetPibMax.getNbHabitant() * objetPibMax.getPibHabitant();
		Pays objetPibTotalMin = new Pays("", 0, 0.0d);

		Iterator<Pays> iterator2 = pays.iterator();
		
		while (iterator2.hasNext()) {
			Pays it = iterator2.next();
			if (indexPibMin > (it.getPibHabitant() * it.getNbHabitant())) {
				indexPibMin = it.getPibHabitant() * it.getNbHabitant();
				objetPibTotalMin = it;

			}
		}
		Pays upper = objetPibTotalMin;

		upper.setNom(objetPibTotalMin.getNom().toUpperCase());
		if (pays.contains(objetPibTotalMin) == true) {
			pays.remove(objetPibTotalMin);
			pays.add(upper);
		}

		System.out.println("Pays avec le PIB Total le plus petit");
		System.out.println(upper);

		if (pays.contains(upper) == true) { // a noter que cela fonctionne aussi avec objetPibTotalMin
			pays.remove(upper);
		}

		System.out.println("Affichage de tous les pays");
		for (Pays i : pays) {
			System.out.println(i);
		}

	}
}
