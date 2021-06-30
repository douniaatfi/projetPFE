package Services;

import java.sql.SQLException;

import Dao.dao_entreprise;

import Entites.Entreprise;

public class ser_entreprise {
       
	public static int AjouterEntreprise(Entreprise e) throws ClassNotFoundException, SQLException {
		return dao_entreprise.AjouterEntreprise(e);
	}
	
	
}
