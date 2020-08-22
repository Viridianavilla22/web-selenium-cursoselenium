package com.javabasic;

public class ArrayStatement {
	public static void main(String[] args) {
		String[] nombres = new String[3];
		nombres[0] = "Ricardo";
		nombres[1] = "Juan";
		nombres[2] = "Ivan";

		System.out.println(nombres[2]);
		getNombreRol(nombres);
	}
	
public static void getNombreRol(String[]nombres)
{
	System.out.println("El nombre es:"+nombres[1]);
}
	
}

