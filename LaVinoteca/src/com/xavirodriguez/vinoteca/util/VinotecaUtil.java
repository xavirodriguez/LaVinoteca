package com.xavirodriguez.vinoteca.util;

import java.util.LinkedList;
import java.util.List;

import com.xavirodriguez.vinoteca.to.Categoria;
import com.xavirodriguez.vinoteca.to.Color;
import com.xavirodriguez.vinoteca.to.Vino;

public abstract class VinotecaUtil {

	private static List<Vino> topVentas;
	private static List<Vino> novedades;

	static {
		Vino vino1, vino2, vino3,vino4;
		topVentas = new LinkedList<Vino>();
		novedades = new LinkedList<Vino>();
		
		
		vino1 = new Vino(1,"Pago de Carraovejas", Categoria.CRIANZA, Color.TINTO , 1, 2010, "wine/wine1.jpg", "Las uvas se despalillaron y maceraron posteriormente a temperatura controlada. Se cri� en barricas de roble franc�s y americano durante 12 meses.");
		vino2 = new Vino(2,"Flor de Pingus", Categoria.CRIANZA, Color.TINTO , 1, 2010, "wine/wine2.jpg", "Las uvas se despalillaron y maceraron posteriormente a temperatura controlada durante 20 d�as. Se cri� en barricas nuevas de roble franc�s Allier durante 16 meses.");
		vino3 = new Vino(3,"Leirana Finca Genoveva", Categoria.CRIANZA, Color.BLANCO , 1, 2010, "wine/wine3.jpg","Este vino ha sido premiado en 2013 como el mejor vino blanco de todo el Estado, dejar� sin palabras al que lo pruebe");
		vino4 = new Vino(4,"Pazo de Se�orans Selecci�n de A�ada 2006", Categoria.CRIANZA, Color.BLANCO , 1, 2006, "wine/wine4.jpg","El mosto ferment� a temperatura controlada en dep�sitos de acero inoxidable d�nde se cri�, posteriormente, durante 30 meses en contacto con sus l�as finas. Permaneci� en botella durante 12 meses m�s antes de su comercializaci�n");
		
		topVentas.add(vino4);
		topVentas.add(vino1);
		topVentas.add(vino2);
		novedades.add(vino3);
		novedades.add(vino4);
		
		
	}
	public static List<Vino> obtenerMasVendido(){
		return topVentas;
	}
	public static List<Vino> obtenerNovedades() {
		return novedades;
	}
	
}
