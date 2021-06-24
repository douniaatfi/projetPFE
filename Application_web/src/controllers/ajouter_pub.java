package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entites.Etudiant;
import Entites.Publication;
import Services.ser_publication;


@WebServlet("/ajouter_pub")
public class ajouter_pub extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ajouter_pub() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/pages/ajouter_pub.jsp").include(request, response);	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int res = 0 ;
		PrintWriter out=response.getWriter();
		Publication pub = new Publication(request.getParameter("Caption"));
	  
		try {
			res = ser_publication.ser_ajout_pub(pub);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 if(res==1) {System.out.println("bien ajouter");
			 //response.sendRedirect("http://localhost:8080/Application_web/authentification_user");
			
		 }
		    else {System.out.println("non ajouter");
		    	//response.sendRedirect("http://localhost:8080/Application_web/inscription_etudiant");}
	}
	}
}
