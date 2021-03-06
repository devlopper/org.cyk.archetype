#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.ui.web.primefaces;

import java.io.Serializable;

import javax.inject.Singleton;

import lombok.Getter;

import ${package}.business.impl.BusinessLayer;
import org.cyk.ui.api.AbstractUserSession;
import org.cyk.ui.api.command.menu.SystemMenu;
import org.cyk.ui.web.api.security.shiro.WebEnvironmentAdapter;
import org.cyk.ui.web.api.security.shiro.WebEnvironmentAdapter.SecuredUrlProvider;
import org.cyk.ui.web.primefaces.AbstractPrimefacesManager;
import org.cyk.utility.common.annotation.Deployment;
import org.cyk.utility.common.annotation.Deployment.InitialisationType;

@Singleton @Deployment(initialisationType=InitialisationType.EAGER,order=WebManager.DEPLOYMENT_ORDER) @Getter
public class WebManager extends AbstractPrimefacesManager implements Serializable {

	public static final int DEPLOYMENT_ORDER = BusinessLayer.DEPLOYMENT_ORDER+1;
	private static final long serialVersionUID = 7231721191071228908L;

	private static WebManager INSTANCE;
	
	@Override
	protected void initialisation() {
		INSTANCE = this;
		identifier = "${systemId}";
		super.initialisation();  
		
		
	}
		
	public static WebManager getInstance() {
		return INSTANCE;
	}
	
}
