package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/choix_inscription")
public class choix_inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public choix_inscription() {
        super();
        
    }
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String rol=req.getParameter("rol");
		
		if(req.equals("etudiant")) {
			res.sendRedirect("http://localhost:8080/Application_web/inscri_etudiant");
		}else if(req.equals("professeur")) {
			res.sendRedirect("http://localhost:8080/Application_web/");
		}else if(req.equals("admin")) {
			res.sendRedirect("http://localhost:8080/Application_web/");
		}else {
			res.sendRedirect("http://localhost:8080/Application_web/inscription_entreprise");
		}
	}
}
