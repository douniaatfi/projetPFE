package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entites.Message;
import Entites.Publication;

public class dao_pub {
	public static int ajout_pub(Publication pub) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("insert into publication(Caption) values ('"+pub.getCaption()+"')");
    	Connexion.disconnect();
    	return res;
    }
    public static void modif_pub() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("");
    	Connexion.disconnect();
    }
    public static void supp_pub() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("delete from ");
    	Connexion.disconnect();
    }
    public static void consul_pub() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	ResultSet res=Connexion.Select("");
    	Connexion.disconnect();
    }
    public  ArrayList<Publication> listepub(int id) throws SQLException, ClassNotFoundException{
  		ArrayList<Publication> pubs = new ArrayList<Publication>();
  		Connexion.connect();
  		ResultSet res = Connexion.Select("select * from publication where type ="+id);
  		while(res.next()) {
  			Publication pub =new Publication(res.getInt(1), res.getString(2), res.getString(3));
  			   pubs.add(pub);
  		}
  		Connexion.disconnect();
  		return pubs;
  	}
    
}
