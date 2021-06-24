package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import Entites.Groupe;

public class dao_groupe {
	public static int ajout_groupe(Groupe g ,String type) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("insert into groupe(nom,photogr,description,type)values('"+g.getNom()+"','"+g.getPhotogr()+"','"+g.getDescription()+"','"+type+"')");
    	Connexion.disconnect();
    	return res;
    }
    public static int modif_groupe(Groupe g) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("update groupe set nom='"+g.getNom()+"'photogr='"+g.getPhotogr()+"'description='"+g.getDescription()+"'");
    	Connexion.disconnect();
    	return res;
    }
    public static int supp_groupe(Groupe g) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("delete from groupe where id="+g.getIdgroupe());
    	Connexion.disconnect();
    	return res;
    }
    public static Groupe consul_groupe(int idgrp) throws ClassNotFoundException, SQLException  {
    	Groupe g = null;
    	Connexion.connect();
    	ResultSet res=Connexion.Select("select * from groupe where id="+idgrp);
    	if(res.next()) {
    	 g= new Groupe(res.getInt(1),res.getString(2),res.getString(3),res.getString(4));	
    	}
    	Connexion.disconnect();
    	return g;
    }
    public static Groupe recherch_groupe(String nom) throws ClassNotFoundException, SQLException  {
    	Groupe g = null;
    	Connexion.connect();
    	ResultSet res=Connexion.Select("select * from groupe where nom="+nom);
    	if(res.next()) {
    	 g= new Groupe(res.getInt(1),res.getString(2),res.getString(3),res.getString(4));	
    	}
    	Connexion.disconnect();
    	return g;
    }
    public  ArrayList<Groupe> listegroupe(String type) throws SQLException, ClassNotFoundException{
		ArrayList<Groupe> groupes = new ArrayList<Groupe>();
		Connexion.connect();
		ResultSet res = Connexion.Select("select * from groupe where type ='"+type+"'");
		while(res.next()) {
			Groupe grp =new Groupe(res.getInt(1), res.getString(2), res.getString(3),res.getString(4));
			   groupes.add(grp);
		}
		Connexion.disconnect();
		return groupes;
	}
}
