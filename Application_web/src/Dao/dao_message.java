package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Entites.Message;

public class dao_message {
	public static int ajout_message( int idr,int ide,String text) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("insert into message(idr,ide,text) values ("+idr+","+ide+",'"+text+"')");
    	Connexion.disconnect();
    	return res;
    }
	
    public static  ArrayList<Message> consul_message(int ide,int idr) throws ClassNotFoundException, SQLException  {
    	ArrayList<Message> msgs = new ArrayList<Message>();
    	Connexion.connect();
    	ResultSet res=Connexion.Select("select * from message where ide in ("+ide+","+idr+") and idr in ("+idr+","+ide+")");
    	
    	while(res.next()) {
    	Message	msg = new Message(res.getInt(1),res.getInt(3),res.getInt(2),res.getString(4),res.getString(5));
    	msgs.add(msg);
    	}
    	Connexion.disconnect();
    	return msgs;
    }
    public  ArrayList<Message> listemessage(int id) throws SQLException, ClassNotFoundException{
		ArrayList<Message> msgs = new ArrayList<Message>();
		Connexion.connect();
		ResultSet res = Connexion.Select("select * from message where Id ="+id);
		while(res.next()) {
			Message grp =new Message(res.getInt(1), res.getInt(2), res.getString(3), res.getString(4));
			   msgs.add(grp);
		}
		Connexion.disconnect();
		return msgs;
	}
}
