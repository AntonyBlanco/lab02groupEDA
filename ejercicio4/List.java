package Ejercicio4;

import java.util.Collection;

public class List <T> {
	
	private Node<T> root=null;//Referencia al nodo inicial
	private Node<T> last=null;//Referencia al nodo final
	private int size=0; //tamaño inicial de lista
	
	//Implementando metodo add de tipo boolean
	public boolean add (T elemento) {
		Node nuevoElemento = new Node<T>(elemento);
		if (this.isEmpty()) {//agregar elemento si la lsita esta vacia
			this.root=nuevoElemento;
			this.last=nuevoElemento;
		}else {//agregar elemento nuevo si la lsita ya tiene elementos
			this.last.nextNode=nuevoElemento;
			this.last=this.last.nextNode;
		}
		size++;
		return true;
	}
	
	//Metodo para agregar una colecion dentro de una lista dado un indice
	public boolean addAll (int index, Collection<? extends T> coleccion) {
		Node<T> iter = new Node<>(); //nodo para iterar desde root
		Node<T> referenciaNodoPosterior = null;
		iter = this.root;
		int aux =0;
		//extraemos los elementos de la coleccion en un arreglo simple
		Object [] colleccionToArray = coleccion.toArray();
		//T [] nuevo = coleccion.toArray(new T [coleccion.size()]);
		int tamaño = colleccionToArray.length;
		while (iter!=null) {
			if (aux==index) {
				referenciaNodoPosterior=iter.nextNode;
				root.data=(T) colleccionToArray[aux];	
				root.nextNode=referenciaNodoPosterior;
			}else {
				iter = iter.nextNode;
			}
			aux++;
		
		}		
		return true;
	}
	
	//Metodo containAll
	public boolean containsCollection(Collection<T> coleccion) {
		Object [] colleccionToArray = coleccion.toArray();
		T elementoABuscar;
		int aux=0;//contador de elementos de la coleccion que van apareciendo en  la lista
					
		for (int i = 0; i < colleccionToArray.length-1; i++) {
			elementoABuscar = (T) colleccionToArray[i];
			if (this.indexOff(elementoABuscar)!=-1) {
				aux++;
			}else {
				return false;
			}
			if (aux==colleccionToArray.length-1) { //Cuando el auxiliar llegue a el numero de elementos de la colleccion
				return true;						// asumiremos que la lista contienen a todos los elementos de esta
			}
		}
		return false;
	}
	
	//Metodo para devolver el indice de un objeto dado
	public int indexOff(Object o) {
		Node<T> iter = new Node<>();
		int aux= 0;
		iter = this.root;
		while(iter != null) {
			if (iter.data.equals(o)) {
				return aux;
			}else {
				iter = iter.nextNode;
			}
			aux++;
		}	
		return -1;
	}
	
	//Metodo para Remover un elemento con el indice requerido
	public T remove(int index) {
		//Node<T> nodoAEliminar = root;
		Node<T> referenciaNodoPrevio=null;
		Node<T> iter = new Node<>(); //nodo para iterar desde root
		Node<T> referenciaNodoPosterior=null;
		Node<T> referenciaNueva=null;
		iter = this.root;
		int aux = 0;
		if(index==0) {
			this.root= root.nextNode;
			iter=null;
			size--;
		}
		while (iter!=null) {
			if (aux==index-1) {
				referenciaNodoPrevio=iter;
			}
			if (aux==index) {
				referenciaNodoPosterior=iter.nextNode;
			}
			iter = iter.nextNode;
			referenciaNodoPrevio=referenciaNodoPosterior;
			aux++;
			size--;
			
		}
		
		return null;
	}
	
	//Metodo para reemplazar un elemento de un indice dado
	public T set (int index, T elemento) {
		int aux=0;
		Node<T> iter = new Node<>(); //nodo para iterar desde root
		iter = this.root;
		while(iter != null) {
			if (aux==index) {
				iter.data=elemento;
			}
			iter = iter.nextNode;
			aux++;
		}
		return null;
	}
	
	
	//----------------------------------------------------------
	//Funciones adicionales y utiles para el resto de metodos
	//----------------------------------------------------------
	
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

