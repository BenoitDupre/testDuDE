package fr.benoit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Eleve
 */
//@WebServlet("/Eleve")
public class Eleve extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Eleve() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie gateau=
				new Cookie("Essai","dogetEleve");
				gateau.setMaxAge(999);
				response.addCookie(gateau);

		getServletContext().getRequestDispatcher("/Eleve.jsp").forward(request, response);
//		response.getWriter().append("salut get Eleve ; Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("salut post Eleve; Served at: ").append(request.getContextPath());
////		doGet(request, response);
//	}

	public void doPost(HttpServletRequest requete, HttpServletResponse  reponse)
			throws ServletException, IOException {  
		    reponse.setContentType("text/html");  
			PrintWriter out=reponse.getWriter();  
			out.println("<HTML>");	
			out.println("<HEAD>");
			out.println("<TITLE>Réponse doPost</TITLE>");  
			out.println("</HEAD>");  
			out.println("<BODY>");
			// obtenir la valeur des différents paramètres
			out.println("<TABLE border=1>");
			// lecture cookie
			Cookie[] tabCookies=requete.getCookies();
			  
			if (tabCookies!=null){
			int i=0;
			while (i<tabCookies.length){
			out.println("<TR>"+"Nom du cookie:"+tabCookies[i].getName());  
			out.println("Valeur du cookie:"+tabCookies[i].getValue()+"</TR>");  i++;
			}
			}
			//fin lecture cookie
			out.println("<TR>");  
			out.println("<TD>Nom</TD>");
			out.println("<TD>"+requete.getParameter("tnom")+"</TD>");  
			out.println("</TR>");
			out.println("<TR>");  
			out.println("<TD>Prenom</TD>");
			out.println("<TD>"+requete.getParameter("tprenom")+"</TD>");  
			out.println("</TR>");
			out.println("<TR>");  
			out.println("<TD>Adresse</TD>");
			out.println("<TD>"+requete.getParameter("tadresse")+"</TD>");  
			out.println("</TR>");
			out.println("<TR>");  
			out.println("<TD>Date de Naissance</TD>");
			out.println("<TD>"+requete.getParameter("tnele")+"</TD>");  
			out.println("</TR>");
			out.println("</TABLE>");
			out.println("</HTML>");
			out.println("</BODY>");  
			out.flush();
			out.close();

	}
	
}
