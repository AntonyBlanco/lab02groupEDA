package Ejercicio4;

import java.util.ArrayList;
public class Main1 {

	public static void main(String[] args) {
		List <Integer>lista = new List<Integer>();
		ArrayList <Integer> vectorPrueba = new ArrayList<Integer>();
		vectorPrueba.add(8);
		vectorPrueba.add(100);
		vectorPrueba.add(1);
		vectorPrueba.add(10);

		System.out.println(lista.isEmpty());
		lista.print();
		lista.add(5);
		lista.add(8);
		lista.add(17);
		lista.add(50);
		lista.add(100);
		System.out.println(lista.isEmpty());
		System.out.println("Se esta ejecutando hasta aqui");
		System.out.println("Número de elementos: " + lista.size());
		System.out.println(lista.indexOff(101));
		//Imprimimos elementos de la lista
		lista.print();
		//imprimimos si los elementos de vector estan incluidos dentro de nuestra lista
		System.out.println("");
		System.out.println("¿Los elementos de vectorPrueba aparecen en la lista?");
		System.out.println(lista.containsCollection(vectorPrueba));
		//cambiar el dato de un nodo
		System.out.println("");
		System.out.println("Reemplazar un dato de una lista");
		lista.set(0, 4);
		lista.print();
		
	}
}
