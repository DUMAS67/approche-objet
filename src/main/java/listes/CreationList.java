package listes;

import java.util.ArrayList;

import java.util.List;

public class CreationList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Integer> listEntier = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			listEntier.add(i);
					}
		System.out.println("Taille de la liste : "+ listEntier.size());
		
	}

}
