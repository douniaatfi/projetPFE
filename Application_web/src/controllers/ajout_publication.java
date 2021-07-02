package controllers;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import Entites.Publication;
import Entites.User;
import Services.ser_publication;

import javax.servlet.annotation.WebInitParam;



@WebServlet(urlPatterns="/ajout_publication",initParams = @WebInitParam( name = "location", value = "C:\\Users\\Dounia\\eclipse-workspace\\Application_web\\WebContent\\image" ))
@MultipartConfig( location ="C:\\image" , maxFileSize = 10 * 1024 * 1024, maxRequestSize = 5 * 10 * 1024 * 1024, fileSizeThreshold = 1024 * 1024 )
public class ajout_publication extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final int TAILLE_TAMPON = 10240;
	
    public ajout_publication() {
        super();
        }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
}

	
	 @Override
	    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     int res=0;
	     HttpSession s=  req.getSession();
		  User u = (User)s.getAttribute("user");
		  int id = u.getIdentreprise();
		 String text = req.getParameter("caption");  
		 Part part = req.getPart("img");
	        String file_name = getFileName(part);
	        String location = this.getServletConfig().getInitParameter("location");
	        if ( file_name != null && !file_name.isEmpty() ) {
	            String name = part.getName();
	            file_name = file_name.substring( file_name.lastIndexOf( '/' ) + 1 )
	                    .substring( file_name.lastIndexOf( '\\' ) + 1 );
	            Publication pu = new Publication(text,file_name);
	            try {
					res = ser_publication.ser_ajout_pub(u.getId(), pu);
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	            
	            
	            writeImage(part,location,file_name);
	           
	        }
	        req.getRequestDispatcher("index.jsp").forward(req,resp);
	    }

	    private static String getFileName( Part part ) {
	        for ( String contentDisposition : part.getHeader( "content-disposition" ).split( ";" ) ) {
	            if ( contentDisposition.trim().startsWith( "filename" ) ) {
	                return contentDisposition.substring( contentDisposition.indexOf( '=' ) + 1 )
	                        .trim()
	                        .replace( "\"", "" );
	            }
	        }
	        return null;
	    }
	   


	    void writeImage(Part part, String location, String file_name) throws IOException {
	        BufferedInputStream entree = null;
	        BufferedOutputStream sortie = null;
	        try {
	            entree = new BufferedInputStream( part.getInputStream(), TAILLE_TAMPON );
	            sortie = new BufferedOutputStream( new FileOutputStream( new File( location + file_name ) ),
	                    TAILLE_TAMPON );

	            byte[] tampon = new byte[TAILLE_TAMPON];
	            int longueur;
	            while ( ( longueur = entree.read( tampon ) ) > 0 ) {
	                sortie.write( tampon, 0, longueur );
	            }
	        } finally {
	            try {
	                sortie.close();
	            } catch ( IOException ignore ) {
	            }
	            try {
	                entree.close();
	            } catch ( IOException ignore ) {
	            }
	        }
	        
	    }
	}