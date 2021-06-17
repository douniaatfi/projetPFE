package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class dao_groupe {
	public static void ajout_groupe() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("");
    	Connexion.disconnect();
    }
    public static void modif_groupe() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("");
    	Connexion.disconnect();
    }
    public static void supp_groupe() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("");
    	Connexion.disconnect();
    }
    public static void consul_groupe() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	ResultSet res=Connexion.Select("");
    	Connexion.disconnect();
    }
}
