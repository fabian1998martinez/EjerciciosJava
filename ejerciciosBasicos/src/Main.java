
import ejerciosJava.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ImprimirTablaDeMultiplicar TablaMultiplicar = new ImprimirTablaDeMultiplicar();

        //Escribir un programa que cargue en una variable un número entero e imprima por
        //pantalla su tabla de multiplicar (del 1 al 12).
        System.out.println("Ingrese la tabla de mutiplicar que desea imprimir");
        int numero =leer.nextInt();
        TablaMultiplicar.tablaDeMultiplicar(numero);

        //Escribir un programa que cree dos variables enteras y muestre por pantalla, la suma,
        //la resta, la multiplicación, la división entera y el resto de la división entera.

        EjerciciosAritmeticos ejercicios = new EjerciciosAritmeticos();
        System.out.println("Ingrese el primer numero entero");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo valor entero");
        int numero2 = leer.nextInt();
        System.out.println("Ingrese el valor numerico de la operacion que desea realizar!1:sumar 2:restar 3:multiplicar 4:dividir 5:restoDeLaDivision");
        int opcion = leer.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("la suma de ambos numeros es : " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("la resta de ambos numeros es : " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("la multiplicacion de ambos es : " + (numero1 * numero2));
                break;
            case 4:
                System.out.println("la division de ambos numeros es : " + (numero1 / numero2));
                break;
            case 5:
                System.out.println("el resto de ambos numeros es : " + (numero1 % numero2));
                break;
            default:
                System.out.println("El numero ingresado no es valido!");
        }

          //Escribir un programa que realice la transformación de grados Celsius a Fahrenheit,
                //para el valor 20 C y lo imprima por pantalla.
                CelsiusAFahrenheit convertir = new CelsiusAFahrenheit();
                System.out.println("Ingrese el grado en celsuis que desea convertir a fahrenheit");
                double celsius = leer.nextDouble();
                convertir.convertirAFahrenheit(celsius);

                //Implementar algoritmos que permitan:
          //a) Calcular el perímetro y el área de un rectángulo, dada su base y su altura.
          //b) Calcular el perímetro y el área de un círculo dado su radio.
          //c) Calcular el volumen y el área de una esfera dado su radio.
          //d) Dados los catetos de un triángulo rectángulo, calcular la hipotenusa y el ángulo
          //(expresado en grados).

        CalculosConMath calularConMath = new CalculosConMath();

        System.out.println("Que operacion desea realizar? 1: Calcular el perímetro y el área de un rectángulo, dada su base y su altura." +
                " 2: Calcular el perímetro y el área de un círculo dado su radio. 3: Calcular el volumen y el área de una esfera dado su radio. " +
                " 4:  Dados los catetos de un triángulo rectángulo, calcular la hipotenusa y el ángulo");

        int respuestaMath = leer.nextInt();

        switch (respuestaMath){
            case 1 :
                System.out.println("Ingrese su base ");
                double base = leer.nextDouble();
                System.out.println("Ingrese su altura");
                double altura = leer.nextDouble();
                calularConMath.calcularRectangulo(base,altura);
                break;
            case 2:
                System.out.println("Ingrese su radio del circulo");
                double radio = leer.nextDouble();
                calularConMath.calcularCirculo(radio);
                break;
            case 3 :
                System.out.println("Ingrese el radio de la esfera");
                double radio2 = leer.nextDouble();
                calularConMath.calcularEsfera(radio2);
                break;
            case 4:
                System.out.println("Ingrese primer cateto");
                double cateto1=leer.nextDouble();
                System.out.println("Ingrese el  segundo cateto");
                double cateto2 = leer.nextDouble();
                calularConMath.traiguloRectangulo(cateto1,cateto2);
                break;
            default:
                System.out.println("numero ingresado no valido!!");
        }
        //Declarar dos variables enteras (con cualquier valor) e informar por pantalla cual es
        //menor de las dos, si son iguales, indicarlo por separado. Cambiar el orden de los
        //valores para comprobar el funcionamiento.

        MenorOMayor menorOMayorque = new MenorOMayor();

        System.out.println("Ingrese los numeros para saber cual de los numeros son mayor o menor que ");
        System.out.println("Ingrese el primer numero ");
        int numero3=leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero4 = leer.nextInt();
        menorOMayorque.menorOMayor(numero3,numero4);

        //Escribir un programa que declare un numero entero con cualquier valor e indique si
        //dicho número es par o impar.

        ParOImpar parOImpar = new ParOImpar();

        System.out.println("Ingrese el numero para determinar si es par o impar ");
        int numeroADeTerminar = leer.nextInt();
        parOImpar.saberParOImpar(numeroADeTerminar);

        }

    }
