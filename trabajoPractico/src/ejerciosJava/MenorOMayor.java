package ejerciosJava;
// clase  no objeto 
public class MenorOMayor {
    private int numero1;
    private int numero2;

    public MenorOMayor(){}

    public void menorOMayor(int numero1,int numero2){

        // 
        if (numero1<numero2){
            System.out.println("el numero "+numero1+" es menor que el numero "+numero2);
        } else if (numero1>numero2){
            System.out.println("el numero "+numero1+" es mayor que "+numero2);
        }else {
            System.out.println("El numero "+numero1+" es igual que el numero "+numero2 );
        }
    }
}
