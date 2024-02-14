/*7. Crear un script para un local de comida donde si una persona paga 
mas de lo que sale el producto tenga que entregar cambio que corresponde. */

import java.util.Scanner;

public class Ejercicio_7 {
      
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double valorDelProducto = 60.50;
        System.out.println("El valor del producto es 60.50, Ingrese el monto abonar");
        double dinero = leer.nextDouble();
        if(dinero < valorDelProducto){
            double dineroFaltante = 60.50 - dinero;
           System.out.println("le falta " + dineroFaltante);
        }else if(dinero > valorDelProducto){
            double dineroRestante = dinero - 60.50;
            System.out.println("su vuelto es "+dineroRestante);
        }else{
            System.out.println("Gracias por su compra vuelva pronto !");
        }
    }
}
