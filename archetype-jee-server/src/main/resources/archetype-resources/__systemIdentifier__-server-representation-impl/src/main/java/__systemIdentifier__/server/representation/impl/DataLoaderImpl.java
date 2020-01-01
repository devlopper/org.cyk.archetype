#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${systemIdentifier}.server.representation.impl;

import java.io.Serializable;

import javax.ws.rs.core.Response;

import org.cyk.utility.server.representation.AbstractDataLoaderImpl;

@${package}.${systemIdentifier}.server.annotation.System
public class DataLoaderImpl extends AbstractDataLoaderImpl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Override
	public Response load() {
		try {
			
		} catch (Exception exception) {
			exception.printStackTrace();
			return Response.serverError().build();
		}
		return Response.ok().build();
	}
	
}