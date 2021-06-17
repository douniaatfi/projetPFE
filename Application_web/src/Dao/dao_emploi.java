package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public class dao_emploi {
        public static void ajout_off_emploi() throws ClassNotFoundException, SQLException  {
        	Connexion.connect();
        	int res=Connexion.Maj("");
        	Connexion.disconnect();
        }
        public static void modif_off_emploi() throws ClassNotFoundException, SQLException  {
        	Connexion.connect();
        	int res=Connexion.Maj("");
        	Connexion.disconnect();
        }
        public static void supp_off_emploi() throws ClassNotFoundException, SQLException  {
        	Connexion.connect();
        	int res=Connexion.Maj("");
        	Connexion.disconnect();
        }
        public static void consul_off_emploi() throws ClassNotFoundException, SQLException  {
        	Connexion.connect();
        	ResultSet res=Connexion.Select("");
        	Connexion.disconnect();
        }
}
