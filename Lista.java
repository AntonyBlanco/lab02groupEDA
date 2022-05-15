import java.util.List;

public class Lista {
	private T[] arrContent;
	private size = 0;

	public Lista(){
		arrContent = new T[2];
	}

	public void add(int index, T element){
		if(size > index)
			return; // Termina ejecucion si index es mayor que el tamano de la lista
		
		if(arrConteng.length <= index)
			makeArrContentBigger(); // Hace mas grande el arreglo para colocar elemento nuevo

		if(index == size){
			arrContent[index] = element;
			size++;
			return;
		}
		// else mover los elementos para colocar element en su posicion
		for(int i = size; i > size - index; i++){
			arrContent[i] = arrContent[i - 1];
		}
		arrContent[index] = element;
		size++;
	}
	public void clear(){
	// Elimina todos los elementos de la lista
	// Establece el arreglo a uno vacío de tamaño 2
		this.arrContent = new T[2];
		this.size = 0;
	}
	private void makeArrContentBigger(){
	// Incrementa el tamaño del arreglo al doble
		T[] newArr = new T[arrContent.length * 2];
		for(int i = 0; i < arrContent; i++){
			newArr[i] = arrContent[i];
		}
	}
	private void makeArrContentSmaller(){
	// Decrementa el tamaño del arreglo a la mitad
		if(arrContent.length <= 2)
			return;
		T[] newArr = new T[arrContent.length / 2];
		for(int i = 0; i < newArr.length; i++){
			newArr[i] = arrContent[i];
		}
	}
}

