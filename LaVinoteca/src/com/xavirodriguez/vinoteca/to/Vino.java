package com.xavirodriguez.vinoteca.to;

import java.io.Serializable;

public class Vino implements Serializable {

	private static final long serialVersionUID = 9179178583651769795L;
	private Integer id;
	private String nombre;
	private Categoria categoria;
	private Color color;
	private Integer bodega;
	private Integer cosecha;
	private String imagen;
	private String descripcion;
	

	
	public Vino(Integer id, String nombre, Categoria categoria, Color color,
			Integer bodega, Integer cosecha, String imagen, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.categoria = categoria;
		this.color = color;
		this.bodega = bodega;
		this.cosecha = cosecha;
		this.imagen = imagen;
		this.descripcion = descripcion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Integer getBodega() {
		return bodega;
	}
	public void setBodega(Integer bodega) {
		this.bodega = bodega;
	}
	public Integer getCosecha() {
		return cosecha;
	}
	public void setCosecha(Integer cosecha) {
		this.cosecha = cosecha;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public Integer getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}




