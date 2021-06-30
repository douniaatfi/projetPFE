package controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entites.Entreprise;
import Entites.User;

@WebServlet("/authentification_user")

public class authentification_user extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
	public authentification_user() {
	        super();
	        
	    }

	   
		protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
			this.getServletContext().getRequestDispatcher("/pages/autentification.jsp").include(request, response);
	            }
	     protected void doPost(HttpServletRequest request ,HttpServletResponse response) throws IOException, ServletException {
	       	 String login=request.getParameter("login");
	         String password=request.getParameter("password");
	    	
	    	 String role=null;
	    	      User en =null;
				try {
					role=Services.ser_user.getrole(login,password);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	       
	            try {
					en = Services.ser_user.authentification(login, password);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	   
	         if(en==null) {
	        	 this.getServletContext().getRequestDispatcher("/pages/autentification.jsp").include(request, response);
	  	} else {
	  		HttpSession session=request.getSession();
			session.setAttribute("user", en);
	  		if(role.equals("admin")) {
	  			response.sendRedirect("http://localhost:8080/Application_web/acceuil_admin");
	  		}else if(role.equals("etudiant")) {
	  			response.sendRedirect("http://localhost:8080/Application_web/acceuil_etudiant");
	  		}else if(role.equals("professeur")) {
	  		  	response.sendRedirect("http://localhost:8080/Application_web/acceuil_prof");
	  		}else {
	  			response.sendRedirect("http://localhost:8080/Application_web/acceuil_entreprise");
	  		}
	            }
	  
	       
}
}