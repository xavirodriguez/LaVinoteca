package com.xavirodriguez.vinoteca.controller;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CAgregar
 */
@WebServlet({ "/CAgregar", "/Agregar", "/agregar" })
public class CAgregar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CAgregar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String cantidad = request.getParameter("cantidad");
		HttpSession sesion = request.getSession();
		Map<String,String> carrito;
		
		if (sesion.getAttribute("carrito") != null){
			carrito = (Map<String, String>) sesion.getAttribute("carrito");
			if (carrito.containsKey(id)) {
				carrito.put(id, cantidad);
			}
			else {
				Integer cantidadPrevia = Integer.valueOf(carrito.get(id));
				Integer cantidadActual = Integer.valueOf(cantidad);
				carrito.put(id, cantidadPrevia+cantidadActual);
			}
		}
		else {
			carrito = new LinkedHashMap<String, String>();
			carrito.put(id, cantidad);
			sesion.setAttribute("carrito", carrito);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
