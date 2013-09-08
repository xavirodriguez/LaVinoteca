package com.xavirodriguez.vinoteca.service;

import com.xavirodriguez.vinoteca.to.Usuario;

public interface IUsuarioService {
	public void agregarUsuario(Usuario usuario) throws Exception;
	public Usuario autenticarUsuario(String usuario, String password) throws Exception;
}


