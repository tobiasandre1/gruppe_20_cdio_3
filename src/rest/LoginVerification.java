package rest;

import javax.ws.rs.*;
import datalayer.UserDAO;

@Path("/LoginVerification")
public class LoginVerification {

	UserDAO userDAO = new UserDAO();

	@POST
	public int verification(@FormParam("username") String username, @FormParam("password") String password){
		for(int i = 0; i < userDAO.getUserList().size(); i++){
			if((userDAO.getUser(i).getUserName() == username) && (userDAO.getUser(i).getPassword() == password)){
				return 1;
			}
		} 
		return 0;
	}
}
