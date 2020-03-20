package main.java.presentacion;

import main.java.dominio.persona;

public class claseprincipal {

	public static void main(String[] args) {
		persona p1 = new persona("vicente", "Higuera", 23);
		System.out.println(p1.toString());
	}

}
