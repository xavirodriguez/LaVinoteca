package com.xavirodriguez.vinoteca.to;

public class Usuario {
	private String email;
	private String password;
	private String nombre;
	private String apellidos;
	private String dni;
	private String naciento;
	private Integer telefonoFijo;
	private Integer telefonoPrincipal;
	private String direccion;
	private String ciudad;
	private String pais;
	private Integer sexo;
	private Boolean activo;

	public Usuario(String email, String password) {
		super();
		this.email = email;
		this.setPassword(password);
	}
	
	public Usuario(String email, String password, String nombre,
			String apellidos, String dni, String naciento,
			Integer telefonoFijo, Integer telefonoPrincipal, String direccion,
			String ciudad, String pais, Integer sexo, Boolean activo) {
		super();
		this.email = email;
		this.password = password;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.setDni(dni);
		this.naciento = naciento;
		this.telefonoFijo = telefonoFijo;
		this.telefonoPrincipal = telefonoPrincipal;
		this.direccion = direccion;
		this.ciudad = ciudad;
		this.pais = pais;
		this.sexo = sexo;
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Usuario [email=" + email + ", password=" + password
				+ ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni="
				+ dni + ", naciento=" + naciento + ", telefonoFijo="
				+ telefonoFijo + ", telefonoPrincipal=" + telefonoPrincipal
				+ ", direccion=" + direccion + ", ciudad=" + ciudad + ", pais="
				+ pais + ", sexo=" + sexo + ", activo=" + activo + "]";
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
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

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
}
