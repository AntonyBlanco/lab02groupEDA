package Ejercicio4;

public class List <T> {
	
	private Node<T> root;
	private int size=0;
	
	public List() {
		this.root = null;
		this.size = size;
	}

	public boolean add (T elemento) {
		Node nuevoElmento = new Node<T>(elemento, root);
		root=nuevoElmento;
		size++;
		return true;
	}
	public int size() {
		return this.size;
	}
	
}
