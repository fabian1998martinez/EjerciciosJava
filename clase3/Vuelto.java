package clase3;

import java.util.Scanner;

public class Vuelto {
    public static final double VALOR_PRODUCTO = 60.0; //  constate 
   public static void main(String[] args) {
// programa que me calcula el cambio de un pagare 
   
    Scanner scanner = new Scanner(System.in);
    System.out.println("ingrese el pago ");
    double dinero = scanner.nextDouble();
    double total;
    
  // harcodeo de datos   
// proseso  
//
// if (valorDelProducto>60.0) // 
if (dinero>VALOR_PRODUCTO) {
    total= dinero-VALOR_PRODUCTO;
    // salida 
    System.out.println("falta dinero");

}else if(dinero < VALOR_PRODUCTO) {
    total= dinero-VALOR_PRODUCTO;
    // salida 
    System.out.println("tu vuelto es ");
}

} 
}
