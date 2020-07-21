package ${package}.${systemIdentifier}.server.persistence.api;

import org.cyk.utility.__kernel__.test.weld.AbstractPersistenceUnitTest;
import org.junit.jupiter.api.Test;

public class PersistenceApiUnitTest extends AbstractPersistenceUnitTest {
	private static final long serialVersionUID = 1L;

	@Override
	protected void initializeEntityManagerFactory(String persistenceUnitName) {
		super.initializeEntityManagerFactory(persistenceUnitName);
		ApplicationScopeLifeCycleListener.initialize();
		ApplicationScopeLifeCycleListener.initialize();//TODO it is not working when removed
		//org.cyk.utility.__kernel__.persistence.query.QueryExecutor.AbstractImpl.LOG_LEVEL = java.util.logging.Level.INFO;
	}
	
	@Override
	protected String getPersistenceUnitName() {
		return "default";
	}
	
	@Override
	protected void createData() {
	
	}
}