// Classe Executable qui traite des instances des Enum

package fr.diginamic.testenumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		//Contenu des enumerations de saisons
System.out.println("Contenu des enumerations de saisons");
		for (Saison maSaison : Saison.values()) {
			if (maSaison.getSaison() != null) {
				System.out.println(maSaison.getSaison());
			}
		}
		//Contenu de l'enumeration ETE
		for (Saison maSaison : Saison.values()) {
			if (maSaison.equals(Saison.ETE)){
				System.out.println("Contenu de l'enumeration ETE : "+maSaison.getSaison());}
			}
		// Trouver une instance à partir d'un libellé
		String libelle = "Hiver";
		System.out.println("Trouver par un libelle une instance : " + libelle);
	
		Saison.getInstance(libelle);
		
		// Trouver une instance à partir d'un numero d'ordre
				int nOrdre = 2;
				System.out.println("Trouver par un numero d'ordre une instance : " + nOrdre);
			
				Saison.getInstance(nOrdre);
		
		}
		
	

}
