package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entites.Exposer;
import Entites.Offreemploi;

public class dao_exposer {
      
	public static int ajout_groupe(Exposer exp) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("insert into groupe(nom,photogr,description,date_creation,date_expiration, type)values('"+exp.getNom()+"','"+exp.getPhotogr()+"','"+exp.getDescription()+"',TO_DATE('"+exp.getDate_creation()+"','YYYY-MM-DD'),TO_DATE('"+exp.getDescription()+"','YYYY-MM-DD'),'exposer')");
    	Connexion.disconnect();
    	return res;
    }
    public static int modif_groupe(Exposer exp) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("update groupe set nom='"+exp.getNom()+"'photogr='"+exp.getPhotogr()+"'description='"+exp.getDescription()+"'date_creation=TO_DATE('"+exp.getDate_creation()+"','YYYY-MM-DD')date_expiration=TO_DATE('"+exp.getDate_expiration()+"','YYYY-MM-DD')");
    	Connexion.disconnect();
    	return res;
    }
    public static int supp_groupe(Exposer exp) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("delete from groupe where id="+exp.getIdgroupe());
    	Connexion.disconnect();
    	return res;
    }
    public static Exposer  consul_groupe(Exposer exp) throws ClassNotFoundException, SQLException  {
    	Exposer  o = null;
    	Connexion.connect();
    	ResultSet res=Connexion.Select("select * from groupe where id="+exp.getIdgroupe());
    	if(res.next()) {
    	 o= new Exposer(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6));	
    	}
    	Connexion.disconnect();
    	return o;
    }
    public  ArrayList<Exposer> listeprof() throws SQLException, ClassNotFoundException{
		ArrayList<Exposer> exposers = new ArrayList<Exposer>();
		Connexion.connect();
		ResultSet res = Connexion.Select("select * from groupe where type ='exposer'");
		while(res.next()) {
			Exposer exp =new Exposer(res.getInt(1), res.getString(2), res.getString(3),res.getString(4),res.getString(5),res.getString(6));
			   exposers.add(exp);
		}
		Connexion.disconnect();
		return exposers;
	}
}
