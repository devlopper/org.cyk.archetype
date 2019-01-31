#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.${systemIdentifier}.server.representation.impl;

@javax.ws.rs.ApplicationPath("/")
@javax.ws.rs.Path("/")
@javax.enterprise.context.ApplicationScoped
public class Application extends javax.ws.rs.core.Application {

	@javax.ws.rs.GET
	@javax.ws.rs.Path("/")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.TEXT_PLAIN)
	public String getRootResource() {
		return "Hi from ${systemIdentifier} system server. Time is "+new java.util.Date();
	}
	
}