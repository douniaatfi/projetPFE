package Dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entites.Offreemploi;


public class dao_offre_emploi {
        public static int ajout_off_emploi(Offreemploi ofr) throws ClassNotFoundException, SQLException  {
        	Connexion.connect();
        	int res=Connexion.Maj("insert into offre(nom, description, date, containt,typecontrat , salaire, type) values('"+ofr.getNom()+"','"+ofr.getDescription()+"',TO_DATE('"+ofr.getDate()+"','YYYY-MM-DD'),'"+ofr.getContrainte()+"','"+ofr.getTypecontrat()+"','"+ofr.getSalaire()+"','emploi')");
        	Connexion.disconnect();
        	return res;
        }
        public static int modif_off_emploi(Offreemploi ofr) throws ClassNotFoundException, SQLException  {
        	Connexion.connect();
        	int res=Connexion.Maj("update offre set nom ='"+ofr.getNom()+"',description ='"+ofr.getDescription()+"',Date = TO_DATE('"+ofr.getDate()+"','YYYY-MM-DD'),Contrainte ='"+ofr.getContrainte()+"',TypeContrat ='"+ofr.getTypecontrat()+"'salaire ="+ofr.getSalaire()+" where id="+ofr.getIdofremp());
        	Connexion.disconnect();
        	return res;
        }
        public static int supp_off_emploi(Offreemploi offre) throws ClassNotFoundException, SQLException  {
        	Connexion.connect();
        	int res=Connexion.Maj("delete from offre where id="+offre.getIdofremp());
        	Connexion.disconnect();
        	return res;
        }
        public static Offreemploi consul_off_emploi(Offreemploi offre) throws ClassNotFoundException, SQLException  {
        	Connexion.connect();
        	Offreemploi ofr = null;
        	ResultSet res=Connexion.Select("select * from offre where id ="+offre.getIdofremp());
        	if(res.next()) {
        		ofr= new Offreemploi(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getDouble(7));
        	}
        	Connexion.disconnect();
        	return ofr;
        }
        

	    public  ArrayList<Offreemploi> listeemploi() throws SQLException, ClassNotFoundException{
			ArrayList<Offreemploi> ofremplois = new ArrayList<Offreemploi>();
			Connexion.connect();
			ResultSet res = Connexion.Select("select * from offre where type = 'emploi'");
			while(res.next()) {
				Offreemploi ofr =new Offreemploi(res.getInt(1), res.getString(2), res.getString(3),res.getString(4),res.getString(5),res.getString(6), res.getDouble(7));
				ofremplois.add(ofr);
			}
			Connexion.disconnect();
			return ofremplois;
		}
}
