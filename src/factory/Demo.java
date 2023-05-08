package factory;

public class Demo {
	public static void main(String[] args) {
		DatabaseFactory databaseFactory = new DatabaseFactory();

		Database mysql = databaseFactory.getDatabase(DatabaseType.MYSQL);
		mysql.connect();

		Database oracle = databaseFactory.getDatabase(DatabaseType.ORACLE);
		oracle.connect();

		Database postgre = databaseFactory.getDatabase(DatabaseType.POSTGRESQL);
		postgre.connect();
	}
}
