package ${package}.${systemIdentifier}.server.persistence.entities;

public class PersistenceEntitiesUnitTestDev extends AbstractPersistenceEntitiesUnitTestValidate {
	private static final long serialVersionUID = 1L;

	@Override
	protected String getPersistenceUnitName() {
		return "dev";
	}
}