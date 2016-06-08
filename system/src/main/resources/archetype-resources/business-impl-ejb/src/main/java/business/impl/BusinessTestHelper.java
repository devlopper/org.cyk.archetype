#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.business.impl;

import java.io.Serializable;

import javax.inject.Singleton;

import org.cyk.system.root.business.impl.AbstractBusinessTestHelper;

@Singleton
public class BusinessTestHelper extends AbstractBusinessTestHelper implements Serializable {

	private static final long serialVersionUID = -6893154890151909538L;
	private static BusinessTestHelper INSTANCE;
	
	/**/
	
	@Override
	protected void initialisation() {
		INSTANCE = this;
		super.initialisation();
	}

	public static BusinessTestHelper getInstance() {
		return INSTANCE;
	}

}
