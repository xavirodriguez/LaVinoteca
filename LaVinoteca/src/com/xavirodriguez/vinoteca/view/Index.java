package com.xavirodriguez.vinoteca.view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xavirodriguez.vinoteca.util.VinotecaUtil;

/**
 * Servlet implementation class Index
 */
@WebServlet({ "/Index", "/index" })
public class Index extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Index() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setAttribute("masVendido", VinotecaUtil.obtenerMasVendido());
		request.setAttribute("novedades", VinotecaUtil.obtenerNovedades());
		
		getServletContext().getRequestDispatcher("/header.jsp").include(request, response);
		getServletContext().getRequestDispatcher("/main.jsp").include(request, response);
		getServletContext().getRequestDispatcher("/footer.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
