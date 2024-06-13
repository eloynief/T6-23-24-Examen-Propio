package ex.entidades;

import ex.interfaces.Volumenes;

//Clase Minicadena
public class Minicadena extends Mando implements Volumenes{
	
	/*
	 * atributos
	 */
	
	private int volumen;

	// Constructores
	public Minicadena() {
	}

	public Minicadena(String modelo, double altura, double anchura, int volumen) {
		super(modelo, altura, anchura);
		
		if (volumen >= 0 && volumen <= 100) {
			this.volumen = volumen;
		}

	}

	public Minicadena(String modelo, double altura, double anchura, double precio, int volumen) {
		super(modelo, altura, anchura, precio);
		if (volumen >= 0 && volumen <= 100) {
			this.volumen = volumen;
		}

	}

	// Getters y setters
	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		if (volumen >= 0 && volumen <= 100) {
			this.volumen = volumen;
		}

	}

	// Implementación de métodos de Volumenes
	@Override
	public void subirVolumen() {
		if (volumen + 10 > 100) {
			volumen = 100;
		} else {
			volumen += 10;
		}
	}

	@Override
	public void bajarVolumen() {
		if (volumen - 10 < 0) {
			volumen = 0;
		} else {
			volumen -= 10;
		}
	}
}
