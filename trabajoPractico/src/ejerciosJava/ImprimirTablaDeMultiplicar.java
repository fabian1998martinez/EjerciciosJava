package ejerciosJava;

public class ImprimirTablaDeMultiplicar {
    //Escribir un programa que cargue en una variable un número entero e imprima por
    //pantalla su tabla de multiplicar (del 1 al 12).

    private int numero;

    public ImprimirTablaDeMultiplicar() {
    }

    public void tablaDeMultiplicar(int numero){
        System.out.println("La tabla del "+numero);
        for(int i = 1 ; i<= 12;i++) {
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }
    }
}
