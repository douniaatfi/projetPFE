package Test;

import java.sql.SQLException;

import Dao.dao_evenement;
import Entites.Evenement;

public class Tester {
     public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	 Evenement ev = new Evenement("votre premier evenement aujourd'hui","http://facebook.com/fsbm");
		dao_evenement.ajout_evenement(ev);
	}
}
