package fr.benoit.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class test1
 */
@WebServlet("/test1")
public class Session extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Session() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Cookie gateau=
				new Cookie("Essai","testaa");
				gateau.setMaxAge(999);
				response.addCookie(gateau);
//				PrintWriter out=response.getWriter();
//				Cookie[] tabCookies=request.getCookies();
//				if (tabCookies!=null){
//				int i=0;
//				while (i<tabCookies.length){
//				out.println("Nom du cookie:"+tabCookies[i].getName());  
//				out.println("Valeur du cookie:"+tabCookies[i].getValue());  i++;
//				}
//				}


		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie[] tabCookies=request.getCookies();
		PrintWriter out=response.getWriter();  
		if (tabCookies!=null){
		int i=0;
		while (i<tabCookies.length){
		out.println("Nom du cookie:"+tabCookies[i].getName());  
		out.println("Valeur du cookie:"+tabCookies[i].getValue());  i++;
		}
		}

		doGet(request, response);
	}

}
