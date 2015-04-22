package ijp.ch21;

/**
 * Singleton class design pattern
 * http://howtodoinjava.com/2012/10/22/singleton-design-pattern-in-java/
 *
 * This is a code example given by "saurabh moghe"in comment
 * for how to create a singleton class using public constructor (instead of the usual getInstance)
 *
 * 2015-04-06 - tri
 */
public class MySingleton {
	private static MySingleton instance;

	// Usual practice: private constructor to prevent instanciation of the Singleton class
	// private Singleton() {}

	public static synchronized MySingleton getInstance() {
		return (instance != null) ? instance : new MySingleton();
	}


	public MySingleton() {
		System.out.println("in constructor");
		synchronized (MySingleton.class) {
			if (instance != null) {
				throw new IllegalStateException();
			}
			instance = this;
		}
	}
}
