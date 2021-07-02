package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entites.Etudiant;


public class dao_etudiant {
	
	// Inscription d'etudiant :
	  
	public static int AjouterEtudiant(Etudiant e) throws SQLException, ClassNotFoundException {
		Connexion.connect();
		int res=Connexion.Maj("insert into user(nom,prenom,login,password,date_naissance,adresse,cne,code_ap,cin,role) values('"+e.getNom()+"','"+e.getPrenom()+"','"+e.getLogin()+"','"+e.getPassword()+"','"+e.getDate_naissance()+"','"+e.getAdresse()+"','"+e.getCne()+"',"+e.getCode_ap()+",'"+e.getCin()+"', 'etudiant')");
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
	 public int modifier(Etudiant e) throws ClassNotFoundException, SQLException  {
	    	Connexion.connect();
	    	int res=Connexion.Maj("update user set nom ='"+e.getNom()+"',prenom ='"+e.getPrenom()+"',login ='"+e.getLogin()+"',password ='"+e.getPassword()+"',date_naissance ='"+e.getDate_naissance()+"',adresse ='"+e.getAdresse()+"',cin ='"+e.getCin()+"',cne ='"+e.getCne()+"',code_ap ="+e.getCode_ap()+" where id="+e.getId()+"");
	    	Connexion.disconnect();
	    	return res;
	    }
		
	    public  int supprimer_etudiant(Etudiant e) throws ClassNotFoundException, SQLException  {
	    	Connexion.connect();
	    	int res=Connexion.Maj("delete from user where id="+e.getId()+"");
	    	Connexion.disconnect();
	    	return res;
	    }
	
	   public  Etudiant  consulter_etudiant(Etudiant et) throws ClassNotFoundException, SQLException  {
	    	Etudiant e = null;
	    	Connexion.connect();
	    	ResultSet res=Connexion.Select("select * from user where id ="+et.getId()+"");
	    	if(res.next()) {
	    	 // e =new Etudiant(res.getInt(1), res.getString(2), res.getString(3),res.getString(4),res.getString(5),res.getString(6), res.getString(7), res.getString(8), res.getString(9),res.getInt(10));
			}
			Connexion.disconnect();
			return e;
	    }
	
	    public  static ArrayList<Etudiant> listeetudiant() throws SQLException, ClassNotFoundException{
			ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
			Connexion.connect();
			ResultSet res = Connexion.Select("select * from user where role ='etudiant'");
			while(res.next()) {
				Etudiant e =new Etudiant(res.getInt(1), res.getString(3), res.getString(4),res.getString(5),res.getString(6),res.getString(7), res.getString(8), res.getString(11), res.getInt(12),res.getString(13));
				etudiants.add(e);
			}
			Connexion.disconnect();
			return etudiants;
		}
	

}
