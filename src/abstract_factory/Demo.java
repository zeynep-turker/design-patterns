package abstract_factory;

public class Demo {
	public static void main(String[] args) {
		IDatabaseAbstractFactory mySQLFactory = new MySQLFactory();
		IDatabaseAbstractFactory oracleFactory = new OracleFactory();
		IDatabaseAbstractFactory postgreSQLFactory = new PostgreSQLFactory();

		Database mySQLDatabase = mySQLFactory.creteDatabase();
		Database oracleDatabase = oracleFactory.creteDatabase();
		Database postgreSQLDatabase = postgreSQLFactory.creteDatabase();

		mySQLDatabase.connect();
		oracleDatabase.connect();
		postgreSQLDatabase.connect();
	}
}

