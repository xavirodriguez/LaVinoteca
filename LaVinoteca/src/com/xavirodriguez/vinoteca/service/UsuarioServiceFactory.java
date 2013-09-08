package com.xavirodriguez.vinoteca.service;

public abstract class UsuarioServiceFactory {
	public static IUsuarioService createUsuarioService() {
	 return new UsuarioServiceImpl();
	}
}
