package ${package}.${systemIdentifier}.server.persistence.api;

import org.cyk.utility.__kernel__.persistence.query.QueryExecutorArguments;
import org.junit.jupiter.api.Test;

public class PersistenceApiUnitTestDev extends AbstractPersistenceApiUnitTestValidate {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected String getPersistenceUnitName() {
		return "dev";
	}
}