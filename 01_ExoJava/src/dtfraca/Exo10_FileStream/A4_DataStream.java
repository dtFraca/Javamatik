package dtfraca.Exo10_FileStream;

import java.io.*;

/**
 * Read & Write on File PRIMITIVE data using DataStream (binary file format)
 * Primitive Data types = string, int, long, short, bool, byte, char, float, double
 * DOCS: http://docs.oracle.com/javase/tutorial/essential/io/datastreams.html
 *
 * 2013-03-17 - tri
 */
public class A4_DataStream {
	public static void main(String[] args)  throws IOException {
		File filePays = new File("01_ExoJava/src/dtfraca/resource/~Top10PaysParSurface.bin");

		/*
		// Source: http://www.pays-monde.fr/classement-pays-superficie-geographie_1.html
		1  Russie	  	16.888.500
		2  Canada	  	9.984.670
		3  Etats-Unis	9.826.630
		4  Chine	  	9.327.420
		5  Brésil	  	8.459.420
		6  Australie	7.682.300
		7  Inde	  		2.973.190
		8  Argentine	2.736.690
		9  Kazakhstan	2.699.700
		10 Algérie		2.381.740 
		* */

		String[] pays = { "Russie", "Canada", "Etats-Unis", "Chine", "Brésil", "Australie", "Inde", "Argentine", "Kazakhstan", "Algérie" };
		Integer[] surfaceKM2 = {16888500, 9984670, 9826630, 9327420, 8459420, 7682300, 2973190, 2736690, 2699700, 2381740};


		System.out.printf("OUTPUT FILE: %s\n", filePays.getAbsolutePath());
		System.out.println("\n=== Write: DataOutputStream ========================");
		DataOutputStream dataStrmOut = null;
		try {
			dataStrmOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(filePays)));

			for (int kk = 0; kk < pays.length; kk++) {
				dataStrmOut.writeUTF(pays [kk]);
				dataStrmOut.writeInt(surfaceKM2 [kk]);
				// Verif
				System.out.printf("%-15s: %8d\n", pays[kk], surfaceKM2[kk]);
			}
		}
		finally {
			if (dataStrmOut != null) { dataStrmOut.close(); }
		}


		System.out.println("\n=== Read: DataInputStream ========================");
		DataInputStream dataStrmIn = null;
		try {
			dataStrmIn = new DataInputStream(new BufferedInputStream(new FileInputStream(filePays)));

			//while (true) {
			while (dataStrmIn.available() > 0) {
				String nomPays = dataStrmIn.readUTF();
				int surfacePaysKM2 = dataStrmIn.readInt();
				System.out.printf("%-15s: %8d\n", nomPays, surfacePaysKM2);
			}
		}
		catch (EOFException e) {
			//ignore EOF (End of File), no error, for DataInputStream, this means no more to read
		}
		finally {
			if (dataStrmIn != null) { dataStrmIn.close(); }
		}

	}
}
