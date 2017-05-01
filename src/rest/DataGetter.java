package rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("datagetter")
public class DataGetter {
	
	@GET
	public String getData(@FormParam("username") String username, @FormParam("password") String password){
		return "";
		
	}
}
