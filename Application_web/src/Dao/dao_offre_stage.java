package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entites.Offrestage;
import Entites.Professeur;

public class dao_offre_stage {
        
	public static int ajout_off_emploi(Offrestage ofr) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("insert into offre(nom, description, date, containt, type) values('"+ofr.getNom()+"','"+ofr.getDescription()+"',TO_DATE('"+ofr.getDate()+"','YYYY-MM-DD'),'"+ofr.getContrainte()+"','stage')");
    	Connexion.disconnect();
    	return res;
    }
    public static int modif_off_emploi(Offrestage ofr) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("update offre set nom ='"+ofr.getNom()+"',description ='"+ofr.getDescription()+"',Date = TO_DATE('"+ofr.getDate()+"','YYYY-MM-DD'),Contrainte ='"+ofr.getContrainte()+"'");
    	Connexion.disconnect();
    	return res;
    }
    public static int supp_off_emploi(Offrestage offre) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("delete from offre where id="+offre.getIdofrstg());
    	Connexion.disconnect();
    	return res;
    }
    public static Offrestage consul_off_emploi(Offrestage offre) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	Offrestage ofr = null;
    	ResultSet res=Connexion.Select("select * from offre where id ="+offre.getIdofrstg());
    	if(res.next()) {
    		ofr= new Offrestage(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5));
    	}
    	Connexion.disconnect();
    	return ofr;
    }
    

    public  ArrayList<Offrestage> listeprof() throws SQLException, ClassNotFoundException{
		ArrayList<Offrestage> ofrstage = new ArrayList<Offrestage>();
		Connexion.connect();
		ResultSet res = Connexion.Select("select * from offre where type='stage'");
		while(res.next()) {
			Offrestage ofr =new Offrestage(res.getInt(1), res.getString(2), res.getString(3),res.getString(4),res.getString(5));
			ofrstage.add(ofr);
		}
		Connexion.disconnect();
		return ofrstage;
	}
}
