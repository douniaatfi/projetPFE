package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import Entites.Evenement;

public class dao_evenement {
	public static int ajout_evenement(Evenement ev) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("insert into evenement(contenuev, date,urlimg) values('"+ev.getContenuev()+"',TO_DATE('"+ev.getDate()+"','YYYY-MM-DD'),'"+ev.getUrlimg()+"')");
    	Connexion.disconnect();
    	return res;
    }
    public static int modif_evenement() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("");
    	Connexion.disconnect();
    	return res;
    }
    public static void supp_evenement() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("");
    	Connexion.disconnect();
    }
    public static void consul_evenement() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	ResultSet res=Connexion.Select("");
    	Connexion.disconnect();
    }
}
