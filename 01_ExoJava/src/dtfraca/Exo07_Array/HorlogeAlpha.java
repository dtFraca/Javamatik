package dtfraca.Exo07_Array;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Afficher une horloge en caractere Alpha
 * Ex: 17h39 doit s'écrire "Dix sept heures, Trente neuf minutes"
 *
 * 2013-04-07 - tri
 */
public class HorlogeAlpha {
	public static void main(String[] args) {

		// Formatage date (pour affichage)
		Date now = new Date(); // must be java.util.Date
		System.out.printf("Date: %s\n", new SimpleDateFormat("EEEE, dd MMMM yyyy HH:mm:ss.SSS - 'TZ:'Z").format(now));
		System.out.printf("Date: %s\n", new SimpleDateFormat("EEE, d MMM yyyy - HH:mm:ss").format(now));

		Calendar calendarNow = Calendar.getInstance();
		int year = calendarNow.get(Calendar.YEAR);
		int month = calendarNow.get(Calendar.MONTH); // Note: zero based!
		int day = calendarNow.get(Calendar.DAY_OF_MONTH);
		int hour = calendarNow.get(Calendar.HOUR_OF_DAY);
		int minute = calendarNow.get(Calendar.MINUTE);
		int second = calendarNow.get(Calendar.SECOND);
		int millis = calendarNow.get(Calendar.MILLISECOND);

		System.out.println();
		System.out.printf("Year....: %4d\n", year);
		System.out.printf("Month...: %4d (ATTN: 0-based)\n", month);
		System.out.printf("Day.....: %4d\n", day);
		System.out.printf("Hour....: %4d\n", hour);
		System.out.printf("Minute..: %4d\n", minute);
		System.out.printf("Second..: %4d\n", second);
		System.out.printf("MilliSec: %4d\n", millis);

	}
}
