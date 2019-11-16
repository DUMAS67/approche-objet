package fr.diginamic.banque.entites;

import fr.diginamic.banque.entites.*;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// afficherType correspond à un getType
		Compte comptePerssonel = new Compte("Dumas Thierry", 15000.0d);

		Operation operations;
		operations= new Credit("10 août 1978", 1200.0d);
		comptePerssonel.ajouterOperation(operations);
		operations = new Debit("30 août 1978", 1400.0d);
		comptePerssonel.ajouterOperation(operations);
		operations= new Credit("14 mai 2010", 1850.0d);
		comptePerssonel.ajouterOperation(operations);
		operations = new Debit("30 mai 2010", 1250.0d);
		comptePerssonel.ajouterOperation(operations);
		/*comptePerssonel.setTableauOperation(operations);
		for (int i = 0; i < operations.length; i++) {
			comptePerssonel.ajouterOperation(operations[i]);
		}*/

		System.out.println(comptePerssonel);
	}
}
