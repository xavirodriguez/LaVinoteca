package com.xavirodriguez.vinoteca.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.html.HTMLDocument.Iterator;

import com.xavirodriguez.vinoteca.service.IUsuarioService;
import com.xavirodriguez.vinoteca.service.UsuarioServiceFactory;
import com.xavirodriguez.vinoteca.to.Usuario;

/**
 * Servlet implementation class CRegistrar
 */
@WebServlet({ "/CRegistrar", "/registrar" })
public class CRegistrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CRegistrar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request = request.getParameter("nombre"); HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request = request.getParameter("nombre"); HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException , IOException {

		//Validaciones
		// TO-DO
		//recorrer request en busca de nulos if null, error
		Enumeration<String> atributos = request.getAttributeNames();
		List<String> iAtributos = null;
		
		while(atributos.hasMoreElements()) {
			String atributo = atributos.nextElement();
			if (request.getParameter(atributo) == null) {
				// ERROR Atributo vacio
			}
		}
		
		// Comprobar que los emails y contraseñas son iguales
		
		String email = request.getParameter("email"); 
		String password = request.getParameter("password");
		String email2 = request.getParameter("email2"); 
		String password2 = request.getParameter("password2"); 
		
		if (email != email2){
			// ERROR Direccion incorrecta
			
		}
		if (password != password2) {
			//ERROR Password incorrecta
		}

		/*
		 * Guardar petición11
		 */
		
		Integer telefonoFijo = null, telefonoPrincipal = null,sexo = null;
		//if (request.getParameter("telefonoFijo") != null)
			telefonoFijo = Integer.valueOf(request.getParameter("telefonoFijo")); 
		//if (request.getParameter("telefono") != null)
			telefonoPrincipal = Integer.valueOf(request.getParameter("telefono"));
		//if (request.getParameter("sexo") != null)
			sexo = Integer.valueOf(request.getParameter("sexo")); 
				 
		String nombre = request.getParameter("nombre");
		String apellidos = request.getParameter("apellidos"); 
		String dni = request.getParameter("dni");
		String direccion = request.getParameter("direccion");
		String ciudad = request.getParameter("ciudad"); 
		String pais = request.getParameter("pais"); 
		Boolean activo = true;
		// Construir nacimiento
		String dia  = request.getParameter("dia");
		String mes = request.getParameter("mes");
		String anho = request.getParameter("anho");
		String naciento = dia + ' ' + mes + ' ' + anho;
	
		
		Usuario usuario;
		
		usuario = new Usuario(
				 email, 
				 password, 
				 nombre,
				 apellidos, 
				 dni,
				 naciento,
				 telefonoFijo, 
				 telefonoPrincipal, 
				 direccion,
				 ciudad, 
				 pais, 
				 sexo, 
				 activo);
		
		IUsuarioService userService = UsuarioServiceFactory.createUsuarioService();
		try {
			userService.agregarUsuario(usuario);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//persistir usuario
		//iniciar sesion
	}

}


	