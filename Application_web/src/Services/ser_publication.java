package Services;

import java.sql.SQLException;
import Dao.dao_pub;

public class ser_publication {

	public static int ser_ajout_pub(int id,String text) throws ClassNotFoundException, SQLException  {
    	
    	return dao_pub.ajout_pub(id,text);
    }
}
