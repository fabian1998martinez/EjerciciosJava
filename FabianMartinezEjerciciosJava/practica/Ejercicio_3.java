package EjerciciosJava.practica;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args)
{
Scanner scanner=new Scanner(System.in);
System.out.print("Ingrese un valor: ");
int v = scanner.nextInt();

int resto = v % 2;
if( resto == 0 )
{
System.out.println(v+" es Par");
}
else
{
System.out.println(v+" es Impar");
}
}
}
