package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/choix_role")
public class choix_role extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public choix_role() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		String role = request.getParameter("role");
		if(role.contentEquals("etudiant")) {
			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/inscription_etudiant.jsp").include(request,response);	
		} else if(role.contentEquals("professeur")) {
			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/inscription_prof.jsp").include(request,response);
		}else {
			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/inscri_entreprise.jsp").include(request,response);
		}
	}

}
