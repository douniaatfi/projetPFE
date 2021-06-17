package controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entites.Entreprise;


@WebServlet("/authentification_entrep")
public class authentification_entrep extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public authentification_entrep() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/pages/autentif_entreprise.jsp").include(request, response);	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String login=request.getParameter("login");
         String password=request.getParameter("password");
         Entreprise u=null;
         try {
      	   u = Services.ser_entreprise.authentification(login, password);		
  	} catch (ClassNotFoundException | SQLException e) {
  		// TODO Auto-generated catch block
  		e.printStackTrace();
  	}
         if(u==null) {
        	 System.out.println("page d'inscription");
      	       //response.sendRedirect("http://localhost:8080/Application_web/Authentif_user");
  	} else {
  		System.out.println("page d'acceuil");
  		//HttpSession session=request.getSession();
  		//session.setAttribute("user", u);
      	  
      		// this.getServletContext().getRequestDispatcher("/WEB-INF/pages/professeur.jsp").include(request, response);
      	  	
            }
	}

}
