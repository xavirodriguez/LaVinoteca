package com.xavirodriguez.vinoteca.service;

import com.xavirodriguez.vinoteca.to.Usuario;

public class UsuarioServiceImpl implements IUsuarioService{

	@Override
	public void agregarUsuario(Usuario usuario) throws Exception {
		// TO-DO PERSISTIR EN BASE DE DATOS
		System.out.println(usuario.toString());
		
		
	}

	@Override
	public Usuario autenticarUsuario(String usuario, String password)
			throws Exception {
		 	if((usuario == "user") && (password=="pass")) {
		 		return new Usuario(usuario, password);
		 	}
			return null;
	}

}
