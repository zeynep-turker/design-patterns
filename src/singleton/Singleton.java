package singleton;

public class Singleton {
	private static Singleton instance;
	public String name = "SINGLETON";

	private Singleton() {}

	public static synchronized Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
