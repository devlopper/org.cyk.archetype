#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${systemIdentifier}.representation.impl;

import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@javax.ws.rs.Path("/")
public class RootService {

	@GET
	@Path("/")
	@Produces(MediaType.TEXT_PLAIN)
	public String getRootMessage() {
		return "Hi from ${systemIdentifier} management system. Time is "+new Date();
	}

}
