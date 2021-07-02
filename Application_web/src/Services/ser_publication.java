package Services;

import java.sql.SQLException;
import Dao.dao_pub;
import Entites.Publication;

public class ser_publication {

	public static int ser_ajout_pub(int id,Publication pu) throws ClassNotFoundException, SQLException  {
    	
    	return dao_pub.ajout_pub(id,pu);
    }
}
