package com.javabasic;

public class ConditionalsStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int velocidad = 40;
		int limiteVelocidad = 70;

//		if (velocidad > limiteVelocidad) {
//			System.out.println("Multa");
//
//		}
//		
//		
//		if (velocidad > limiteVelocidad) {
//			System.out.println("Multa");
//		} else {
//			System.out.println("velocidad adecuada");
//		}
//		

//		boolean highway = true;
//		if (highway == true) {
//			System.out.println("vamos en la highway");
//
//			limiteVelocidad = 100;
//
//			if (velocidad > limiteVelocidad) {
//				System.out.println("multa");
//			} else {
//				System.out.println("velocidad adecuada");
//			}
//
//		}
		
		
		int temperatura=10;
		switch(temperatura) {
		case 10:
			System.out.println("Frio");
			break;
		case 20:
			System.out.println("Agradable");
			break;
		case 30:
			System.out.println("Calor");
			break;
		case 40:
			System.out.println("Estamos en el desierto");
			break;
			default:
				System.out.println("Da igual");
				break;
				
		}
		
	}
}


