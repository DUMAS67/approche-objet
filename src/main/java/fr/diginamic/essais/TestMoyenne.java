package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculMoyenne calcul = new CalculMoyenne();
		double [] tab= {12.0,13.5,14,5,18.5,20};
		calcul.setTd(tab);
		System.out.println(calcul.calculMoyenne());
		
	}

}
