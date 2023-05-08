package abstract_factory;

public class PostgreSQL implements Database {
	@Override
	public void connect() {
		System.out.println("Connected to PostgreSQL database.");
	}
}
