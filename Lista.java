import java.util.List;

public class Lista {
	private T[] arrContent;
	private size = 0;

	public Lista(){
		arrContent = new T[2];
	}

	public void add(int index, T element){
		if(index == size){
			if(arrContent.length <= index)
				makeArrContentBigger();
			arrContent[index] = element;
			size++;
			return;
		}
		// else
		for(int i=0){
			
		}
	}
	public void clear(){
	// Elimina todos los elementos de la lista
	// Establece el arreglo a uno vacío de tamaño 2
		this.arrContent = new T[2];
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

