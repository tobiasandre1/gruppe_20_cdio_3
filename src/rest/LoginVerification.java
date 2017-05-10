package rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import datalayer.UserDAO;

@Path("/LoginVerification")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)

public class LoginVerification {

	UserDAO userDAO = new UserDAO();
	int response = 0;

	@POST
	public int verification(String username, String password){
		for(int i = 0; i < userDAO.getUserList().size(); i++){
			if((userDAO.getUser(i).getUserName() == username) && (userDAO.getUser(i).getPassword() == password)){
				response = 1;
				return response;
			}
		} 
		return response;
	}
}
