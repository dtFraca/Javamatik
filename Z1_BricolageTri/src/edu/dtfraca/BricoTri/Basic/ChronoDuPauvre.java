package edu.dtfraca.BricoTri.Basic;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;


/**
 * Display Elapsed Time
 * Source: http://www.tek-tips.com/viewthread.cfm?qid=1545586
 */
public class ChronoDuPauvre {

	public static void main(String[] args) {
		
		System.out.println("Le Chronomètre du Pauvre");
		System.out.println("Presser [Enter] pour afficher temps écoulé");
		System.out.println("------------------------------------------");

		// temps départ avant démarrage de l'action
		long lStartTime = new Date().getTime(); //start time

		Scanner myScanner = new Scanner(System.in);
		myScanner.nextLine(); // force wait for [Enter]
		
		ChronoDuPauvre.displayElapsedTime(lStartTime);
	}
	
	private static void displayElapsedTime(long lStartTime) {
		long lEndTime = new Date().getTime();

		SimpleDateFormat dateFmtTimeValue = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat dateFmtElapsedTime = new SimpleDateFormat("HH:mm:ss.SSS");
		dateFmtElapsedTime.setTimeZone(TimeZone.getTimeZone("UTC")); //eliminate TimeZone, otherwise TZ will be added to difference	

		System.out.println("Temps Départ: " + dateFmtTimeValue.format(new Date(lStartTime)));
		System.out.println("Temps Final.: " + dateFmtTimeValue.format(new Date(lEndTime)));
		System.out.println("Temps Ecoulé: " + dateFmtElapsedTime.format(new Date(lEndTime - lStartTime)));
	}
}
