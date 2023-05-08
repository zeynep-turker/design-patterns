package abstract_factory;

public class MySQLFactory implements IDatabaseAbstractFactory {
	@Override
	public Database creteDatabase() {
		return new MySQL();
	}
}
