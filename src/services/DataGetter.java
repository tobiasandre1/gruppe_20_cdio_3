package services;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("DataGetter")
public class DataGetter {
	
	@GET
	public String getData(){
				
		return "hello";
	}
	
}
