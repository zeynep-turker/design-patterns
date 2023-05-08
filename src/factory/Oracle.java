package factory;

public class Oracle implements Database{
	@Override
	public void connect() {
		System.out.println("Connected to Oracle database.");
	}
}
