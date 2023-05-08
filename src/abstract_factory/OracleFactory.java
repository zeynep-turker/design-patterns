package abstract_factory;

public class OracleFactory implements IDatabaseAbstractFactory {
	@Override
	public Database creteDatabase() {
		return new Oracle();
	}
}
