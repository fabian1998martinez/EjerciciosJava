package EjerciciosJava.practica;

import java.util.Scanner;

public class Ejercicio_2 {
 
public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.print("Ingrese su edad: ");
int edad=scanner.nextInt();
if( edad >= 21 )
{
System.out.println("Ud. es mayor de edad !");
}
else
{
System.out.println("Ud. es es menor de edad");
}
}
}