package Ejercicio4;

import java.util.Collection;

public class List <T> {
	
	private Node<T> root=null;//Referencia al nodo inicial
	private Node<T> last=null;//Referencia al nodo final
	private int size=0;
	
	//Implementando metodo add de tipo boolean
	public boolean add (T elemento) {
		Node nuevoElemento = new Node<T>(elemento);
		if (this.isEmpty()) {
			this.root=nuevoElemento;
			this.last=nuevoElemento;
		}else {
			this.last.nextNode=nuevoElemento;
			this.last=this.last.nextNode;
		}
		size++;
		return true;
	}
	
	//Metodo para agregar boolean
	public boolean addAll (int index, Collection<? extends T> c) {
		return true;
	}
	
	//Metodo containAll
	public boolean containsCollection() {
		return true;
	}
	
	//Funcion para saber el tamaño
	public int size() {
		return this.size;
	}
	
	//funcion adicional
	public boolean isEmpty() {
		if (root==null) {
			return true;
		}else
		return false;
	}
	
	//funcion utilitaria para imprimir la lista 
	public void print() {
		Node<T> iter = new Node<>();
		iter = this.root;
		while(iter != null) {
			System.out.print(iter.data + "->");
			iter = iter.nextNode;
		}		
	}
}
