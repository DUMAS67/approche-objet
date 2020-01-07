package fr.diginamic.testunitaire;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.diginamic.fichier.StringUtils;

public class MonTestUnitaire {
	
	
	@ Test
	
	public void testCharSpace() {
		
		int resultat = StringUtils.levenshteinDistance(" "," ");
		assertEquals("Resultat Space",0, resultat);
		
	}
	
	
	@ Test
public void testCharLongueur() {
		
		int resultat = StringUtils.levenshteinDistance(" ","11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		assertEquals("Resultat longueur",0, resultat);
		// suppose que c'est 0
	}
	
	@ Test
	
	public void testCharNull(){
	
	int resultat = StringUtils.levenshteinDistance(null,null);
		assertEquals("Resultat Null",0, resultat);
		
	}
}
