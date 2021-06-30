package controllers;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
/**
 * Servlet implementation class uplodimage
 */
@WebServlet("/uplodimage")
public class uplodimage extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 private final String UPLOAD_DIRECTORY = "C:\\Users\\Dounia\\eclipse-workspace\\Application_web\\WebContent\\image";
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public uplodimage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
		 String urls_img = "";
		 
		if(ServletFileUpload.isMultipartContent(request)){
            try {
                List<FileItem> multiparts = new ServletFileUpload(
                                         new DiskFileItemFactory()).parseRequest(request);
                for(FileItem item : multiparts){
                    /*if(!item.isFormField()){
                        File fileSaveDir = new File(UPLOAD_DIRECTORY);
                        if (!fileSaveDir.exists()) {
                            fileSaveDir.mkdir();
                        } }*/                   	
                	 String Tab[] = {"bmp","tiff","jpeg","gif","png","jpg"};
                     String name = new File(item.getName()).getName();
                     System.out.println(name);
                     String extension = name.split("\\.")[1];
                    for (int i = 0; i < Tab.length; i++) {						
                 	if(extension.toLowerCase().equals(Tab[i]) ) {
                 		String nom_img = "annonce"+System.currentTimeMillis()+"."+extension;
                 	     urls_img += nom_img+"*";
                 	    System.out.println(nom_img);
                         item.write( new File(UPLOAD_DIRECTORY + File.separator +nom_img));
                            }
						}
                   
                }
            } catch (Exception e) {
                // exception handling
            }

            out.print(urls_img);
        }
		else {
			out.print("Non");
		}
	}

}
