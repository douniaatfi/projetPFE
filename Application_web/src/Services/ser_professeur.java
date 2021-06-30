package Services;

import java.sql.SQLException;

import Dao.dao_professeur;
import Entites.Professeur;

public class ser_professeur {
 
	public static int AjouterProfesseur(Professeur p) throws ClassNotFoundException, SQLException {
		return dao_professeur.AjouterProfesseur(p);
	}
}
