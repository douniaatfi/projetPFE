package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import Entites.Admin;
import Entites.Etudiant;
import Entites.Professeur;
import Entites.User;

public class dao_user {

	public static 	User authentification(String login,String password) throws SQLException, ClassNotFoundException {
		ResultSet res = null;
		User e=null;
		Connexion.connect();
		res = Connexion.Select("select * from user where login='"+login+"' and password='"+password+"'");
		if(res.next()) {
			if(res.getString(11).equals("admin")) {
			   e = new Admin (res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5),res.getString(6),res.getString(7),res.getString(10));
			}else if(res.getString(11).equals("etudiant")) {
		       e = new Etudiant (res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getInt(10));
		       }else if(res.getString(11).equals("professeur")) {
		       e = new Professeur (res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5),res.getString(6),res.getString(7),res.getString(10));	   
		       }
			}
		Connexion.disconnect();
		return e;
	}
	
	public static String roleUser(String login,String password) throws SQLException, ClassNotFoundException {
		ResultSet res = null;
		String role = null;
		Connexion.connect();
		res=Connexion.Select("select * from user where login ='"+login+"' and password='"+password+"'");
		if(res.next()) {
		 role= res.getString("role");	
		}
		Connexion.disconnect();
		return role;
	}
}
