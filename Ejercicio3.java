import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //Ingresamos la base del trianuglo
        System.out.print("La base es: ");
        int b = sc.nextInt();
        //Creamos un objeto
        Triangulo base = new Triangulo();
        base.trianguloRecursivo(b);
    }
    public void trianguloRecursivo(int base){
    //Procedimiento para imprimir triángulo
    if (base > 0){
        for(int i=0;i<base;i++) {
            System.out.print("*");
         }
        System.out.print("\n");
        trianguloRecursivo(base-1);
        }
     }
}
