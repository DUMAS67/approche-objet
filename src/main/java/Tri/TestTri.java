package Tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import sets.Pays;

public class TestTri {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		List<Pays> listPays = new ArrayList<>();

		listPays.add(new Pays("USA", 300_000_000, 1.2d));
		listPays.add(new Pays("France", 65_000_000, 1.4d));
		listPays.add(new Pays("Allemagne", 83_000_000, 1.6d));
		listPays.add(new Pays("UK", 70_000_000, 1.6d));
		listPays.add(new Pays("Italie", 58_000_000, 1.0d));
		listPays.add(new Pays("Chine", 1_250_000_000, 1.9d));
		listPays.add(new Pays("Russie", 400_000_000, 0.9d));
		listPays.add(new Pays("Inde", 1_000_000_000, 1.1d));
		
		System.out.println("Tri des pays par le PIB/habitant par la methode CompareTo ");
		Collections.sort(listPays);
		for (Pays i : listPays) {
			System.out.println(i);
		}
		Collections.sort(listPays,new ComparatorHabitant(ComparatorHabitant.ASC));
		System.out.println("Tri des pays par nombre d'habitant par la classe Comparator ");
		for (Pays i : listPays) {
			System.out.println(i);
		}
		Collections.sort(listPays,new ComparatorPibHabitant(ComparatorPibHabitant.ASC));
		System.out.println("Tri des pays par le PIb/habitant par la classe ComparatorPibHabitant ");
		for (Pays i : listPays) {
			System.out.println(i);
		}
	}
}
