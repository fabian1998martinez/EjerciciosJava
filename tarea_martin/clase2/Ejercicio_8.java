package clase2;
/*8. Crear un script para una sala de juegos infantiles que sirva para que niños mayores de 12 no paguen entrada 
y menores de 18 si tengan que pagar entrada 
pero que mayores de  edad no puedan ingresar.  */

import java.util.Scanner;

public class Ejercicio_8 {
    

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int menoresDe12 = 12;
        int menoresDe18 = 18;

        System.out.println("Ingrese su edad");
        int edad = leer.nextInt();
        
        if(edad < menoresDe12){
            System.out.println("Adelante , los menores de 12 no abona la entrada ");
        }else if(edad >= menoresDe12&& edad < menoresDe18){
            System.out.println("Apartir de los 12 años y menor a 18 se abona la entrada! ");
        }else{
            System.out.println("los mayores de 18 años no pueden ingresa !");
        }

    }
}
