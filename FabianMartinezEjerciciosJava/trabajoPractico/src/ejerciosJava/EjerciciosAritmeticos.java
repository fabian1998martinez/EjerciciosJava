package ejerciosJava;
// objeto - una clase 
public class EjerciciosAritmeticos {
    private int numero1;
    private int numero2;

    public EjerciciosAritmeticos() {

    }

    public int sumar(int numero1,int numero2){
        int resultado = numero1+numero2;
        return resultado;
    }
    public int restar(int numero1,int numero2){
        int resultado = numero1-numero2;
        return resultado;
    }
    public int multiplicar(int numero1,int numero2){
        int resultado = numero1*numero2;
        return resultado;
    }
    public int division(int numero1,int numero2){
        int respuesta = numero1/numero2;
        return respuesta;
    }
    public int resto(int numero1,int numero2){
        int respuesta = numero1%numero2;
        return respuesta;
    }
}
