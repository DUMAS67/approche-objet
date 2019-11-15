package fr.diginamic.banque.entites;

import fr.diginamic.banque.entites.*;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//afficherType correspond à un getType
		Operation[] operations = new Operation[4];
		int solde = 0;
		operations[0] = new Credit("10 août 1978", 1200);
		operations[1] = new Debit("30 août 1978", 1400);
		operations[2] = new Credit("14 mai 2010", 1850);
		operations[3] = new Debit("30 mai 2010", 1250);

		for (int i = 0; i < operations.length; i++) {
			if (operations[i].afficherType().equals("Credit")) {
				solde += operations[i].getMontantOperation();
			} else {
				solde -= operations[i].getMontantOperation();
			}

		}
		System.out.println(solde);
	}
}
