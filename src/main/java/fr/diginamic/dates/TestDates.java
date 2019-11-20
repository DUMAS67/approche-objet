package fr.diginamic.dates;

/* Classe executable qui affiche la 
 * date du jour avec constructeurs dépréciés
 */

import java.util.*;
import java.text.*;

public class TestDates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date dateDeCeJour = new Date(119, 10, 20);

		/* dateDeCeJour.setHours(23); */

		System.out.println("Date du jour : ");

		SimpleDateFormat canevasDates = new SimpleDateFormat("dd/MM/yyyy");
		String formatDateJour = canevasDates.format(dateDeCeJour);
		System.out.println(formatDateJour);
		
		 
		 Date dateDeCeJour1 = new Date(119, 10, 20,23,59,00);
		 
		
		 
		 SimpleDateFormat canevasDates1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
		 formatDateJour = canevasDates1.format(dateDeCeJour1);
		 System.out.println("Nouvelle Date : ");
		 System.out.println(formatDateJour); 
		 
		 Date dateSys = new Date();
		 SimpleDateFormat canevasDates2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); 
		 String fSysteme = canevasDates2.format(dateSys); 
		 System.out.println("Date Système : ");
		 System.out.println(fSysteme);
		 
	}
}
