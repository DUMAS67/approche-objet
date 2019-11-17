package fr.diginamic.banque.entites;

import java.util.Scanner;

public class ApplicationBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choixMenu = 0;
		
		CompteDaoMem dao = new CompteDaoMem();

		do {
			System.out.println("***** Administration des comptes *****");
			System.out.println("1. Lister les comptes");
			System.out.println("2. Ajouter un nouveau compte");
			System.out.println("3. Ajouter une opération à un compte");
			System.out.println("4. Supprimer un compte");
			System.out.println("99. Sortir");

			Scanner saisie = new Scanner(System.in);
			int choix = saisie.nextInt();
			choixMenu = choix;

			switch (choixMenu) {

			case 1: {
				break;
			}
			case 2: {
				System.out.println("Ajout d’un nouveau compte");
				System.out.println("Veuillez saisir le numéro :");

				String choixNumeroCompte = saisie.next();

				System.out.println("Veuillez saisir le solde initial:");
				double SoldeInitial = saisie.nextDouble();
				System.out.println("Veuillez saisir le type de compte (1: NORMAL, 2: REMUNERE) :)");
				int typeCompte = saisie.nextInt();
				Compte nouveauCompte = new Compte(choixNumeroCompte, SoldeInitial, typeCompte);
				sauvegarder(nouveauCompte);
				break;
			}
			case 3: {
				break;
			}
			case 4: {
				break;
			}
			case 99: {
				System.out.println(" Aurevoir ");
				break;
			}
			default:
				;
			}
			;

		} while (choixMenu != 99);
	}
}
