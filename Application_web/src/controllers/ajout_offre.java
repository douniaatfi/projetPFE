package controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entites.Offreemploi;
import Entites.User;
import Services.ser_emploi;
import Services.ser_publication;

@WebServlet("/ajout_offre")
public class ajout_offre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ajout_offre() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/pages/ajouter_ofr.jsp").include(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int res = 0;
		 
		  HttpSession s=  request.getSession();
		  User u = (User)s.getAttribute("user");
		  int id = u.getIdentreprise();
        System.out.println(u);
		Offreemploi ofr = new Offreemploi(request.getParameter("nom"),request.getParameter("description"),request.getParameter("contrainte"),request.getParameter("typecontrat"),Integer.parseInt(request.getParameter("salaire")));
     try { 
 			res = ser_emploi.ajout_off_emploi(id,ofr);
 		} catch (ClassNotFoundException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
 		 if(res==1) {
 			System.out.println("bien ajouter");
 			
 		 }
 		    else {System.out.println("non ajouter");
 		    	
 		    }

		}

}
