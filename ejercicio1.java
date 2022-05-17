import java.util.Scanner;

//Ejercicio 1:
//Invertir un matriz de enteros (2 pts)
public class Ejercicio1 {
	//Sección para probar el metodo para invertir una matriz	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroDeElementos;
		System.out.println("Ingrese El Número De Elementos A Enlistar: ");
		numeroDeElementos = sc.nextInt();
		System.out.println("Ingrese los " + numeroDeElementos + " elementos:");
		int matrizPrueba []= new int [numeroDeElementos];
		for (int i = 0; i < numeroDeElementos; i++) {
			matrizPrueba [i]= sc.nextInt(); 
		}
		//Llamando al método para invertir matriz
		matrizPrueba = invertirArray(matrizPrueba);
		
		//mostrarArreglo nuevo con arreglo ForEach
		System.out.println("Matriz Invertida: ");
		for (int lista:matrizPrueba) {
			System.out.println(lista);
		}
		
	}
	//Método para invertir matriz
	public static int [] invertirArray(int[]A){
		int [] Ain= new int[A.length];
		for (int i = 0; i < A.length; i++) {
			Ain [i] = A[A.length-1-i];
		}
		return Ain;
	}
}
