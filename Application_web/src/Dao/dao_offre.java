package Dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import Entites.Offreemploi;

public class dao_offre {
        public static int ajout_off_emploi(Offreemploi ofr) throws ClassNotFoundException, SQLException  {
        	Connexion.connect();
        	int res=Connexion.Maj("insert into offre(nom, description, date, containt,typecontrat , salaire, type) values('"+ofr.getNom()+"','"+ofr.getDescription()+"',TO_DATE('"+ofr.getDate()+"','YYYY-MM-DD'),'"+ofr.getContrainte()+"','"+ofr.getTypecontrat()+"','"+ofr.getSalaire()+"','emploi')");
        	Connexion.disconnect();
        	return res;
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
