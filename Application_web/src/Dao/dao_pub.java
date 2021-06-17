package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class dao_pub {
	public static void ajout_pub() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("");
    	Connexion.disconnect();
    }
    public static void modif_pub() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("");
    	Connexion.disconnect();
    }
    public static void supp_pub() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("");
    	Connexion.disconnect();
    }
    public static void consul_pub() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	ResultSet res=Connexion.Select("");
    	Connexion.disconnect();
    }
}
