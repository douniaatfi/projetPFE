package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import Entites.Admin;
import Entites.Entreprise;
import Entites.Etudiant;
import Entites.Professeur;
import Entites.User;

public class dao_user {

	public static 	User authentification(String login , String password) throws SQLException, ClassNotFoundException {
		ResultSet res = null;
		User e=null;
		Connexion.connect();
		res = Connexion.Select("select * from  user where login='"+login+"' and password='"+password+"'");
		if(res.next()) {
			if(res.getString("role").equals("admin")) {
			 e = new Admin (res.getInt("Id"), res.getString("nom"), res.getString("prenom"), res.getString("login"), res.getString("password"),res.getString("date_naissance"),  res.getString("adresse"),res.getString("cin"));
			}else if(res.getString("role").equals("professeur")) {
				 e = new Professeur (res.getInt("Id"), res.getString("nom"), res.getString("prenom"), res.getString("login"), res.getString("password"),res.getString("date_naissance"),  res.getString("adresse"),res.getString("cin"));
		    }else if(res.getString("role").equals("etudiant")) {
				e = new Etudiant (res.getInt("Id"),res.getString("nom"),res.getString("prenom"), res.getString("login"),res.getString("password"),res.getString("date_naissance"),res.getString("adresse"),res.getString("cne"),res.getInt("code_ap"),res.getString("cin"));
				
			}else {
				 e = new Entreprise (res.getInt("Id"),res.getString("nom"), res.getString("login"), res.getString("password"),res.getString("adresse"),  res.getInt("telephone"),res.getString("tempdispo"));
			}
		Connexion.disconnect();
		
	}return e;
		}
	public static String roleuser(String login , String password) throws ClassNotFoundException, SQLException {
		String role = null;
		ResultSet res = null;
		Connexion.connect();
		res= Connexion.Select("select role from  user where login='"+login+"' and password='"+password+"'");
		if(res.next()) {
			role = res.getString("role");
		}
		Connexion.disconnect();
		return role;
		
	}
	public static String getnom(int id) throws ClassNotFoundException, SQLException {
		String nom = null;
		ResultSet res = null;
		Connexion.connect();
		res= Connexion.Select("select nom from  user where Id ="+id);
		if(res.next()) {
			nom = res.getString("role");
		}
		Connexion.disconnect();
		return nom;
	}
}

	