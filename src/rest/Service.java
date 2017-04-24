package rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("hello")
public class Service {
	
	@GET
	public String hello(){
		return "hello";
	}
	
}
