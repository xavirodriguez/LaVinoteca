package com.xavirodriguez.vinoteca.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xavirodriguez.vinoteca.service.IUsuarioService;
import com.xavirodriguez.vinoteca.service.UsuarioServiceFactory;
import com.xavirodriguez.vinoteca.util.VinotecaUtil;

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
		String usuario = request.getParameter("usuario");
		String password = request.getParameter("password");
		
		IUsuarioService userService = UsuarioServiceFactory.createUsuarioService();

			try {
				if(userService.autenticarUsuario(usuario, password) != null) {
					// Crear sesion
					HttpSession sesion = request.getSession();
					sesion.setAttribute("autenticado", "true");	
					
					//Devolver mensaje de éxito
					request.setAttribute("mensaje", "Bienvenido");
					request.setAttribute("color", "verde");	
					request.setAttribute("masVendido", VinotecaUtil.obtenerMasVendido());
					request.setAttribute("novedades", VinotecaUtil.obtenerNovedades());
				
					getServletContext().getRequestDispatcher("/header.jsp").include(request, response);
					getServletContext().getRequestDispatcher("/message.jsp").include(request, response);
					getServletContext().getRequestDispatcher("/main.jsp").include(request, response);
					getServletContext().getRequestDispatcher("/footer.jsp").include(request, response);

					}
				else {
					request.setAttribute("mensaje", "Usuario: "+usuario+ " y contraseña: "+password+" incorrectos"+userService.autenticarUsuario(usuario, password));
					request.setAttribute("color", "rojo");	
					getServletContext().getRequestDispatcher("/header.jsp").include(request, response);
					getServletContext().getRequestDispatcher("/message.jsp").include(request, response);
					getServletContext().getRequestDispatcher("/main.jsp").include(request, response);
					getServletContext().getRequestDispatcher("/footer.jsp").include(request, response);
				}
			} catch (Exception e) {
				request.setAttribute("mensaje", e.getStackTrace());
				request.setAttribute("color", "rojo");	
				getServletContext().getRequestDispatcher("/header.jsp").include(request, response);
				getServletContext().getRequestDispatcher("/message.jsp").include(request, response);
				getServletContext().getRequestDispatcher("/main.jsp").include(request, response);
				getServletContext().getRequestDispatcher("/footer.jsp").include(request, response);
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

}
