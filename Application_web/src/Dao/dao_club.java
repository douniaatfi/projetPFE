package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entites.Club;



public class dao_club {
     
	public static int ajout_groupe(Club c) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("insert into groupe(nom,photogr,description)values('"+c.getNom()+"','"+c.getPhotogr()+"','"+c.getDescription()+"')");
    	Connexion.disconnect();
    	return res;
    }
    public static int modif_groupe(Club c) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("update groupe set nom='"+c.getNom()+"'photogr='"+c.getPhotogr()+"'description='"+c.getDescription()+"'");
    	Connexion.disconnect();
    	return res;
    }
    public static int supp_groupe(Club c) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("delete from groupe where id="+c.getIdgroupe());
    	Connexion.disconnect();
    	return res;
    }
    public static Club consul_groupe(Club cl) throws ClassNotFoundException, SQLException  {
    	Club c = null;
    	Connexion.connect();
    	ResultSet res=Connexion.Select("select * from groupe where id="+cl .getIdgroupe());
    	if(res.next()) {
    	 c = new Club (res.getInt(1),res.getString(2),res.getString(3),res.getNString(4));	
    	}
    	Connexion.disconnect();
    	return c;
    }
    
    public  ArrayList<Club> listeprof() throws SQLException, ClassNotFoundException{
		ArrayList<Club> clubs = new ArrayList<Club>();
		Connexion.connect();
		ResultSet res = Connexion.Select("select * from groupe where type ='club'");
		while(res.next()) {
			Club c =new Club(res.getInt(1), res.getString(2), res.getString(3),res.getString(4));
			   clubs.add(c);
		}
		Connexion.disconnect();
		return clubs;
	}
}
