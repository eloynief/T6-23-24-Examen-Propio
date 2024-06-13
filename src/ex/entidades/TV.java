package ex.entidades;

import ex.interfaces.Volumenes;

//Clase TV
public class TV extends Mando implements Volumenes{
	
	/*
	 * atributos
	 */
	
	private int volumen;
	private int canal;

	// Constructor vacío
	public TV() {
	}

	// Constructor con volumen y canal
	public TV(String modelo, double altura, double anchura, int volumen, int canal) {

		super(modelo, altura, anchura);
		
		if (volumen >= 0 && volumen <= 100) {
			this.volumen = volumen;
		}

		if (canal >= 0) {
			this.canal = canal;
		}

	}

	// Constructor con todo + herencia
	public TV(String modelo, double altura, double anchura, double precio, int volumen, int canal) {

		super(modelo, altura, anchura, precio);

		if (volumen >= 0 && volumen <= 100) {
			this.volumen = volumen;
		}

		if (canal >= 0) {
			this.canal = canal;
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

	
	
	
	
	
	
	@Override
	public String toString() {
		String str=super.toString();
		
		str+="Volumen: "+volumen+"\n";
		str+="Canal: "+canal+"\n";
		
		return str;
	}

	public int getCanal() {
		return canal;
	}

	/**
	 * set de canal
	 * 
	 * @param canal
	 */
	public void setCanal(int canal) {
		if (canal >= 0) {
			this.canal = canal;
		}
	}

	// Implementación de métodos de Volumenes
	@Override
	public void subirVolumen() {
		if (volumen + 5 > 100) {
			volumen = 100;
		} else {
			volumen += 5;
		}
	}

	@Override
	public void bajarVolumen() {
		if (volumen - 5 < 0) {
			volumen = 0;
		} else {
			volumen -= 5;
		}
	}

}
