package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListObjets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Ville> listVille = new ArrayList<>();
		listVille.add(new Ville("Nice", 343_000.0));
		listVille.add(new Ville("Carcassonne", 47_800.0));
		listVille.add(new Ville("Narbonne", 53_400.0));
		listVille.add(new Ville("Lyon", 484_000.0));
		listVille.add(new Ville("Foix", 9_700.0));
		listVille.add(new Ville("Pau", 77_200.0));
		listVille.add(new Ville("Marseille", 850_000.0));
		listVille.add(new Ville("Tarbes", 40_600.0));
		afficherVillePlusPeublee(listVille);
		supprimerMoinsPeuplee(listVille);
		modif100(listVille);
		afficherListeDeVille(listVille);
	}

	static void modif100(List<Ville> listDeVille) {
		final double CENTM = 100_000.0;

		for (Ville ville100 : listDeVille) {
			if (ville100.getNbHabitant() >= CENTM) {
				String upper = ville100.getNomVille().toUpperCase();
				ville100.setNomVille(upper);
			}
		}

	}

	static void supprimerMoinsPeuplee(List<Ville> listDeVille) {

		double moinspeuplee = listDeVille.get(0).getNbHabitant();
		int indexObjet = 0;

		for (int i = 0; i < listDeVille.size(); i++) {
			if (moinspeuplee > listDeVille.get(i).getNbHabitant()) {
				moinspeuplee = listDeVille.get(i).getNbHabitant();
				indexObjet = i;
			}
		}
		listDeVille.remove(indexObjet);

		/*
		 * ne marche que si equals est redefinie for (Ville villePeuplee :
		 * listDeVille) { if (moinspeuplee > villePeuplee.getNbHabitant()) {
		 * moinspeuplee = villePeuplee.getNbHabitant();
		 * indexObjet.setNbHabitant(villePeuplee.getNbHabitant());
		 * indexObjet.setNomVille(villePeuplee.getNomVille()); } } }
		 * System.out.println(indexObjet.getNomVille());
		 * listDeVille.remove(indexObjet);
		 * 
		 * Test for (Ville villePeuplee : listDeVille) {
		 * System.out.print("+"+villePeuplee.getNomVille()); }
		 */

	}

	static void afficherVillePlusPeublee(List<Ville> listDeVille) {
		double villePeuple = listDeVille.get(0).getNbHabitant();
		Ville villeObjet = new Ville("", 0.0d);
		for (Ville laVille : listDeVille) {
			if (laVille.getNbHabitant() > villePeuple) {
				villePeuple = laVille.getNbHabitant();
				villeObjet.setNbHabitant(villePeuple);
				villeObjet.setNomVille(laVille.getNomVille());
			}

		}
		System.out.println("la ville avec le plus grand nombre d'habitant est : " + villeObjet.getNomVille() + " avec "
				+ villeObjet.getNbHabitant());
	}

	static void afficherListeDeVille(List<Ville> listDeVille) {
		System.out.println("Affichage de la liste des Villes");
		for (Ville affiche : listDeVille) {
			String ville = affiche.getNomVille();
			double nbH = affiche.getNbHabitant();
			
			System.out.println("Ville de " + ville + " de " + nbH + " habitants");
		}
	}
}
