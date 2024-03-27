package clase2;
/*1. Calcular si un número es par o impar. */

import java.util.Scanner;

/**
 * ParOInpar
 */
public class ParOInpar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar el primer numero");
        int numero1 = leer.nextInt();

        System.out.println("Ingresar el segundo numero");
        int numero2 = leer.nextInt();

        if(numero1 < numero2){
            System.out.println("El primer numero ingresado es menor que el segundo numero ingresado");
        }else if(numero1>numero2){
            System.out.println("El primero numero es mayor el segundo numero ingresado");
        }else{
            System.out.println("son del mismo valor");
        }
    }
}