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
		boolean isWindowsOS = false;

		while (keys.hasMoreElements()) {
			String key = (String) keys.nextElement();
			String value = (String) prop.get(key);
			System.out.printf("%s = %s\n", key, value);

			if (key.equals("os.name")) {
				if (value.toLowerCase().contains("windows")) {
					isWindowsOS = true;
				}
			}
		}

		System.out.println();
		System.out.println();

		if (isWindowsOS) {
			System.out.println("==== Vous avez Windows, happy with Activation?");
		} else {
			System.out.printf("==== Vous n'avez pas Windows, votre OS est: %s\n", prop.get("os.name"));
		}


		// version plus simple, utilisant recherche de sous-chaine d'une valeur dans une collection
		// inconvenient: tous les elements sont testes, et pas uniquement la cle "os.name"
		if (prop.contains("Linux")) {
			System.out.println("C'est bien vous avez Linux");
		} else {
			System.out.println("Il est temps d'apprendre Linux");
		}
	}
}
