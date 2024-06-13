package ex.vista;

import ex.entidades.Acondicionadora;
import ex.entidades.Aspiradora;
import ex.entidades.Mando;
import ex.entidades.Minicadena;
import ex.entidades.TV;

public class Main {

	public static void main(String[] args) {
		
		Mando[]mandos=new Mando[10];
		
		
		mandos[0]=new Mando("PANZA",12,23,34);
		mandos[1]=new TV("LGTB", 69, 30, 1234, 10, 0);
		mandos[2]=new Minicadena("Mando shico", 10, 5, 6969, 6);
		mandos[3]=new Acondicionadora("Fresco frito", 56, 69, 34, 3, 29);
		mandos[4]=new Aspiradora("Serranito", 69, 20, 57, 0);
		mandos[5]=new Mando("Mula", 965, 1090);
		mandos[6]=new TV("Pisha", 68, 689, 69, 55);
		mandos[7]=new Minicadena("Mandito", 0, 0, 0);
		mandos[8]=new Acondicionadora("Pescao frito con sebolla", 68, 57, 7, 3597);
		mandos[9]=new Aspiradora("Pescaito", 0, 0, 0);
		
		System.out.println("Antes de cambiar");
		
		for(Mando man:mandos) {

			System.out.println(man);
			
			
		}
		
		for(Mando man: mandos) {
			
			
			if(man instanceof TV tele) {
				tele.setCanal(0);
				tele.subirVolumen();
				tele.bajarVolumen();
				tele.encenderMando();
			}
			else if(man instanceof Minicadena mini) {
				mini.subirVolumen();
				mini.bajarVolumen();
			}
			else if(man instanceof Aspiradora aspi) {
				aspi.subirVelocidad();
				aspi.bajarVelocidad();
			}
			else if(man instanceof Acondicionadora aco) {
				aco.cambiaModo();
				aco.setTemperatura(30);
				aco.subirVelocidad();
				aco.bajarVelocidad();
				
			}
			
			
		}
		
		System.out.println("Despues del cambio");

		for(Mando man:mandos) {

			System.out.println(man);
			
			
		}
		
		
		
//		Mando man=new Mando("Mnin", 69, 6969,6996);
//		Mando woman=new Mando("Mina", 6969, 69, 6969);
//		Mando mama=new TV("PN", 56, 5, 13586, 55, 2);
//		Mando ruidoso=new TV("PN", 56, 5, 13586, 9999, 2);
//		man.encenderMando();
//		System.out.println(man);
//		System.out.println(woman);
//		System.out.println(mama);
//		System.out.println(ruidoso);
		
		
	}

}
