package ${package}.${systemIdentifier}.server.persistence.entities;

import java.util.Collection;

import org.cyk.utility.__kernel__.klass.PersistableClassesGetter;
import org.cyk.utility.__kernel__.test.weld.AbstractPersistenceUnitTest;
import org.junit.jupiter.api.Test;

public abstract class AbstractPersistenceEntitiesUnitTestValidate extends AbstractPersistenceUnitTest {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unchecked")
	@Test
	public void run(){
		assertCountIsNotNull((Collection<Class<?>>)PersistableClassesGetter.COLLECTION.get());
	}
}