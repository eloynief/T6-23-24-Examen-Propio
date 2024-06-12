package ex.entidades;

import ex.interfaces.Velocidades;

//Clase Acondicionadora
class Acondicionadora extends Mando implements Velocidades {
	private boolean modo=false;
	private int velocidad=0;
	private int temperatura=24;

	// Constructor vacío
	public Acondicionadora() {
	}

	// Constructor con velocidad y temperatura
	public Acondicionadora(int velocidad, int temperatura,String modo) {
		this.velocidad = velocidad;
		this.temperatura = temperatura;
		
//		if(modo.equalsIgnoreCase("Si")||modo.equalsIgnoreCase("Sí")||modo.equalsIgnoreCase("No")) {
//			this.modo=(modo.equalsIgnoreCase("Si")||modo.equalsIgnoreCase("Sí"))?true:false;
//		}
		
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

	//la velocidad se modifica usando subir bajar
//	public void setVelocidad(int velocidad) {
//		this.velocidad = velocidad;
//	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}
	
	
	public boolean isModo() {
		return modo;
	}
	
	
	
	public void setModo(boolean modo) {
		this.modo = modo;
	}

	
	
	@Override
	public String toString() {
		String str=super.toString();
		
		
		str+="Velocidad:" + velocidad +"\n";
		str+="Temperatura: " + temperatura +"\n";
		str+="Modo: "+ (modo?"Encendido":"Apagado")+"\n";
		
		return str;
	}

	// Implementación de métodos de Velocidades
	@Override
	public void subirVelocidad() {
		if(velocidad+3>5) {
			velocidad=5;
		}
		else {
			velocidad += 3;
		}
	}

	@Override
	public void bajarVelocidad() {
		if(velocidad-3<0) {
			velocidad=0;
		}
		else{
			velocidad -= 3;
		}
	}
}