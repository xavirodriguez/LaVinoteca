package com.xavirodriguez.vinoteca.to;

public class Usuario {
	private String email;
	private String password;
	private String nombre;
	private String apellidos;
	private String DNI;
	private String naciento;
	private Integer telefonoFijo;
	private Integer telefonoPrincipal;
	private String direccion;
	private Boolean activo;


	public Usuario(String email, String password) {
		super();
		this.email = email;
		this.setPassword(password);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getNaciento() {
		return naciento;
	}

	public void setNaciento(String naciento) {
		this.naciento = naciento;
	}

	public Integer getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(Integer telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	public Integer getTelefonoPrincipal() {
		return telefonoPrincipal;
	}

	public void setTelefonoPrincipal(Integer telefonoPrincipal) {
		this.telefonoPrincipal = telefonoPrincipal;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
