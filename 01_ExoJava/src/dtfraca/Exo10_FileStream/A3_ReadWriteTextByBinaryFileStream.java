package dtfraca.Exo10_FileStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


import java.io.*;

/**
 * Read/Write a Text File using Binary format (FileStream) - NOT recommended
 * DOCS: http://docs.oracle.com/javase/tutorial/essential/io/bytestreams.html
 *
 * 2013-03-17 - tri
 */
public class A3_ReadWriteTextByBinaryFileStream {
	public static void main(String[] args) throws IOException {

/*
		String[] listMoisFR = {"Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre" };

		for (int kk = 0; kk < listMoisFR.length ; kk++ ) {
			System.out.printf("%s, ", listMoisFR[ kk ]);
		}
*/

		String moisFR = "Janvier, Février, Mars, Avril"; //, Mai, Juin, Juillet, Août, Septembre, Octobre, Novembre, Décembre";

		//============Write Binary File ===================
		String binFileName = "01_ExoJava/src/dtfraca/resource/~MoisFR_Binary.bin";
		//String textFilename = "/home/tri/Documents/IntelliJProjects/Javamatik/01_ExoJava/src/dtfraca/resource/~DemoFileByFormatter.txt";

		File fileBin = new File(binFileName);
		FileInputStream in = null;
		FileOutputStream outByteStrm = null;

		System.out.printf("FILE: %s\n", fileBin.getAbsolutePath());
		System.out.println("===WRITE (Binary):");
		try {
			outByteStrm = new FileOutputStream(binFileName);

			for (char c : moisFR.toCharArray()) {
				// Affiche le char a l'ecran pour verificcation
				System.out.printf("%3c ", c);

				byte charAscii = (byte) c;
				outByteStrm.write(charAscii);
			}

		} finally {
			if (outByteStrm != null) {
				outByteStrm.close();
			}
		}

		System.out.println("\n\n===READ (Binary)");
		try {
			in = new FileInputStream(binFileName);

			int charAscii;
			while ((charAscii = in.read()) != -1) {
				System.out.printf("%3d ", charAscii);
			}

		} finally {
			if (in != null) {
				in.close();
			}
		}


	}
}
