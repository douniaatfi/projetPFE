package Services;

import java.sql.SQLException;
import java.util.ArrayList;

import Dao.dao_offre_emploi;
import Entites.Offre;
import Entites.Offreemploi;

public class ser_emploi {

	 public static int ajout_off_emploi( int id,Offreemploi ofr) throws ClassNotFoundException, SQLException {
		 return dao_offre_emploi.ajout_off_emploi(id, ofr);
	 }
	 public static ArrayList<Offreemploi> listeemploi() throws ClassNotFoundException, SQLException{
		 return dao_offre_emploi.listeemploi();
	 }
	  public static int supp_off_emploi(int id) throws ClassNotFoundException, SQLException {
		  return dao_offre_emploi.supp_off_emploi(id);
	  }
}
