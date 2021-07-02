package Services;

import java.sql.SQLException;
import java.util.ArrayList;

import Dao.dao_etudiant;
import Entites.Etudiant;


public class ser_etudiant {

	public static boolean AjouterEtudiant(Etudiant u) throws ClassNotFoundException, SQLException {
	      if(dao_etudiant.etudiantExist(u.getLogin())==false) {
	    	    dao_etudiant.AjouterEtudiant(u);
	    	  return true ;
	      }
		return false;
	}
	
	 public static ArrayList<Etudiant> listeetudiant() throws ClassNotFoundException, SQLException{
		 return dao_etudiant.listeetudiant();
	 }
}
