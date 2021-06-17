package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class dao_message {
	public static void ajout_message() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("");
    	Connexion.disconnect();
    }
    public static void modif_message() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("");
    	Connexion.disconnect();
    }
    public static void supp_message() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("");
    	Connexion.disconnect();
    }
    public static void consul_message() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	ResultSet res=Connexion.Select("");
    	Connexion.disconnect();
    }
}
