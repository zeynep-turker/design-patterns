package abstract_factory;

public class MySQL implements Database {
	@Override
	public void connect() {
		System.out.println("Connected to MySQL database.");
	}
}

