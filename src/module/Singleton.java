package module;

public class Singleton {
	// Private constructor suppresses
	// private Singleton() {
	//
	// }
	//
	// private static final Singleton instance = new Singleton();
	//
	// // default public constructor
	// public static Singleton getInstance() {
	// return instance;
	// }

	//volatile两种同步技巧之一，用来同步变量
	private static volatile Singleton instance = null;

	// Private constructor suppresses
	// default public constructor
	private Singleton() {

	}

	// thread safe and performance promote
	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				// when more than two threads run into the first null check same
				// time, to avoid instanced more than one time, it needs to be
				// checked again.
				if (instance == null) {
					instance = new Singleton();
				}
			}

		}
		return instance;
	}

}
