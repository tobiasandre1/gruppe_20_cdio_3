package rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("hello")
public class Service {
	
	@GET
	public String hello(){
		return "hello";
	}
	
	@POST
	public String hello2(@FormParam("username") String username, @FormParam("password") String password){
		return username+", "+password;
	}
	
}
