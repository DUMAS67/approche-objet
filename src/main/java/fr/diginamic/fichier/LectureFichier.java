package fr.diginamic.fichier;

import java.io.File;
import java.util.List;
import org.apache.commons.io.FileUtils;

public class LectureFichier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File fichierRecensement = new File("C:/tempsts/recensement_population_2016.CSV");
			List<String> lignes = FileUtils.readLines(fichierRecensement, "UTF-8");

			for (String ligne : lignes) {
				System.out.println(ligne);
			}
			System.out.println("Nombre de lignes : " + lignes.size());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
