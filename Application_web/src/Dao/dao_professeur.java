package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import Entites.Professeur;

public class dao_professeur {
	public static int AjouterProfesseur(Professeur p) throws SQLException, ClassNotFoundException {
		Connexion.connect();
		int res=Connexion.Maj("insert into user(nom,prenom,login,password,date_naissance,adresse,cin,role) values('"+p.getNom()+"','"+p.getPrenom()+"','"+p.getLogin()+"','"+p.getPassword()+"',TO_DATE("+p.getDate_naissance()+",'YYYY-MM-DD'),'"+p.getAdresse()+"','"+p.getCin()+"', 'professeur')");
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
	 public int modifier_prof(Professeur pr) throws ClassNotFoundException, SQLException  {
	    	Connexion.connect();
	    	int res=Connexion.Maj("update user set nom ='"+pr.getNom()+"',prenom ='"+pr.getPrenom()+"',login ='"+pr.getLogin()+"',password ='"+pr.getPassword()+"',date_naissance ='"+pr.getDate_naissance()+"',adresse ='"+pr.getAdresse()+"',cin ='"+pr.getCin()+"' where id="+pr.getId()+"");
	    	Connexion.disconnect();
	    	return res;
	    }
		
	    public  int supprimer_prof(Professeur pr) throws ClassNotFoundException, SQLException  {
	    	Connexion.connect();
	    	int res=Connexion.Maj("delete from user where id="+pr.getId()+"");
	    	Connexion.disconnect();
	    	return res;
	    }
	
	    public  Professeur  consulter_prof(Professeur pr) throws ClassNotFoundException, SQLException  {
	    	Professeur p = null;
	    	Connexion.connect();
	    	ResultSet res=Connexion.Select("select * from user where id ="+pr.getId()+"");
	    	if(res.next()) {
	    	  p =new Professeur(res.getInt(1), res.getString(2), res.getString(3),res.getString(4),res.getString(5),res.getString(6), res.getString(7), res.getString(8));
			}
			Connexion.disconnect();
			return p;
	    }
	    

	    public  ArrayList<Professeur> listeprof() throws SQLException, ClassNotFoundException{
			ArrayList<Professeur> profs = new ArrayList<Professeur>();
			Connexion.connect();
			ResultSet res = Connexion.Select("select * from user");
			while(res.next()) {
				Professeur p =new Professeur(res.getInt(1), res.getString(2), res.getString(3),res.getString(4),res.getString(5),res.getString(6), res.getString(7), res.getString(8));
			        profs.add(p);
			}
			Connexion.disconnect();
			return profs;
		}
	
}
