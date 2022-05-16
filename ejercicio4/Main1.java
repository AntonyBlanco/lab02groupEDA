package Ejercicio4;

import java.util.Collection;

public class Main1 {
	private static Collection<Integer> collection1;

	public static void main(String[] args) {
		List <Integer>lista = new List<Integer>();

		System.out.println(lista.isEmpty());
		lista.print();
		lista.add(5);
		lista.add(8);
		lista.add(17);
		lista.add(50);
		System.out.println(lista.isEmpty());
		System.out.println("Se esta ejecutando hasta aqui");
		System.out.println("numero de elementos: " + lista.size());
		
		lista.print();
	}
}
