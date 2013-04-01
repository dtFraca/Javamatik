package dtfraca.Exo05_If_ElseIf_Switch;

import java.util.Enumeration;
import java.util.Properties;

/**
 * Class Description: ?
 * <p/>
 * 2013-04-01 - david
 */
public class InspecteurSystem {
	public static void main(String[] args) {

		Properties prop = System.getProperties();
		Enumeration keys = prop.keys();
		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			String value = (String) prop.get(key);
			System.out.printf("%s = %s\n", key, value);


		}
		System.out.println();
		System.out.println();
		System.out.println();

		if (prop.contains("Linux")) {
			System.out.println("C'est bien vous avez Linux");

		}

		else {
			System.out.println("Il est temps d'apprendre Linux");
		}
	}
}
