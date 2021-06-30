package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import Entites.Publication;

public class dao_pub {
	public static int ajout_pub( int id,String text ) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("insert into publication(Id,Caption) values ("+id+",'"+text+"')");
    	Connexion.disconnect();
    	return res;
    }
    public static void modif_pub() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("");
    	Connexion.disconnect();
    }
    public static int supp_pub(int id) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("delete from publication where IdPublication= "+id);
    	Connexion.disconnect();
    	return res;
    }
    
    public  ArrayList<Publication> listepub(int id) throws SQLException, ClassNotFoundException{
  		ArrayList<Publication> pubs = new ArrayList<Publication>();
  		Connexion.connect();
  		ResultSet res = Connexion.Select("select * from publication where IdPublication  ="+id);
  		while(res.next()) {
  			Publication pub =new Publication(res.getInt(1), res.getString(2), res.getString(3));
  			   pubs.add(pub);
  		}
  		Connexion.disconnect();
  		return pubs;
  	}
    public  ArrayList<Publication> listepub() throws SQLException, ClassNotFoundException{
  		ArrayList<Publication> pubs = new ArrayList<Publication>();
  		Connexion.connect();
  		ResultSet res = Connexion.Select("select * from publication ");
  		while(res.next()) {
  			Publication pub =new Publication(res.getInt(1), res.getString(2), res.getString(3));
  			   pubs.add(pub);
  		}
  		Connexion.disconnect();
  		return pubs;
  	}
}
