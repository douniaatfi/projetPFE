package Services;

import java.sql.SQLException;
import java.util.ArrayList;

import Dao.dao_message;
import Entites.Message;

public class ser_message {

	public static int ajout_message( int idr,int ide,String text) throws ClassNotFoundException, SQLException {
		return dao_message.ajout_message(idr,ide, text);
		
	}
	  public static  ArrayList<Message> consul_message(int iden,int idre) throws ClassNotFoundException, SQLException{
		  return dao_message.consul_message(iden, idre);
	  }
}
