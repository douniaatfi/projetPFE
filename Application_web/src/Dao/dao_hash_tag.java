package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class dao_hash_tag {
	public static void ajout_hash_tag() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("");
    	Connexion.disconnect();
    }
    public static void consul_hash_tag() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	ResultSet res=Connexion.Select("");
    	Connexion.disconnect();
    }

}
