package ejerciosJava;

public class ParOImpar {
    private int numeroEntero;

    public ParOImpar(){

    }
    public void saberParOImpar(int numeroEntero){
        if(numeroEntero%2 == 0){
            System.out.println("El numero ingresado es par");
        }else {
            System.out.println("El numero ingresado es impar");
        }

    }
}
