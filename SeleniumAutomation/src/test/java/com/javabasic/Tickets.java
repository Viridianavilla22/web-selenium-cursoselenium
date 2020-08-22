package com.javabasic;

public class Tickets {

	int precioAdulto, edad;
	double precioNi�o, precioEstudiante;
	boolean estudiante = false;
	String costo;

	// constructor de la clase
	public Tickets(int precioNormal, int edadPersona, boolean credencialEstudiante) {

		precioAdulto = precioNormal;
		precioNi�o = precioNormal * (.85);
		precioEstudiante = precioNormal * (.5);
		costo = "Precio Normal";
		edad = edadPersona;
		estudiante = credencialEstudiante;
	}

	public Tickets(int precioNormal, int edadPersona, boolean credencialEstudiante,int descuentoAdicional) {

		precioAdulto = precioNormal-descuentoAdicional;
		precioNi�o = (precioNormal * (.85))-descuentoAdicional;
		precioEstudiante = (precioNormal * (.5))-descuentoAdicional;
		costo = "Precio Normal";
		edad = edadPersona;
		estudiante = credencialEstudiante;
	}

//	***************************METHODS**********************************
	public void costoDia() {
		System.out.println("El costo del Ticket :" + costo);

	}

	public void precioAdulto() {
		System.out.println("Ticket Adutlo:" + precioAdulto);

	}

	public void precioNi�o() {
		System.out.println("Ticket Ni�o :" + precioNi�o);

	}

	public void precioEstudiante() {
		System.out.println("Ticket Estudiante:" + precioEstudiante);

	}

	public void verificarCostoTicket() {
		if (estudiante = true) {
			System.out.println("Eres un ESTUDIANTE el precio de tu ticket es:" + precioEstudiante);

		} else if (edad > 18) {
			System.out.println("Eres un ADULTO el precio de tu Ticket es :" + precioAdulto);
		} else {
			System.out.println("Eres un NI�O el precio de tu ticket es : " + precioNi�o);
		}
	}

//	***************************OVERLOAD*********************************
	public double sumarTiket() {
		double suma = precioAdulto + precioNi�o;
		System.out.println("La suma es " + suma);
		return suma;

	}

	public double sumarTiket(int descuento) {
		double suma = (precioAdulto + precioNi�o) - descuento;
		System.out.println("La suma con descuento es " + suma);
		return suma;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tickets boleto = new Tickets(100, 20, true);
		boleto.costoDia();
		boleto.precioAdulto();
		boleto.precioNi�o();
		boleto.precioEstudiante();
		boleto.verificarCostoTicket();

		boleto.sumarTiket();
		boleto.sumarTiket(10);
		
		System.out.println("--------------------------------");
		
		Tickets boletoConDescuento=new Tickets(100, 20, true, 10);
		
		boletoConDescuento.costoDia();
		boletoConDescuento.precioAdulto();
		boletoConDescuento.precioNi�o();
		boletoConDescuento.precioEstudiante();
		boletoConDescuento.verificarCostoTicket();

		boletoConDescuento.sumarTiket();
		boletoConDescuento.sumarTiket(10);

	}

}
