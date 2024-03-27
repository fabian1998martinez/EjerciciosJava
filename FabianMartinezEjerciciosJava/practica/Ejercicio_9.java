package EjerciciosJava.practica;

import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args)
{
String dias[] = { "Lunes", "Martes", "Miercoles", "Jueves"
, "Viernes", "Sabado", "Domingo" };
Scanner scanner = new Scanner(System.in);
System.out.print("Ingrese un dia de la semana (numero): ");
int v = scanner.nextInt();
if( v <= dias.length )
{

System.out.println( dias[v-1] );
}
else
{
System.out.println("Dia incorrecto...");
}
}
    
}
