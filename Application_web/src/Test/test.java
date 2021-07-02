package Test;

import java.sql.SQLException;
import java.util.ArrayList;



import Dao.dao_etudiant;
import Entites.Etudiant;
import Entites.Message;
import Entites.Offreemploi;
import Services.ser_emploi;
import Services.ser_message;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	
    	
    	ArrayList<Offreemploi> ofrs = ser_emploi.listeemploi();
    	
		for(Offreemploi m:ofrs) {
			System.out.println(m);
		}
	}
    
}
