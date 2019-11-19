package sets;

// Classe executable de traitement sur une liste de pays configuré en hashset
import java.util.HashSet;
import java.util.Set;

public class TestSetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Set<String> setVille = new HashSet<>();
		setVille.add("USA");
		setVille.add("France");
		setVille.add("Allemagne");
		setVille.add("UK");
		setVille.add("Italie");
		setVille.add("Japon");
		setVille.add("Chine");
		setVille.add("Russie");
		setVille.add("Inde");
		int motLong = 0;
		String nvVille = "";
		for (String ville : setVille) {
			if (motLong < ville.length()) {
				motLong = ville.length();
				nvVille = ville;
			}

		}
		System.out.println("Ville qui a le plus grand nombre de lettres : " + nvVille);
		setVille.remove(nvVille);
		System.out.println("Affichage de la nouvelle liste de pays");
		for (String ville : setVille) {
			System.out.print(ville + "|");
		}
	}

}
