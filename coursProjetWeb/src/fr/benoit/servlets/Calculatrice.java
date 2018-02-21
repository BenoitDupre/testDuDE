package fr.benoit.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculatrice
 */
//@WebServlet("/Calculatrice")
public class Calculatrice extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculatrice() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("converter.jsp").forward(req, resp);
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String celcius = req.getParameter("celcius");
		try {
		float floatCelcius = Float.parseFloat(celcius);
		float result = (floatCelcius * 9/5) + 32;
		System.out.println("result :" + result);
		req.setAttribute("result", result);
		req.getRequestDispatcher("converter.jsp").forward(req, resp);	
		}catch ( Exception e){
			req.setAttribute("result", "mauvaise saisie");
			req.getRequestDispatcher("converter.jsp").forward(req, resp);
			System.out.println("Division par zéro !");

		}
	}


}
