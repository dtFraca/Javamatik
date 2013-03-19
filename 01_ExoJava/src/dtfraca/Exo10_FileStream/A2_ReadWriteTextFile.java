package dtfraca.Exo10_FileStream;

import java.io.*;
//import java.text.DecimalFormat;
import java.util.Scanner;


/**
 * Writing a File using PrintWriter class
 * Read 1 (Text)  : using Scanner class
 * Read 2 (Binary): using Byte & Buffered streams
 * DOCS: http://docs.oracle.com/javase/tutorial/essential/io/index.html
 *
 * 2013-03-15 - tri
 */
public class A2_ReadWriteTextFile {
	public static void main(String[] args) throws IOException {
		//NOTE: prefixe ~ pour signifier temporaire pour etre ignore par Git
		String textFilename = "01_ExoJava/src/dtfraca/resource/~DemoFileByFormatter.txt";
		//String textFilename = "/home/tri/Documents/IntelliJProjects/Javamatik/01_ExoJava/src/dtfraca/resource/~DemoFileByFormatter.txt";

		File fileDemo = new File(textFilename);

		System.out.printf("FILE: %s\n\n", fileDemo.getAbsolutePath());
		System.out.println("WRITE using classe PrintWriter");

		// - if the file already exists, it will be emptied and rewritten by new content
		// - if the file doesn't exist, it will be created
		PrintWriter pw = new PrintWriter(textFilename);

		pw.format("Class: %s\n", A2_ReadWriteTextFile.class.getName());
		pw.format("Writing a File using Formatter class\n");
		pw.format("Read    a File using Scanner class\n");
		pw.format("------------------------------------\n\n");

		double prixHorsTaxe = 350d ;
		double tvaFrance = 0.196d ; // 19.6%
		double tvaOntario = 0.13d ; // 13%

/*
		DecimalFormat df = new DecimalFormat("#.00");

		pw.format("Prix Hors Taxe: %8s\n", df.format(prixHorsTaxe));
		pw.format("Taxe TVA......: %8s (France , TVA = %.2f%%)\n", df.format(tvaFrance * prixHorsTaxe), tvaFrance * 100d);
		pw.format("Prix + Taxe...: %8s (France)\n", df.format(prixHorsTaxe * (1 + tvaFrance)));
		pw.format("Taxe TVA......: %8s (Ontario, TVA = %.2f%%)\n", df.format(tvaOntario * prixHorsTaxe), tvaOntario * 100d);
		pw.format("Prix + Taxe...: %8s (Ontario)\n", df.format(prixHorsTaxe * (1 + tvaOntario)));
*/
		pw.format("Prix Hors Taxe: %8.2f\n", prixHorsTaxe);
		pw.format("Taxe TVA......: %8.2f (France , TVA = %.2f%%)\n", tvaFrance * prixHorsTaxe, tvaFrance * 100d);
		pw.format("Prix + Taxe...: %8.2f (France)\n", prixHorsTaxe * (1 + tvaFrance));
		pw.format("Taxe TVA......: %8.2f (Ontario, TVA = %.2f%%)\n", tvaOntario * prixHorsTaxe, tvaOntario * 100d);
		pw.format("Prix + Taxe...: %8.2f (Ontario)\n", prixHorsTaxe * (1 + tvaOntario));
		pw.close();

		System.out.println("\n========== READ (by Scanner) - BEGIN ==========");
		Scanner fileScan = new Scanner(fileDemo);
		while (fileScan.hasNext()) {
			System.out.println(fileScan.nextLine());
		}
		fileScan.close();
		System.out.println("========== READ (by Scanner) - END ==========");

		System.out.println("\n========== READ (by Byte & Buffered Steams) - BEGIN ==========");

		BufferedInputStream inByteBuffStrm = null;
		try {
			inByteBuffStrm = new BufferedInputStream(new FileInputStream(fileDemo));

			int byteValue;

			while ((byteValue = inByteBuffStrm.read()) != -1) {
				System.out.print((char) byteValue);
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (inByteBuffStrm != null)
				inByteBuffStrm.close();
		}

		System.out.println("========== READ (by Byte & Buffered Steams) - END ==========");
	}
}
