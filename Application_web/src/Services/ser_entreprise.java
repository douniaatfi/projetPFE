package Services;

import java.sql.SQLException;

import Dao.dao_entreprise;

import Entites.Entreprise;

public class ser_entreprise {
       
	public static boolean AjouterEntreprise(Entreprise e) throws ClassNotFoundException, SQLException {
	      if(dao_entreprise.EntrepriseExist(e.getLogin())==false) {
	    	    dao_entreprise.AjouterEntreprise(e);
	    	  return true ;
	      }
		return false;
	}
	
	public static Entreprise authentification(String login , String password) throws ClassNotFoundException, SQLException {
		return Dao.dao_entreprise.authentification(login, password);}
	
}
