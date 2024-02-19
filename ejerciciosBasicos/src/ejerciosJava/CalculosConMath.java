package ejerciosJava;

public class CalculosConMath {
    private double altura;
    private  double base;
    private double radio;
    private double cateto1;
    private double cateto2;
    private final double PI  = Math.PI;
    public CalculosConMath() {
    }
    public void calcularRectangulo(double base , double altura){
        double perimetro = 2*(base+altura);
        double area = base*altura;
        System.out.println("El perimetrodel rectangulo  dado su base y altura  es : "+perimetro);
        System.out.println("El area del rectangulo  dado su base y altura es : "+area);

    }
    public void calcularCirculo(double radio){

        double perimetro = 2*PI*radio;
        double area=PI*Math.pow(radio,2);
        System.out.println("El perimetro de un circulo dado su radio es : "+perimetro);
        System.out.println("el area de un circulo  dado su radio es : "+area);

    }
    public void calcularEsfera(double radio){

        double volumen = (4.0/3.0)*PI*Math.pow(radio,3);
        double area = 4*PI*Math.pow(radio,2);
        System.out.println("El volumen de una esfera es : "+volumen);
        System.out.println("El area de una esfera es : "+area);
    }
    public void traiguloRectangulo(double cateto1,double cateto2){

        double hipotenusa = Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
        System.out.println("Hipotenusa : "+hipotenusa);
        double anguloEnRadiles = Math.atan(cateto1/cateto2);
        double anguloEnGrados=Math.toDegrees(anguloEnRadiles);
        System.out.println("Angulo en grados : "+anguloEnGrados);

    }

}
