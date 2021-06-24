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
import Services.ser_etudiant;


@WebServlet("/inscri_etudiant")
public class inscri_etudiant extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public inscri_etudiant() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		boolean res = false;
		PrintWriter out=response.getWriter();
		Etudiant e = new Etudiant (request.getParameter("nom"),request.getParameter("prenom"),request.getParameter("login"),request.getParameter("password"),request.getParameter("date_naissance") ,request.getParameter("adresse"),request.getParameter("cin"),request.getParameter("cne") ,Integer.parseInt(request.getParameter("code_ap")));
	    try {
		  res=ser_etudiant.AjouterEtudiant(e);
		  
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    if(res) {response.sendRedirect("http://localhost:8080/Application_web/authentification_user"); }
	    else {response.sendRedirect("http://localhost:8080/Application_web/inscription_etudiant");}
	    
	
	}

}
