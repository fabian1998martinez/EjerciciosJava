import java.util.Scanner;

public class Ejercicio_1{

public static void main(String[] args) {
    /*1. Dado a un numero n de entrada mostrar sus consecutivos en pantalla.
     ejemplo: si el numero de entrada es 30 mostrar del 1 al 30. */
    Scanner entrada = new Scanner(System.in);

    System.out.println("Ingrese un numero entero ! ");
    int numeroEntero = entrada.nextInt();

    System.out.println("La cantidad de veces que se va a repetir es de "+numeroEntero);
    //siempre quieras tener control sobre sobre la iteracion 
    for(int i = 1;i<=numeroEntero;i++){
        System.out.println("vuelta = "+i);
    }

    //
     // Declaración e inicialización de un array de cadenas
     //
     int algo=423423423; //variable  un dato 
     String[] nombres = {"Juan", "María", "Pedro", "Ana"}; //4 
     //una variable te permite guardar mas  de un dato
     // para iterar objeto de tipo lista   
     for (String nombre : nombres) {
        System.out.println(nombre);
    }

    for(int i = 1;i<=numeroEntero;i++){
        System.out.println("vuelta = "+i);
    }
    
for (int i = 0; i < nombres.length; i++) {
    System.out.println(nombres[i]);
}
//  contro de ciclo
int number = 0;

do {
    System.out.println(number);   
} while (number < 323);
{
    number++;
}

while(number < 100){
    number++;
    System.out.println(number);
}
//int i = 0 contardo
// i < nombres.length es la condicion
// como quiero que se incremente el contador i++ 
   for (int i = 0; i < nombres.length; i=+2) {
    System.out.println(nombres[i]);
}
}

}
