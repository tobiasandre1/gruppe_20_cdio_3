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
import javax.ws.rs.core.Response;

import datalayer.UserDAO;
import dto.UserDTO;
import idatalayer.IUserDAO;
import idatalayer.IUserDAO.DALException;

@Path("/userservice")
public class UserService {
	IUserDAO dao = new UserDAO();
	
	@POST
	@Path("/delete")
	@Consumes("application/x-www-form-urlencoded")
	public Response deleteUser(
		@FormParam("submit") int id
			) throws DALException {
		
		dao.deleteUser(id);
		return Response.status(200)
			.entity("User " + id + " was deleted succesfully...")
			.build();
	}
	
	@POST
	@Path("/insert")
	@Consumes("application/x-www-form-urlencoded")
	public Response insertUser(
		@FormParam("username") String userName,
		@FormParam("password") String password,
		@FormParam("ini") String ini,
		@FormParam("role") String role,
		@FormParam("cpr") String cpr
			) throws DALException {
		
		List<String> roles = new ArrayList<String>();
		roles.add(role);
		
		UserDTO user = new UserDTO(0, userName, ini, roles, password, cpr);
		dao.createUser(user);
		
		return Response.status(200)
			.entity("User was created succesfully...")
			.build();
	}
	
}
