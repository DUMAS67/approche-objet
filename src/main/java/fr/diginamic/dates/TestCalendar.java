/* Classe executable qui affiche 
 * la date du jour avec la classe Calendar
 */

package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar dateDeCeJour = Calendar.getInstance();
		dateDeCeJour.set(Calendar.YEAR, 2019);
		dateDeCeJour.set(Calendar.MONTH, 10);
		dateDeCeJour.set(Calendar.DAY_OF_MONTH, 20);
		dateDeCeJour.set(Calendar.HOUR_OF_DAY, 23);

		System.out.println("Date du jour : ");
		Date dateJour = dateDeCeJour.getTime();
		SimpleDateFormat canevasDates = new SimpleDateFormat("dd/MM/yyyy");
		String formatDateJour = canevasDates.format(dateJour);
		System.out.println(formatDateJour);

		Calendar dateDuJour = Calendar.getInstance();
		dateDuJour.set(Calendar.YEAR, 2019);
		dateDuJour.set(Calendar.MONTH, 10);
		dateDuJour.set(Calendar.DAY_OF_MONTH, 20);
		dateDuJour.set(Calendar.HOUR_OF_DAY, 23);
		dateDuJour.set(Calendar.MINUTE, 30);
		dateDuJour.set(Calendar.SECOND, 59);

		Date dateJour1 = dateDuJour.getTime();
		SimpleDateFormat canevasDates1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		formatDateJour = canevasDates1.format(dateJour1);
		System.out.println("Nouvelle Date : ");
		System.out.println(formatDateJour);
		Calendar dateSysteme = Calendar.getInstance();
		Date dateSys = dateSysteme.getTime();
		
		SimpleDateFormat canevasDates2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		String fSysteme = canevasDates2.format(dateSys);
		System.out.println("Date Système : ");
		System.out.println(fSysteme);
		
	}

}
