package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entites.Evenement;
import Entites.Offrestage;

public class dao_evenement {
	public static int ajout_evenement(Evenement ev) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("insert into evenement(contenuEven,Urlimg) values('"+ev.getContenuEven()+"','"+ev.getUrlimg()+"')");
    	Connexion.disconnect();
    	return res;
    }
    public static int modif_evenement(Evenement ev) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("update evenement set contenuev ='"+ev.getContenuEven()+"',date = TO_DATE('"+ev.getDate()+"','YYYY-MM-DD'),urlimg ='"+ev.getUrlimg()+"'");
    	Connexion.disconnect();
    	return res;
    }
    public static int supp_evenement(Evenement ev) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("delete from evenement where idevenement="+ev.getIdevenm());
    	Connexion.disconnect();
    	return res;
     }
    public static Evenement consul_evenement(Evenement ev) throws ClassNotFoundException, SQLException  {
    	Evenement evnm = null;
    	Connexion.connect();
    	ResultSet res=Connexion.Select("select * from evenement idevenement="+ev.getIdevenm());
    	  if(res.next()) {
    		  evnm = new Evenement(res.getInt(1),res.getString(2),res.getString(3),res.getString(4));
    	  }
    	Connexion.disconnect();
    	return evnm;
    }
    
    public  ArrayList<Evenement> listeevenm() throws SQLException, ClassNotFoundException{
  		ArrayList<Evenement> evenements = new ArrayList<Evenement>();
  		Connexion.connect();
  		ResultSet res = Connexion.Select("select * from evenement");
  		while(res.next()) {
  			Evenement evn =new Evenement(res.getInt(1), res.getString(2), res.getString(3),res.getString(4));
  			evenements.add(evn);
  		}
  		Connexion.disconnect();
  		return evenements;
  	}
}
