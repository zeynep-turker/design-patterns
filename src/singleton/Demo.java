package singleton;

public class Demo {
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.name);
	}
}
