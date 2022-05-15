public class RotacionIzquierda{
	public static void main(String[] args){
		System.out.println(" ---- Rotar arreglo izquierda ---- ");
		int arr[] = {1, 2, 3, 4, 5};

		printArr(arr);
		
		int rotado[] = rotarIzquierdaArray(arr,2);

		printArr(rotado);

	}
	public static int[] rotarIzquierdaArray(int[] A, int d){
	// Metodo para rotar los elementos de un arreglo a la izquierda
		int[] Arotated = new int[A.length];

		int index;
		for(int i = 0; i < A.length; i++){
			index = i + d; // Nueva posicion del elemento
			if(index >= A.length) index -= A.length; // Limitando a index
			Arotated[i] = A[index];
		}
		return Arotated; // Retorna arreglo diferente a A
	}
	public static void printArr(int arr[]){
	// Metodo para imprimir un arreglo de elementos int
		System.out.print("[");
		for(int i = 0; i < arr.length; i++){
			if(i != 0)
				System.out.print(", ");
			System.out.print(arr[i]);
		}
		System.out.print("]");
		System.out.println();
	}
}

