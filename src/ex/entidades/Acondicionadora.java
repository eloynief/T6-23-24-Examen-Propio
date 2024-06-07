package ex.entidades;

import ex.interfaces.Velocidades;

//Clase Acondicionadora
class Acondicionadora extends Mando implements Velocidades {
	private int velocidad;
	private int temperatura;

	// Constructor vacío
	public Acondicionadora() {
	}

	// Constructor con velocidad y temperatura
	public Acondicionadora(int velocidad, int temperatura) {
		this.velocidad = velocidad;
		this.temperatura = temperatura;
	}

	// Constructor con todo + herencia
	public Acondicionadora(String modelo, double altura, double anchura, double precio, int velocidad,
			int temperatura) {
		super(modelo, altura, anchura, precio);
		this.velocidad = velocidad;
		this.temperatura = temperatura;
	}

	// Getters y setters
	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	// Implementación de métodos de Velocidades
	@Override
	public void subirVelocidad() {
		velocidad += 3;
	}

	@Override
	public void bajarVelocidad() {
		velocidad -= 3;
	}
}