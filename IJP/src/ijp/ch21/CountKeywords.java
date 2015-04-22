package ijp.ch21;

import java.util.*;
import java.io.*;

/**
 * 21.4 Case Study: Counting Keywords
 * Count the number of KWs in a Java source file
 *
 * 2015-04-04 - tri
 */
public class CountKeywords {
	public static void main(String[] args) throws Exception {
//		Scanner input = new Scanner(System.in);
//		System.out.print("Enter a Java source file: ");
//		String filename = input.nextLine();

		String filename = "/home/tri/Documents/IntelliJProjects/Javamatik/01_ExoJava/src/dtfraca/Exo05_If_ElseIf_Switch/ChangeurDeMonnaie.java";
		File file = new File(filename);
		if (file.exists()) {
			System.out.println(filename);
			System.out.printf("Java KW Found: %d\n", countKeywords(file));
		}
		else {
			System.out.println("File " + filename + " does not exist");
		}
	}

	/**
	 * For each word in a Java source file, we need to determine whether the word is a keyword.
	 * To handle this efficiently, store all the keywords in a HashSet and use the contains method
	 * to test if a word is in the keyword set
	 *
	 * @param file the file obj of the java source file where we are going to read word by word
	 * @return the total count of Java KWs found (all KW counts combined)
	 * @throws Exception
	 */
	public static int countKeywords(File file) throws Exception {
		// Array of all Java keywords + true, false and null
		String[] keywordString = {"abstract", "assert", "boolean",
				"break", "byte", "case", "catch", "char", "class", "const",
				"continue", "default", "do", "double", "else", "enum",
				"extends", "for", "final", "finally", "float", "goto",
				"if", "implements", "import", "instanceof", "int",
				"interface", "long", "native", "new", "package", "private",
				"protected", "public", "return", "short", "static",
				"strictfp", "super", "switch", "synchronized", "this",
				"throw", "throws", "transient", "try", "void", "volatile",
				"while", "true", "false", "null"};

		// Set is MUCH faster than List to find an element by contains()
		// HashSet is used b/c the sort order of the elements in the Set is irrelevant in the scenario of this method
		// we just need to search in the Set if a KW exists or not
		Set<String> keywordSet = new HashSet<String>(Arrays.asList(keywordString)); // HashSet: from 60 ms to 80ms
		//Set<String> keywordSet = new LinkedHashSet<String>(Arrays.asList(keywordString)); // LinkedHashSet: from 60 ms to 80ms
		//List<String> keywordSet = new ArrayList<String>(Arrays.asList(keywordString)); // ArrayList: from 55 ms to 80ms

		long startTime = System.currentTimeMillis();
		int count = 0;
		Scanner input = new Scanner(file);
		while (input.hasNext()) {
			String word = input.next();
			if (keywordSet.contains(word))
				count++;
		}
		System.out.printf("KW Count completed in %d ms\n", System.currentTimeMillis() - startTime);
		return count;
	}
}
