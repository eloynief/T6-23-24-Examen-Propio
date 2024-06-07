package ex.entidades;

import ex.interfaces.Velocidades;

//Clase Aspiradora
class Aspiradora extends Mando implements Velocidades {
	private int velocidad;

	// Constructor vacío
	public Aspiradora() {
	}

	// Constructor con velocidad
	public Aspiradora(int velocidad) {
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

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	// Implementación de métodos de Velocidades
	@Override
	public void subirVelocidad() {
		velocidad++;
	}

	@Override
	public void bajarVelocidad() {
		velocidad--;
	}
}