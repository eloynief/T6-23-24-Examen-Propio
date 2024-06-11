package ex.entidades;

//Clase Mando
class Mando implements Comparable<Mando>{
	private String modelo="";
	private double altura=0;
	private double anchura=0;
	private double precio=0;
	private boolean boton=false;

	// Constructor vacío
	public Mando() {
	}

	// Constructor con modelo, altura y anchura
	public Mando(String modelo, double altura, double anchura) {
		this.modelo = modelo;
		this.altura = altura;
		this.anchura = anchura;
		
		
	}

	// Constructor con todo
	public Mando(String modelo, double altura, double anchura, double precio) {
		
		if(modelo!=null&&!modelo.equals("")) {
			this.modelo = modelo;
		}

		if (altura>=0) {
			this.altura = altura;
		}
		
		if (anchura>=0) {
			this.anchura = anchura;
		}
		
		if (precio>=0) {
			this.precio = precio;
		}
		
	}

	// Getters y setters
	public String getModelo() {
		return modelo;
	}

	public double getAltura() {
		return altura;
	}

	public double getAnchura() {
		return anchura;
	}

	public double getPrecio() {
		return precio;
	}

	//setters (solo hay de precio porque no tiene sentido modificar los demas datos)
	
	/**
	 * set de precio
	 * @param precio
	 */
	public void setPrecio(double precio) {
		if (precio>=0) {
			this.precio = precio;
		}
	}

	
	
	
	
	
	
	public boolean isBoton() {
		return boton;
	}

//	public void setBoton(String boton) {
//
//		//lo he hecho asi se que puedo hacerlo de otra forma no me mates elena
//		//podria hacer otro caso para el no pero he pensado en hacerlo de esta manera
//		//y que si la opcion no es si entonces es false
//		
//		if(boton.equalsIgnoreCase("Si")||boton.equalsIgnoreCase("Sí")||boton.equalsIgnoreCase("No")) {
//			this.boton=(boton.equalsIgnoreCase("Si")||boton.equalsIgnoreCase("Sí"))?true:false;
//		}
//	}

	@Override
	public String toString() {
		String str="";
		
		str+="Modelo:" + modelo +"\n";
		str+="Altura: " + altura + "\n";
		str+="Anchura: "+anchura+"\n";
		str+="Precio: " + precio + "\n";
		str+="Estado: "+(boton?"Encendido":"Apagado")+"\n";
		return str;
	}
	
	
	@Override
	public int compareTo(Mando o) {
		int num=0;
		
		//llamamos al compare to del otro
		num=this.modelo.compareTo(o.modelo);
		
//		if(this.modelo < per.modelo){
//			num = -1;
//		} else if(this.edad>per.edad){
//			num = 1;
//		}

		
		return num;
	}
	
	
	
	public void encenderMando() {
		this.boton=true;
	}
	
	
	public void apagarMando() {
		this.boton=false;
	}
	
	

}
