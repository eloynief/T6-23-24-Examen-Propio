package ex.entidades;

import ex.interfaces.Velocidades;

//Clase Aspiradora
public class Aspiradora extends Mando implements Velocidades {
	private int velocidad;

	// Constructor vacío
	public Aspiradora() {
	}

	// Constructor con velocidad
	public Aspiradora(String modelo, double altura, double anchura, int velocidad) {
		super(modelo, altura, anchura);
		this.velocidad = velocidad;
	}

	// Constructor con todo + herencia
	public Aspiradora(String modelo, double altura, double anchura, double precio, int velocidad) {
		super(modelo, altura, anchura, precio);
		this.velocidad = velocidad;
	}

	// Getters y setters
	public int getVelocidad() {
		return velocidad;
	}

//	public void setVelocidad(int velocidad) {
//		this.velocidad = velocidad;
//	}


	@Override
	public String toString() {
		String str=super.toString();
		
		
		str+="Velocidad:" + velocidad +"\n";
		
		
		return str;
	}

	// Implementación de métodos de Velocidades
	@Override
	public void subirVelocidad() {
		if(this.velocidad<5) {
			this.velocidad++;
		}
	}

	@Override
	public void bajarVelocidad() {
		if(this.velocidad>0) {
			velocidad--;
		}
	}
}