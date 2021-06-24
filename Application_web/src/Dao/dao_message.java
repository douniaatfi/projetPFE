package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Entites.Groupe;
import Entites.Message;

public class dao_message {
	public static int ajout_message(Message msg) throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("insert into message(text, date) values ('"+msg.getText()+"',TO_DATE('"+msg.getDate()+"','YYYY-MM-DD')");
    	Connexion.disconnect();
    	return res;
    }
    public static int modif_message() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("");
    	Connexion.disconnect();
    	return res;
    }
    public static int supp_message() throws ClassNotFoundException, SQLException  {
    	Connexion.connect();
    	int res=Connexion.Maj("");
    	Connexion.disconnect();
    	return res;
    }
    public static Message consul_message(int idmsg) throws ClassNotFoundException, SQLException  {
    	Message msg = null;
    	Connexion.connect();
    	ResultSet res=Connexion.Select("select * from message where idmsg="+idmsg);
    	
    	if(res.next()) {
    		msg = new Message(res.getInt(1),res.getNString(2),res.getString(3));
    	}
    	Connexion.disconnect();
    	return msg;
    }
    public  ArrayList<Message> listemessage(int id) throws SQLException, ClassNotFoundException{
		ArrayList<Message> msgs = new ArrayList<Message>();
		Connexion.connect();
		ResultSet res = Connexion.Select("select * from message where type ="+id);
		while(res.next()) {
			Message grp =new Message(res.getInt(1), res.getString(2), res.getString(3));
			   msgs.add(grp);
		}
		Connexion.disconnect();
		return msgs;
	}
}
