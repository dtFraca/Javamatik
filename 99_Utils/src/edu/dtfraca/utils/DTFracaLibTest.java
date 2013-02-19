package edu.dtfraca.utils;

import java.util.Date;
import java.util.Scanner;

/**
 * Testing of class DTFracaLib
 *
 * 2013-02-17 - tri
 */
public class DTFracaLibTest {

    public static void main(String[] args) {

        System.out.println("Testing DTFracaLib.ElapsedTime() - Presser [Enter] pour afficher temps ecoule");

        // temps depart avant demarrage de l'action
        long lStartTime = new Date().getTime();

        Scanner myScanner = new Scanner(System.in);
        myScanner.nextLine();

        System.out.printf("Temps ecoule: %s\n", DTFracaLib.ElapsedTime(lStartTime));
    }
}
