package com.xavirodriguez.vinoteca.to;

public enum Color {
	TINTO("Tinto", 1),
	BLANCO("Blanco",2),
	ROSADO("Rosado",3);
	
	private String nombre;
	private int posicion;

	private Color(String nombre, int posicion) {
		this.nombre = nombre;
		this.posicion = posicion;
	}

	public String getNombre() {
		return nombre;
	}

	public int getPosicion() {
		return posicion;
	}

	public String toString() {
		return "(nombre: " + nombre + ", posicion: " + posicion + ")";
	}
}