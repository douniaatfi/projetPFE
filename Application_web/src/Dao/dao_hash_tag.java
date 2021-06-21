package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import Entites.Hash_Tag;

public class dao_hash_tag {
	public static int ajout_hash_tag(Hash_Tag htg) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("insert into hash_tag(nomhtag)values ('"+htg.getNomhtag()+"')");
    	Connexion.disconnect();
    	return res;
    }
    public static void consul_hash_tag() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	ResultSet res=Connexion.Select("");
    	Connexion.disconnect();
    }

}
