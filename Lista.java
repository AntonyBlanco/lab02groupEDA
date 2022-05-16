import java.util.List;

public class Lista<T> {
	private Object[] arrContent;
	private int size = 0;

	public Lista(){
		arrContent = new Object[2];
	}
	
	public boolean add(T element){
		System.out.println("arrContent.length <= size: " + (arrContent.length <= size));
		if(arrContent.length <= size) // Verifica que el almacenamiento tenga espacio
			makeArrContentBigger();
		arrContent[size] = element;
		size++;
		return true;
	}
	public int size(){
		return this.size;
	}
	public Object get(int index){
		return arrContent[index];
	}

	public void add(int index, T element){
		if(size < index)
			return; // Termina ejecucion si index es mayor que el tamano de la lista
		
		if(arrContent.length <= index)
			makeArrContentBigger(); // Hace mas grande el arreglo para colocar elemento nuevo

		if(index != size){
			// Rotar los elementos para colocar element en su posicion
			for(int i = size; i > size - index; i++)
				arrContent[i] = arrContent[i - 1];
		}
		arrContent[index] = element;
		size++;
	}
	public void clear(){
	// Elimina todos los elementos de la lista
	// Establece el arreglo a uno vacío de tamaño 2
		this.arrContent = new Object[2];
		this.size = 0;
	}
	public boolean equals(Object o){
		if(!(o instanceof Lista))
			return false;
		Lista tmpO = (Lista)o; // Object -> Lista
		if(this.size != tmpO.size())
			return false;
		for(int i = 0; i < this.size; i++){
			if(arrContent[i] != tmpO.get(i))
				return false;
		}
		return true;
	}
	private void makeArrContentBigger(){
	// Incrementa el tamaño del arreglo al doble
		//System.out.println("Making bigger");
		Object[] newArr = new Object[arrContent.length * 2];
		for(int i = 0; i < arrContent.length; i++){
			newArr[i] = arrContent[i];
		}
		this.arrContent = newArr;
	}
	private void makeArrContentSmaller(){
	// Decrementa el tamaño del arreglo a la mitad
		if(arrContent.length <= 2)
			return;
		Object[] newArr = new Object[arrContent.length / 2];
		for(int i = 0; i < newArr.length; i++){
			newArr[i] = arrContent[i];
		}
		this.arrContent = newArr;
	}
}

