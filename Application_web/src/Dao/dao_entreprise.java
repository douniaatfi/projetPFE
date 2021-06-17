package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import Entites.Entreprise;

public class dao_entreprise {
	    
	public static int AjouterEntreprise(Entreprise e) throws SQLException, ClassNotFoundException {
		Connexion.connect();
		int res=Connexion.Maj("insert into entreprise(nom,login,password,adresse,tele) values('"+e.getNom()+"','"+e.getLogin()+"','"+e.getPassword()+"','"+e.getAdresse()+"',"+e.getTele()+")");
		Connexion.disconnect();
		return res;
	}
	public static boolean EntrepriseExist(String email) throws ClassNotFoundException, SQLException {
		boolean exist = false;
		Connexion.connect();
		ResultSet res=Connexion.Select("select * from entreprise where login='"+email+"'");
		if(res.next()) {
			exist=true;
		}
		Connexion.disconnect();
		return exist;
	}
	
	public static Entreprise authentification(String login,String password) throws SQLException, ClassNotFoundException {
		ResultSet res = null;
		Entreprise e=null;
		Connexion.connect();
		res = Connexion.Select("select * from entreprise where login='"+login+"' and password='"+password+"'");
		if(res.next()) {
			e=new Entreprise(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getInt(6));
			
		Connexion.disconnect();
		
	      }return e;
	}
	
}
