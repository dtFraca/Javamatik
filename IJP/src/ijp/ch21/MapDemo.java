package ijp.ch21;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 21.5 Maps
 * Basic demo of HashMap, LinkedHashMap, TreeMap
 * 2015-04-04 - tri
 */
public class MapDemo {
	public static void main(String[] args) {
		// HashMap: we have no control on the ordering of the entries
		Map<String, Float> hashMap = new HashMap<String, Float>(); //JDK8: HashMap<>()
		// Country, GPD2013 in Billion $US
		hashMap.put("United States", 16768.050F);
		hashMap.put("France", 2807.306F);
		hashMap.put("Australia", 1505.924F);
		hashMap.put("Canada", 1826.769F);
		hashMap.put("Netherlands", 853.806F);
		hashMap.put("Switzerland", 650.431F);

		System.out.println("HashMap (order is random)");
		//{France=2807.306, United States=16768.05, Canada=1826.769, Australia=1505.924, Netherlands=853.806, Switzerland=650.431}
		System.out.println(hashMap + "\n");

		// TreeMap: entries ordered by the Comparable interface of the element
		// or by a custom Comparator
		Map<String, Float> treeMap = new TreeMap<String, Float>(hashMap);
		System.out.println("TreeMap (sorted by key, ascending)");
		//{Australia=1505.924, Canada=1826.769, France=2807.306, Netherlands=853.806, Switzerland=650.431, United States=16768.05}
		System.out.println(treeMap);

		// LinkedHashMap: entries ordered by
		// 1. By insertion order
		// 2. By access order (the order in which entries were last accessed)
		Map<String, Float> linkedHashMap = new LinkedHashMap<String, Float>(16, 0.75f, true);
		linkedHashMap.put("Sweden", 558.949F);
		linkedHashMap.put("Argentina", 610.288F);
		linkedHashMap.put("India", 1876.811F);
		linkedHashMap.put("China", 9469.124F);
		linkedHashMap.put("Mexico", 1260.915F);
		linkedHashMap.put("Germany", 3635.959F);

		// The GPD2013 for India is 1876.811 (Billion $US)
		System.out.println("\nThe GPD2013 (Billion $US)");
		System.out.printf("India : % .3f \n", linkedHashMap.get("India"));
		System.out.printf("Sweden: % .3f \n", linkedHashMap.get("Sweden"));

		System.out.println("Display entries in LinkedHashMap");
		// NOTE: India, Sweden are listed last b/c they are the 2 last accessed entries
		//(The most recently accessed entry is placed at the end of the map)
		// the other entries are sorted by their insertion order
		// Reason: the LinkedHashMap is sorted by access order b/c it was instantiated
		// by LinkedHashMap<String, Float>(16, 0.75f, true);
		// otherwise it would be ordered bu insertion order

		//{Argentina=610.288, China=9469.124, Mexico=1260.915, Germany=3635.959, India=1876.811, Sweden=558.949}
		System.out.println(linkedHashMap);
	}
}
