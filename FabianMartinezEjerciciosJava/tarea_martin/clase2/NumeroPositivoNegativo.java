package clase2;
/*2. Determinar si un número es positivo, negativo o cero.*/

import java.util.Scanner;

public class NumeroPositivoNegativo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         
        System.out.println("ingrese un numero");
        int numero = leer.nextInt();
        if (numero > 0) {
            System.out.println("El numero es positivo");
        }else if(numero == 0){
           System.out.println("El numero es 0"); 
        }
        else{
            System.out.println("el numero es negativo");
        }
    }
}
