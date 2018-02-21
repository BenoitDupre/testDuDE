package fr.benoit.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.parser.Cookie;

/**
 * Servlet implementation class Contact
 */
//@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/Contact.jsp").forward(request, response);
//		response.getWriter().append("salut get Contact ; Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("salut post Contact ; Served at: ").append(request.getContextPath());
////		doGet(request, response);
//	}
	public void doPost(HttpServletRequest requete, HttpServletResponse 	reponse)
			throws ServletException, IOException {
			reponse.setContentType("text/html");  
			PrintWriter out=reponse.getWriter(); 
			out.println("<HTML>");
			out.println("<HEAD>");  
			out.println("<TITLE>Réponse doPost</TITLE>");  
			out.println("</HEAD>");
			out.println("<BODY>"); 


			out.println("<TABLE border=1>");
			out.println("<H1>Information Contact</H1>");
			Enumeration lesParametres= requete.getParameterNames();  
			String nomParametre;
			while (lesParametres.hasMoreElements()){  nomParametre=(String)lesParametres.nextElement();  
			if (!requete.getParameter(nomParametre).isEmpty()) {
			out.println("<TR>");  
			out.println("<TD>"+nomParametre+"</TD>");
			out.println("<TD>"+requete.getParameter(nomParametre)+"</TD>");
			out.println("</TR>");}
			}
			out.println("</TABLE>");
			out.println("</BODY>");
			out.println("</HTML>");  
			out.flush();
			out.close();
	}
//	public void doPost(HttpServletRequest requete, HttpServletResponse  reponse)
//			throws ServletException, IOException {  
//		    reponse.setContentType("text/html");  
//			PrintWriter out=reponse.getWriter();  
//			out.println("<HTML>");	
//			out.println("<HEAD>");
//			out.println("<TITLE>Réponse doPost</TITLE>");  
//			out.println("</HEAD>");  
//			out.println("<BODY>");
//			// obtenir la valeur des différents paramètres
//			out.println("<TABLE border=1>");
//			out.println("<TR>");  
//			out.println("<TD>Nom</TD>");
//			out.println("<TD>"+requete.getParameter("cnom")+"</TD>");  
//			out.println("</TR>");
//			out.println("<TR>");  
//			out.println("<TD>Prenom</TD>");
//			out.println("<TD>"+requete.getParameter("cprenom")+"</TD>");  
//			out.println("</TR>");
//			out.println("<TR>");  
//			out.println("<TD>Adresse</TD>");
//			out.println("<TD>"+requete.getParameter("cadresse")+"</TD>");  
//			out.println("</TR>");
//			out.println("<TR>");  
//			out.println("<TD>Téléphone</TD>");
//			out.println("<TD>"+requete.getParameter("ctel")+"</TD>");  
//			out.println("</TR>");
//			out.println("</TABLE>");
//			out.println("</HTML>");
//			out.println("</BODY>");  
//			out.flush();
//			out.close();
//
//	}
}
