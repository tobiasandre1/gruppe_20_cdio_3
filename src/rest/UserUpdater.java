package rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import datalayer.UserDAO;
import dto.UserDTO;
import idatalayer.IUserDAO;
import idatalayer.IUserDAO.DALException;

@Path("userupdater")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class UserUpdater {
	IUserDAO dao = new UserDAO();
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void updateUser() throws DALException{
		//TODO Implement
	}
}
