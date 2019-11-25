package fr.diginamic.resencement;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.io.FileUtils;

public class Application {

	public static void main(String[] args) {

		try {
			File fichierRecensement = new File("C:/tempsts/recensement_population_2016.CSV");
			List<String> lignes = FileUtils.readLines(fichierRecensement, "UTF-8");
			List<Ville> listeVille = new ArrayList<Ville>();
			lignes.remove(0);
			for (String ligne : lignes) {
				String[] contenuLigne = ligne.split(";");
				String codeRegion = contenuLigne[0];
				String nomRegion = contenuLigne[1];

				String codeDepartement = contenuLigne[2];
				if (codeDepartement.equals("2A") || codeDepartement.equals("2B")) {
					codeDepartement = "2";
				}
				String nomVille = contenuLigne[5];
				String population = contenuLigne[6];
				population = population.replace(" ", "").trim();
				listeVille.add(new Ville(codeRegion, nomRegion, codeDepartement, nomVille, population));
			}

			System.out.println("Nombre de lignes : " + lignes.size());

			int i = 0;
			boolean sortiBoucle = false;
			do {
				if (listeVille.get(i).getNomCommune().equals("Montpellier")) {
					System.out.println(listeVille.get(i));
					sortiBoucle = true;
				}
				i++;
			} while ((i < listeVille.size() - 1) && (!sortiBoucle));
			double resultPopDepartement = populationDepartement("34", listeVille);
			System.out.println(resultPopDepartement);
			Ville m = plusPetiteVille(listeVille, "34");
			System.out.println("La plus petite ville est : " + m.getNomCommune() + " avec " + m.getPopulationTotale()
					+ " habitant(s)");
			System.out.println("-----------------------------------");
			System.out.println("Les 10 plus grandes villes du Département");
			plusGrandeVilleDepartement("34", listeVille, 10);
			System.out.println("-----------------------------------");
			System.out.println("Les 10 plus petites villes du Département");
			plusPetiteVilleDepartement("34", listeVille, 10);
			System.out.println("-----------------------------------");
			System.out.println("Population de la région Occitanie");
			double somme = PopulationRegion("Occitanie", listeVille);
			System.out.println("La Région Occitanie a : " + somme + "  habitants");
			System.out.println("-----------------------------------");
			System.out.println("Les 10 plus grande ville de l'Occitanie");
			VilleRegion("76", listeVille, 10);
			System.out.println("-----------------------------------");
			System.out.println("Le Département le plus peuplé de la Région");
			departementPlusPeupleRegion("76", listeVille);
			System.out.println("-----------------------------------");
			System.out.println("les 10 Régions les plus peuplées de la Région");
			regionPlusPeuple(listeVille, 10);
			System.out.println("-----------------------------------");
			System.out.println(" Les 10 départements les plus peuplées de France");
			departementPlusPeupleFrance(listeVille, 10);
			System.out.println(" Les 10 villes les plus peuplées de France");
			villePlusPeupleFrance(listeVille, 10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static double populationDepartement(String CodeDepartement, List<Ville> lVille) {

		int k = 0;
		double cpt = 0.0d;

		do {
			String j = String.valueOf(lVille.get(k).getCodeDepartement());
			if (j.equals(CodeDepartement)) {
				cpt += lVille.get(k).getPopulationTotale();
			}
			k++;
		} while (k < (lVille.size() - 1));
		return cpt;

	}

	public static Ville plusPetiteVille(List<Ville> lVille, String departement) {

		int k = 0;
		int cptMin = 0;
		double minPopulation = 0.0d;
		int a = Integer.parseInt(departement);
		do {
			if ((lVille.get(k).getCodeDepartement() == a) && (cptMin == 0)) {
				minPopulation = lVille.get(k).getPopulationTotale();
				cptMin = k;
			} else if ((lVille.get(k).getCodeDepartement() == Integer.parseInt(departement))
					&& (lVille.get(k).getPopulationTotale() <= minPopulation)) {
				minPopulation = lVille.get(k).getPopulationTotale();
				cptMin = k;
			}

			k++;
		} while (k < lVille.size());

		return lVille.get(cptMin);

	}

	public static void plusGrandeVilleDepartement(String numeroDepartement, List<Ville> lVille, int nbr) {

		boolean premiereVille = true;

		int nD = Integer.parseInt(numeroDepartement);
		int nbArg = 0;
		Ville aEffacer = null;
		boolean effacer = false;
		List<Ville> listMax = new ArrayList<>();
		for (int i = 0; i < lVille.size(); i++) {
			int b = lVille.get(i).getCodeDepartement();
			if ((b == nD) && (premiereVille)) {
				listMax.add(lVille.get(i));
				nbArg = 0;
				premiereVille = false;
			} else if ((b == nD) && (nbArg < nbr) && (!premiereVille)) {
				listMax.add(lVille.get(i));
				nbArg++;
			} else if ((b == nD) && (nbArg == nbr) && (!premiereVille)) {
				Collections.sort(listMax);
				int cptAjout = 0;
				for (int j = 0; j < listMax.size(); j++) {
					if (lVille.get(i).getPopulationTotale() > listMax.get(j).getPopulationTotale()) {
						aEffacer = listMax.get(j);
						cptAjout = i;
						effacer = true;
					}
				}
				if (effacer) {
					listMax.remove(aEffacer);
					listMax.add(lVille.get(cptAjout));
					effacer = false;
					Collections.sort(listMax);
				}
			}
		}
		for (Ville p : listMax) {
			System.out.println(p);
		}
	}

	public static void plusPetiteVilleDepartement(String numeroDepartement, List<Ville> lVille, int nbr) {

		boolean premiereVille = true;

		int nD = Integer.parseInt(numeroDepartement);
		int nbArg = 0;
		Ville aEffacer = null;
		boolean effacer = false;
		List<Ville> listMin = new ArrayList<>();
		for (int i = 0; i < lVille.size(); i++) {
			int b = lVille.get(i).getCodeDepartement();
			if ((b == nD) && (premiereVille)) {
				listMin.add(lVille.get(i));
				nbArg = 0;
				premiereVille = false;
			} else if ((b == nD) && (nbArg < nbr) && (!premiereVille)) {
				listMin.add(lVille.get(i));
				nbArg++;
			} else if ((b == nD) && (nbArg == nbr) && (!premiereVille)) {
				Collections.sort(listMin);
				int cptAjout = 0;
				for (int j = 0; j < listMin.size(); j++) {
					if (lVille.get(i).getPopulationTotale() < listMin.get(j).getPopulationTotale()) {
						aEffacer = listMin.get(j);
						cptAjout = i;
						effacer = true;
					}
				}
				if (effacer) {
					listMin.remove(aEffacer);
					listMin.add(lVille.get(cptAjout));
					effacer = false;
					Collections.sort(listMin);
				}
			}
		}

		for (Ville p : listMin) {
			System.out.println(p);
		}
	}

	public static double PopulationRegion(String region, List<Ville> lList) {

		double sommePopulationRegion = 0.0d;
		for (int i = 0; i < lList.size(); i++) {
			if (lList.get(i).getNomRegion().equals(region)) {
				sommePopulationRegion += lList.get(i).getPopulationTotale();
			}
		}
		return sommePopulationRegion;
	}

	public static void VilleRegion(String region, List<Ville> liste, int nbr) {

		int b = Integer.parseInt(region);
		List<Ville> listeRegion = new ArrayList<>();
		for (int i = 0; i < liste.size(); i++) {
			int a = (liste.get(i).getCodeRegion());
			if (a == b) {
				listeRegion.add(liste.get(i));
			}
		}
		Collections.sort(listeRegion);
		Collections.reverse(listeRegion);

		for (int i = 0; i < nbr; i++) {
			System.out.println(listeRegion.get(i));
		}
	}

	public static void departementPlusPeupleRegion(String region, List<Ville> liste) {
		int b = Integer.parseInt(region);
		List<Ville> listeRegion = new ArrayList<>();
		for (int i = 0; i < liste.size(); i++) {
			int a = (liste.get(i).getCodeRegion());
			if (a == b) {
				listeRegion.add(liste.get(i));
			}
		}
		List<Integer> listDepartement = new ArrayList<>();
		listDepartement.add(listeRegion.get(0).getCodeDepartement());
		int cpt = 0;
		int a = listDepartement.get(cpt);
		for (Ville v : listeRegion) {
			if (v.getCodeDepartement() != a) {
				cpt++;
				listDepartement.add(v.getCodeDepartement());
				a = listDepartement.get(cpt);
			}
		}
		Map<Integer, Double> mapDepartement = new HashMap<>();
		for (int i = 0; i < listDepartement.size(); i++) {
			mapDepartement.put(listDepartement.get(i), 0.0d);
		}
		double sommeParDepartement = 0.0d;
		for (int i = 0; i < listeRegion.size(); i++) {
			for (int j = 0; j < listDepartement.size(); j++) {
				if ((listeRegion.get(i).getCodeDepartement()) == listDepartement.get(j)) {
					sommeParDepartement = mapDepartement.get(listDepartement.get(j));
					sommeParDepartement += listeRegion.get(i).getPopulationTotale();
					mapDepartement.replace(listDepartement.get(j), sommeParDepartement);
				}
			}
		}
		double mapMax = mapDepartement.get(listDepartement.get(0));
		Collection<Double> mpValue = mapDepartement.values();
		int cptMap = 0;
		for (Double mp : mpValue) {
			if (mp >= mapMax) {
				mapMax = mp;
				cptMap++;
			}
		}
		System.out.println("Le département le plus peublé de la région : " + region + " est le "
				+ listDepartement.get(cptMap) + " avec " + mapMax + " habitants");
	}

	public static void regionPlusPeuple(List<Ville> liste, int nbr) {

		// Crée une liste des codes Régions différents

		List<Integer> listeRegion = new ArrayList<>();

		int a = 0;
		int cptR = 0;
		for (int i = 0; i < liste.size(); i++) {
			int b = (liste.get(i).getCodeRegion());
			if ((a != b) && (listeRegion.indexOf(b) == -1)) {
				listeRegion.add(liste.get(i).getCodeRegion());
				a = listeRegion.get(cptR);
				cptR++;
			}
		}
		// Calcule un map de CodeRegion associé à la population de la Region
		Map<Integer, Double> mapRegionPopulation = new HashMap<>();

		for (int i = 0; i < listeRegion.size(); i++) {
			mapRegionPopulation.put(listeRegion.get(i), 0.0d);
		}
		double sommeParRegion = 0.0d;
		for (int i = 0; i < liste.size(); i++) {
			for (int j = 0; j < listeRegion.size(); j++) {
				if ((liste.get(i).getCodeRegion()) == listeRegion.get(j)) {
					sommeParRegion = mapRegionPopulation.get(listeRegion.get(j));
					sommeParRegion += liste.get(i).getPopulationTotale();
					mapRegionPopulation.replace(listeRegion.get(j), sommeParRegion);
				}
			}
		}
		// créé une liste des sommes totales
		List<Double> listSomme = new ArrayList<>();
		Iterator<Double> ite = mapRegionPopulation.values().iterator();
		while (ite.hasNext()) {
			listSomme.add(ite.next());
		}
		Collections.sort(listSomme);
		Collections.reverse(listSomme);
		double[] tabSomme = new double[10];
		for (int i = 0; i < tabSomme.length; i++) {
			tabSomme[i] = listSomme.get(i);
		}
		int key = 0;
		Map<Integer, Double> mapFinal = new HashMap<>();
		Iterator<Integer> iterat = mapRegionPopulation.keySet().iterator();

		while (iterat.hasNext()) {
			key = iterat.next();
			for (int i = 0; i < tabSomme.length; i++) {
				if (mapRegionPopulation.get(key) == tabSomme[i]) {
					mapFinal.put(key, tabSomme[i]);
				}
			}
		}
		Set<Integer> mp = mapFinal.keySet();
		for (int p : mp) {
			System.out.println("Region : " + p + " avec " + mapFinal.get(p) + " habitants");
		}
	}

	public static void departementPlusPeupleFrance(List<Ville> lVilleF, int nbr) {

		List<Departement> listeDep = new ArrayList<>();
		int ancienDepartement = lVilleF.get(0).getCodeDepartement();
		listeDep.add(new Departement(1, 0.0d));

		for (int i = 0; i < lVilleF.size(); i++) {

			if ((lVilleF.get(i).getCodeDepartement() != ancienDepartement) && (i != 0)) {
				int nbDepartement = lVilleF.get(i).getCodeDepartement();
				listeDep.add(new Departement(nbDepartement, 0.0d));
				ancienDepartement = lVilleF.get(i).getCodeDepartement();
			}
		}
		for (int j = 0; j < listeDep.size(); j++) {
			double somme = 0.0d;
			for (int j2 = 0; j2 < lVilleF.size(); j2++) {
				if (listeDep.get(j).getNbDepartement() == lVilleF.get(j2).getCodeDepartement()) {
					somme = listeDep.get(j).getPopulationtotale();
					somme += lVilleF.get(j2).getPopulationTotale();
					listeDep.get(j).setPopulationtotale(somme);
				}
			}
		}

		Collections.sort(listeDep);
		Collections.reverse(listeDep);
		for (int i = 0; i < nbr; i++) {
			int a = listeDep.get(i).getNbDepartement();
			double b = listeDep.get(i).getPopulationtotale();
			System.out.println(a + " avec " + b);
		}
	}

	public static void villePlusPeupleFrance(List<Ville> lVilleF, int nbr) {

		Collections.sort(lVilleF);
		Collections.reverse(lVilleF);
		for (int i = 0; i < nbr; i++) {
			System.out.println(lVilleF.get(i));
		}
		// Manque le traitement pour Paris

	}

}