package com.xavirodriguez.vinoteca.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xavirodriguez.vinoteca.service.IUsuarioService;
import com.xavirodriguez.vinoteca.service.UsuarioServiceFactory;

/**
 * Servlet implementation class CAuth
 */
@WebServlet("/auth")
public class CAuth extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CAuth() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usuario = request.getParameter("nombre");
		String password = request.getParameter("password");
		
		IUsuarioService userService = UsuarioServiceFactory.createUsuarioService();
		try {
			if(userService.autenticarUsuario(usuario, password) != null) {

				getServletContext().getRequestDispatcher("/header.jsp").include(request, response);
				
				getServletContext().getRequestDispatcher("/message.jsp").include(request, response);

				getServletContext().getRequestDispatcher("/main.jsp").include(request, response);
				getServletContext().getRequestDispatcher("/footer.jsp").include(request, response);

			}
		} catch (Exception e) {
			getServletContext().getRequestDispatcher("/footer.jsp").include(request, response);
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
