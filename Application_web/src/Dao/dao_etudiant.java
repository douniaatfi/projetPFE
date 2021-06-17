package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import Dao.Connexion;
import Entites.Etudiant;

public class dao_etudiant {
	
	// Inscription d'etudiant :
	  
	public static int AjouterEtudiant(Etudiant e) throws SQLException, ClassNotFoundException {
		Connexion.connect();
		int res=Connexion.Maj("insert into user(nom,prenom,login,password,age,adresse,cin,cne,code_ap,role) values('"+e.getNom()+"','"+e.getPrenom()+"','"+e.getLogin()+"','"+e.getPassword()+"',"+e.getAge()+",'"+e.getAdresse()+"','"+e.getCin()+"','"+e.getCne()+"',"+e.getCode_ap()+", 'etudiant')");
		Connexion.disconnect();
		return res;
	}
	public static boolean etudiantExist(String email) throws ClassNotFoundException, SQLException {
		boolean exist = false;
		Connexion.connect();
		ResultSet res=Connexion.Select("select * from user where login='"+email+"'");
		if(res.next()) {
			exist=true;
		}
		Connexion.disconnect();
		return exist;
	}
	
	

}
