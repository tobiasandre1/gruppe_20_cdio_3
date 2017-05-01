package rest;

import dto.UserDTO;

public class HTMLBuilder {

	public String buildRow(UserDTO user){
		String html = "";
		html += "<tr>\n";
		html += "<td>"+user.getUserId()+"</td>\n";
		html += "<td>"+user.getUserName()+"</td>\n";
		html += "<td>"+user.getIni()+"</td>\n";
		html += "<td>"+user.getRoles()+"</td>\n";
		html += "<td>"+user.getCpr()+"</td>\n";
		html += "</tr>\n";
		return html;
	}
}
