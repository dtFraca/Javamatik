package dtfraca.Exo06_Random;

import java.util.Random;

/**
 * Chiffre & Lettre aleatoires (en utilisant la classe java.util.Random)
 * 1. Apprendre la class Random
 * 2. Code Ascii http://www.ascii-code.com/
 * 3. Conversion data type int -> char
 * 4. Test logiques dans IF: condition ET (&&), operateur NOT (!)
 *
 * 2013-02-15 - Tri
 */
public class A1_DemoRandom {

    public static void main(String[] args) {
        Random rnd = new Random();

        System.out.println("------------------------------------");
        System.out.println("Demo class java.util.Random");
        System.out.println("------------------------------------");

        // rnd.nextInt(MAX) +1 = generer un nombre aleatoire entre 1 et MAX.
        // Pourquoi +1 ? Parce que rnd.nextInt(MAX) -> genere un nb entre (0 et MAX -1)
        System.out.printf("Nombre au hasard entre 1 et 20........: %d\n", rnd.nextInt(20) +1);
        System.out.printf("Nombre au hasard entre 1 et 1000......: %d\n", rnd.nextInt(1000) +1);

        // Code Ascii: http://www.ascii-code.com/
        // 26 lettres alphabet [A-Z] (code Ascii 65 -> 90)
        // Un nombre aleatoire entre (65, 90) = un nb aleatoire entre (0, 26) +65
        int codeAsciiMaj = rnd.nextInt(26) +65;
        char charLettreMaj = (char) codeAsciiMaj; // convert int -> char
        System.out.printf("Lettre Majuscule aleatoire (65 -> 90) : %s (Code Ascii: %d)\n", charLettreMaj, codeAsciiMaj);

        // 26 lettres alphabet [a-z] (code Ascii 97 -> 122)
        int codeAsciiMinus = rnd.nextInt(26) +97;
        char charLettreMinus = (char) codeAsciiMinus; // convert int -> char
        System.out.printf("Lettre minuscule aleatoire (97 -> 122): %s (Code Ascii: %d)\n", charLettreMinus, codeAsciiMinus);

        // 14 symboles simple (code Ascii 33 -> 47)
        int codeAsciiSymbSimple = rnd.nextInt(14) +33;
        System.out.printf("Symbol simple #1 aleatoire (33 -> 47).: %s (Code Ascii: %d)\n", (char) codeAsciiSymbSimple, codeAsciiSymbSimple);

        // 6 symboles simple (code Ascii 91 -> 96)
        int codeAsciiSymbSimple2 = rnd.nextInt(6) +91;
        System.out.printf("Symbol simple #2 aleatoire (91 -> 96).: %s (Code Ascii: %d)\n", (char) codeAsciiSymbSimple2, codeAsciiSymbSimple2);


        /*--------------------------------------------------------------------
        Un symbol etendu = code 33 -> 255 (EXCLURE: chiffre, lettre Majuscule, minuscule)
        --------------------------------------------------------------------*/
        int codeAsciiSymbol = 0;

        while (true) {
            // Les caracteres ne sont affichables qu'a partir du code asci  33 -> 255
            // Pour obtenir un nb aleatoire entre (33, 255) on fait (0, 223) +33
            codeAsciiSymbol = rnd.nextInt(223) +33;

            // On accepte code Ascii obtenu QUE si le code N'EST PAS
            // [0-9] = Code Ascii 48 -> 57
            // [A-Z] = Code Ascii 65 -> 90
            // [a-z] = Code Ascii 97 -> 122

            // Condition 1: n'est pas [0-9]
            if ( ! (codeAsciiSymbol >= 48 && codeAsciiSymbol <= 57) ) {

                // Condition 2: n'est pas [A-Z]
                if ( ! (codeAsciiSymbol >= 65 && codeAsciiSymbol <= 90) ) {

                    // Condition 3: n'est pas [a-z]
                    if ( ! (codeAsciiSymbol >= 97 && codeAsciiSymbol <= 122) ) {
                        // maintenant on est sur que c'est un symbole
                        break; // quitter boucle WHILE
                    }
                }
            }


            /*
            Le meme test plus "pro" mais plus difficile a comprendre

            if (    ! (codeAsciiSymbol >= 48 && codeAsciiSymbol <= 57) // 0-9
                 && ! (codeAsciiSymbol >= 65 && codeAsciiSymbol <= 90) // A-Z
                 && ! (codeAsciiSymbol >= 97 && codeAsciiSymbol <= 122) // a-z
            ) {
                break; // quitter boucle WHILE
            }
            */
        }

        char charSymbol = (char) codeAsciiSymbol; // convert int -> char
        System.out.printf("Symbol etendu aleatoire...............: %s (Code Ascii: %d)\n", charSymbol, codeAsciiSymbol);
    }
}
