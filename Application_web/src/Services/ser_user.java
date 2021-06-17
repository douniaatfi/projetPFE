package Services;

import java.sql.SQLException;

import Dao.dao_user;
import Entites.User;   

public class ser_user {
   
	public static User AuthentificationUser(String email,String mdp) throws ClassNotFoundException, SQLException {

		return dao_user.authentification(email, mdp);
		
	}
	public static String returnrole(String email,String mdp) throws ClassNotFoundException, SQLException {

		return dao_user.roleUser(email, mdp);
		
	}
}
