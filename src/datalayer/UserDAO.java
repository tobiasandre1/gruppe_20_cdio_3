package datalayer;

import java.util.ArrayList;
import java.util.List;

import idatalayer.IUserDAO;
import dto.UserDTO;

public class UserDAO implements IUserDAO{
	static List<UserDTO> userList = new ArrayList<UserDTO>();
	static int nextUserId;
	static{
		userList.add(new UserDTO(1, "admin", "A", new ArrayList<String>() {
				private static final long serialVersionUID = -5718424645068011262L;
				{add("admin");}}, "", "010517-0000"));
		userList.add(new UserDTO(2, "test", "T", new ArrayList<String>() {
			private static final long serialVersionUID = -5718424645068011262L;
			{add("operatoer");}}, "", "080517-0000"));
		nextUserId = userList.size();
	}
	
	public UserDAO(){
	}
	
	
	public UserDTO getUser(int userId){
		for(int i=0; i<userList.size(); i++){
			if(userList.get(i).getUserId() == userId){
				return userList.get(i);
			}
		}
		return null;
	}
	
	public List<UserDTO> getUserList(){
		return userList;
	}
	
	public void createUser(UserDTO user){
		nextUserId++;
		user.setUserId(nextUserId);
		userList.add(user);
		
	}
	
	public void updateUser(UserDTO user){
		for(int i = 0; i < userList.size(); i++){
			if(userList.get(i).getUserId() == user.getUserId()){
				userList.set(i, user);
			}
		}
	}
	//returns false if no user was removed
	public boolean deleteUser(int userId){
		boolean userRemoved = false;
		for(int i = 0; i < userList.size(); i++){
			if(userList.get(i).getUserId() == userId){
				userList.remove(i);
				userRemoved = true;
			}
		}
		return userRemoved;
	}

}
