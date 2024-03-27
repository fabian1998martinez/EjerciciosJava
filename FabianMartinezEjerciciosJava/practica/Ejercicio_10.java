package EjerciciosJava.practica;

import java.util.Scanner;

public class Ejercicio_10 {
    public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.print("Ingrese cantidad de fi las: ");
int n=scanner.nextInt();
System.out.print("Ingrese cantidad de columnas: ");
int m=scanner.nextInt();

int mat[][]=new int[n][m];
int nro;
for(int i=0; i<n; i++ )
{
for(int j=0; j<m; j++)
{

nro=(int)(Math.random()*1000);

mat[i][j]=nro;
}
}
for(int i=0; i<n; i++ )
{
for(int j=0; j<m; j++)
{

System.out.print(mat[i][j]+"\t");
}
System.out.println();
}
}
}

