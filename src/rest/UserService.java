package rest;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
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
			) throws DALException, URISyntaxException {
		
		dao.deleteUser(id);
		java.net.URI location = new java.net.URI("../userpage.html");
	    return Response.temporaryRedirect(location).build();
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
			) throws DALException, URISyntaxException {
		
		List<String> roles = new ArrayList<String>();
		roles.add(role);
		
		UserDTO user = new UserDTO(0, userName, ini, roles, password, cpr);
		dao.createUser(user);
		
		java.net.URI location = new java.net.URI("../userpage.html");
	    return Response.temporaryRedirect(location).build();
	}
	
}
