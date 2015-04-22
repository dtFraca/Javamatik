package ijp.ch21;

import java.util.*;
import java.io.*;

/**
 * Chapter 21 Sets and Maps
 * Demo a serialization + deserialization of a Set (implements clonable & serialization interface)
 * 2015-04-04 - tri
 */
public class Serialization {

	static private final String OBJSAVE_FILE = "/home/tri/AAA/test.dat";

	public static void main(String[] args) throws Exception {
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(OBJSAVE_FILE));
		LinkedHashSet<String> lhset1 = new LinkedHashSet<String>();
		lhset1.add("Ännecy");
		lhset1.add("Çharleville-Mézières");

		LinkedHashSet<String> lhset2 = (LinkedHashSet<String>)lhset1.clone();
		lhset1.add("Ætlantæ");
		lhset2.add("ÞåRÎŠ");
		lhset2.add("BrüssËl");
		output.writeObject(lhset1);
		output.writeObject(lhset2);
		output.close();

		ObjectInputStream input = new ObjectInputStream(new FileInputStream(OBJSAVE_FILE));
		lhset1 = (LinkedHashSet<String>)input.readObject();
		lhset2 = (LinkedHashSet<String>)input.readObject();
		System.out.printf("lhset1: %s\n", lhset1); // [Ännecy, Çharleville-Mézières, Ætlantæ]
		System.out.printf("lhset2: %s\n", lhset2); // [Ännecy, Çharleville-Mézières, ÞåRÎŠ, BrüssËl]
		output.close();
	}
}
