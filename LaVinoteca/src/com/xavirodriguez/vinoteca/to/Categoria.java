package com.xavirodriguez.vinoteca.to;

public enum Categoria {
	COSECHA("Cosecha", 1),
	CRIANZA("Crianza", 2), 
	RESERVA("Reserva", 3),
	GRAN_RESERVA("Gran Reserva", 4);
	
	private String nombre;
	private int posicion;

	private Categoria(String nombre, int posicion) {
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