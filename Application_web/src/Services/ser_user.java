package Services;

import java.sql.SQLException;

import Entites.User;   
import Dao.dao_user;
public class ser_user {
   
	public static User authentification(String login , String password) throws ClassNotFoundException, SQLException {
		return dao_user.authentification(login,password);
		}
	
	public static String getrole(String login , String password) throws ClassNotFoundException, SQLException {
		return dao_user.roleuser(login,password);
		}
}
