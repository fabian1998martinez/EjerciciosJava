/*
 11. crear un programa que dependiendo que numero del día de la semana es, dicho programa te devuelve el dia. 
 ejemplo . 
 si ingreso el 1 me tiene que devolver el día lunes.
 */

import java.util.Scanner;

public class EJercicio_11 {
 
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero correspondiente del dia de la semana ( 1 , 2 , 3 , 4 , 5 , 6 , 7)");
        int dia = leer.nextInt();
        switch (dia) {
            case 1:
                System.out.println("1 corresponde a Lunes");
                break;
            case 2:
                System.out.println("2 corresponde a Martes");
                break;
            case 3:
                System.out.println("3 corresponde a Miercoles");
                break;
            case 4:
                System.out.println("4 corresponde a Jueves");
                break;
            case 5 :
                System.out.println(" 5 corresponde a viernes");
                break;
            case 6:
                System.out.println(" 6 corresponde a Sabado");
                break;
            case 7:
                System.out.println("7 corresponde a Domingo");
                break;            
            default:
                 System.out.println("Datos ingresado no valido!!");
        }
    }
    
}