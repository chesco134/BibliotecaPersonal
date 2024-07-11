package com.java.juli.main;

import com.java.juli.biblioteca.misslibros.Libro;

public class Principal{


	public static void main(String args[]){
		int x = 5;
		int y = 7;
		int z = x + y;
		System.out.printf("Z = %d", z);
		System.out.println("El valor de x es " + x + ", El valor de y es " + y + ", Y el resultado de la suma es: " + z);
	
		Libro libro = new Libro();
		libro.setNombre("Lo que sea");
		libro.setPuntaje_Interes(6);
		libro.setPuntaje_Favorites(7);
		libro.setDescripcion("Tiene lo que sea");

		System.out.println("El nombre del libro es: " + libro.getNombre()\n + " El libro tiene puntaje de: "+ libro.getPuntaje_Favorites()\n + " El interes de leer el libro es de: " + libro.getPuntaje_Interes()\n + " La descripción del libro es: " + libro.getDescripcion());
	
	}
}
