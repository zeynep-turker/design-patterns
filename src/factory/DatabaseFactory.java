package factory;

public class DatabaseFactory {
	public Database getDatabase(DatabaseType type) {
		if (type == null) return null;

		if (type.equals(DatabaseType.MYSQL)) return new MySQL();
		else if (type.equals(DatabaseType.ORACLE)) return new Oracle();
		else if (type.equals(DatabaseType.POSTGRESQL)) return new PostgreSQL();
		return null;
	}
}
