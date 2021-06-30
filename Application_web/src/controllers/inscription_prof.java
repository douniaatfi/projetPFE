package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entites.Professeur;
import Services.ser_etudiant;
import Services.ser_professeur;


@WebServlet("/inscription_prof")
public class inscription_prof extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public inscription_prof() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/pages/inscription_prof.jsp").include(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int res = 0;
		Professeur p = new Professeur (request.getParameter("nom"),request.getParameter("prenom"),request.getParameter("login"),request.getParameter("password"),request.getParameter("date_naissance") ,request.getParameter("adresse"),request.getParameter("cin"));
	    try {
		  res=ser_professeur.AjouterProfesseur(p);
		  
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    if(res==1) {response.sendRedirect("http://localhost:8080/Application_web/authentification_user"); }
	    else {response.sendRedirect("http://localhost:8080/Application_web/inscription_prof");}
	    
	}

}
