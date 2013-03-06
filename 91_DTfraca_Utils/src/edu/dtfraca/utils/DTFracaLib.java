package edu.dtfraca.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;


/**
 * Modeste Utilitaires par DTFraca
 * <p/>
 * 2013-02-17 - tri
 */
public class DTFracaLib {

	/**
	 * Calcule le temps ecoule et retourne le resultat en format "HH:mm:ss.SSS"
	 * Ex: 14:33:46.321 signifie que le temps ecoule est 14h, 33 minutes, 46.321 seconds
	 * <p/>
	 * Source: http://www.tek-tips.com/viewthread.cfm?qid=1545586
	 */
	static public String ElapsedTime(long lStartTime) {
		long lEndTime = new Date().getTime();

		SimpleDateFormat dateFmtTimeValue = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat dateFmtElapsedTime = new SimpleDateFormat("HH:mm:ss.SSS");
		dateFmtElapsedTime.setTimeZone(TimeZone.getTimeZone("UTC")); //eliminate TimeZone, otherwise TZ will be added to difference

		String elapsedHMS = dateFmtElapsedTime.format(new Date(lEndTime - lStartTime));

        /*
		  System.out.println("Temps D�part: " + dateFmtTimeValue.format(new Date(lStartTime)));
        System.out.println("Temps Final.: " + dateFmtTimeValue.format(new Date(lEndTime)));
        System.out.println("Temps Ecoul�: " + elapsedHMS);
        */

		return elapsedHMS;
	}
}
