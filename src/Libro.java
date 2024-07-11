package com.java.juli.biblioteca.mislibros;

public class Libro{

	private String nombre;
	private Integer puntaje_interes;
	private Integer puntaje_favorites;
	private String descripcion;


	public String getNombre(){
	
	
		return nombre;
	}

	public void setNombre(String nombre){
	
		this.nombre = nombre;
	}

	public int getPuntaje_Interes(){
	
		return puntaje_interes;
	}

	public void setPuntaje_Interes(int puntaje_interes){
	
		this.puntaje_interes = puntaje_interes;
	}

	public int getPuntaje_Favorites(){
	
		return puntaje_favorites;
	}

	public void setPuntaje_Favorites(int puntaje_favorites){

		this.puntaje_favorites = puntaje_favorites;
	}

	public String getDescripcion(){
	
		return descripcion;
	}

	public void setDescripcion(String descripcion){
	
		this.descripcion = descripcion;
	}
}

