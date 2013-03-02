package dtfraca.BricoTri.Basic;

import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;


/**
 * 1. Display a list N items (N is hardcoded). Each item is a random string
 * 2. Write the list of N items on a local file (same location than project folder)
 * The previous content of the file will be overwritten
 * 3. Re-Read the file just generated
 */
public class RandomStringGenerator {

   static final private int MAX_STR_LENGTH = 20;
   static final private int ITEM_COUNT_MAX = 10;
   static final private String PASSWORD_DUMP_FILENAME = "~PasswordDump.txt"; // ~ prefix:, to mean temp file, ignored by GitHub

   public static void main(String[] args) throws FileNotFoundException {
      //-------------------------------------------------
      // Generate Random strings + Write to file
      //-------------------------------------------------
      PrintStream diskWriter = new PrintStream(PASSWORD_DUMP_FILENAME);
      for (int kk = 1; kk <= ITEM_COUNT_MAX; kk++) {
         String rndStr = RandomString(MAX_STR_LENGTH);
         System.out.println(String.format("%3d. %s", kk, rndStr));
         diskWriter.println(rndStr);
      }
      diskWriter.close();
      System.out.println("---------------------------");
      System.out.println(String.format("%d random strings have been generated in %s", ITEM_COUNT_MAX, PASSWORD_DUMP_FILENAME));
      System.out.println("Re-Read from File");
      System.out.println("---------------------------");
      Scanner diskScanner = new Scanner(new File(PASSWORD_DUMP_FILENAME));

      //-------------------------------------------------
      // Read back the content of the file line by line
      // + strip symbols to leave only AlphaNum text
      //-------------------------------------------------
      int lineNumber = 1;
      while (diskScanner.hasNextLine()) {
         String lineRead = diskScanner.nextLine();
         char[] lineAlphaNum = new char[lineRead.length()];
         int charFoundCount = 0;

         // keep only alphanum chars (discarding symbols)
         for (int kk = 0; kk < lineRead.length(); kk++) {
            char charRead = lineRead.charAt(kk);
            if ((charRead >= 48 && charRead <= 57) // 0-9
                  || (charRead >= 65 && charRead <= 90) // A-Z
                  || (charRead >= 97 && charRead <= 122) // a-z
                  ) {
               lineAlphaNum[charFoundCount++] = charRead;
            }
         }

         System.out.print(String.format("%3d. ", lineNumber++));
         System.out.println(String.format("%s -> %s", lineRead, new String(lineAlphaNum)));
      }
      diskScanner.close();
   }


   //region Private Methods

   /**
    * Generate a random string at a specific length
    * Included chars: symbol, digits, lower & upper cases
    * Excluded chars: space, non-printable, ascii > 126
    * Ex: RandomString(20) -> "bB|V|]LzI54@yahwa5QX";
    */
   private static String RandomString(int length) {
      char[] rndStr = new char[length];
      Random rnd = new Random();

      for (int kk = 0; kk < length; kk++) {
         int rndAscii = 0;

         while (rndAscii < 33 || rndAscii > 126) {
            rndAscii = rnd.nextInt(127);
         }
         rndStr[kk] = (char) rndAscii;
      }

      return new String(rndStr);
   }
   //endregion

}
