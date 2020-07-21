package ${package}.${systemIdentifier}.server.persistence.api;

public class PersistenceApiUnitTestProd extends AbstractPersistenceApiUnitTestValidate {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected String getPersistenceUnitName() {
		return "prod";
	}
}