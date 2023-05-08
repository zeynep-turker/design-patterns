package abstract_factory;

public class PostgreSQLFactory implements IDatabaseAbstractFactory {
	@Override
	public Database creteDatabase() {
		return new PostgreSQL();
	}
}


