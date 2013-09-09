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
		 	if((usuario.equals("user")) && (password.equals("pass"))) {
		 		return new Usuario(usuario, password);
		 	}
		 	else {
		 		return null;
		 	}
	}

}
