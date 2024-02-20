import java.util.Scanner;

public class Ejercicio_1{

public static void main(String[] args) {
    /*1. Dado a un numero n de entrada mostrar sus consecutivos en pantalla.
     ejemplo: si el numero de entrada es 30 mostrar del 1 al 30. */
    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese un numero entero ! ");
    int numeroEntero = entrada.nextInt();

    System.out.println("La cantidad de veces que se va a repetir es de "+numeroEntero);
    for(int i = 1;i<=numeroEntero;i++){
        System.out.println("vuelta = "+i);
    }

}

}
