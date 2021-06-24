package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entites.Grp_Exposer;
import Entites.Offreemploi;

public class dao_exposer {
      
	public static int ajout_groupe(Grp_Exposer exp) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("insert into groupe(nom,photogr,description,date_creation,date_expiration, type)values('"+exp.getNom()+"','"+exp.getPhotogr()+"','"+exp.getDescription()+"',TO_DATE('"+exp.getDate_creation()+"','YYYY-MM-DD'),TO_DATE('"+exp.getDescription()+"','YYYY-MM-DD'),'exposer')");
    	Connexion.disconnect();
    	return res;
    }
    public static int modif_groupe(Grp_Exposer exp) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("update groupe set nom='"+exp.getNom()+"'photogr='"+exp.getPhotogr()+"'description='"+exp.getDescription()+"'date_creation=TO_DATE('"+exp.getDate_creation()+"','YYYY-MM-DD')date_expiration=TO_DATE('"+exp.getDate_expiration()+"','YYYY-MM-DD')");
    	Connexion.disconnect();
    	return res;
    }
    public static int supp_groupe(Grp_Exposer exp) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("delete from groupe where id="+exp.getIdgroupe());
    	Connexion.disconnect();
    	return res;
    }
    public static Grp_Exposer  consul_groupe(Grp_Exposer exp) throws ClassNotFoundException, SQLException  {
    	Grp_Exposer  o = null;
    	Connexion.connect();
    	ResultSet res=Connexion.Select("select * from groupe where id="+exp.getIdgroupe());
    	if(res.next()) {
    	 o= new Grp_Exposer(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6));	
    	}
    	Connexion.disconnect();
    	return o;
    }
    public  ArrayList<Grp_Exposer> listeprof() throws SQLException, ClassNotFoundException{
		ArrayList<Grp_Exposer> exposers = new ArrayList<Grp_Exposer>();
		Connexion.connect();
		ResultSet res = Connexion.Select("select * from groupe where type ='exposer'");
		while(res.next()) {
			Grp_Exposer exp =new Grp_Exposer(res.getInt(1), res.getString(2), res.getString(3),res.getString(4),res.getString(5),res.getString(6));
			   exposers.add(exp);
		}
		Connexion.disconnect();
		return exposers;
	}
}
