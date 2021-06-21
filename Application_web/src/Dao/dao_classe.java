package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entites.Classe;


public class dao_classe {
           
	public static int ajout_groupe(Classe c) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("insert into groupe(nom,photogr,description,type)values('"+c.getNom()+"','"+c.getPhotogr()+"','"+c.getDescription()+"','club')");
    	Connexion.disconnect();
    	return res;
    }
    public static int modif_groupe(Classe c) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("update groupe set nom='"+c.getNom()+"'photogr='"+c.getPhotogr()+"'description='"+c.getDescription()+"'");
    	Connexion.disconnect();
    	return res;
    }
    public static int supp_groupe(Classe c) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("delete from groupe where id="+c.getIdclasse());
    	Connexion.disconnect();
    	return res;
    }
    public static Classe consul_groupe(Classe cl) throws ClassNotFoundException, SQLException  {
    	Classe c = null;
    	Connexion.connect();
    	ResultSet res=Connexion.Select("select * from groupe where id="+cl .getIdclasse());
    	if(res.next()) {
    	 c = new Classe (res.getInt(1),res.getString(2),res.getString(3),res.getNString(4));	
    	}
    	Connexion.disconnect();
    	return c;
    }
    
    public  ArrayList<Classe> listeprof() throws SQLException, ClassNotFoundException{
		ArrayList<Classe> classes = new ArrayList<Classe>();
		Connexion.connect();
		ResultSet res = Connexion.Select("select * from groupe where type ='club'");
		while(res.next()) {
			Classe c =new Classe(res.getInt(1), res.getString(2), res.getString(3),res.getString(4));
			classes.add(c);
		}
		Connexion.disconnect();
		return classes;
	}
}
