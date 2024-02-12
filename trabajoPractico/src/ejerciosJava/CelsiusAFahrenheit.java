package ejerciosJava;

public class CelsiusAFahrenheit {
    private double celsius;

    public CelsiusAFahrenheit() {
    }
    public void convertirAFahrenheit(double celsius){
        double fahrenheit = (9.0/5.0)*celsius+32;
        System.out.println("La conversion a Fahrenheit : " + fahrenheit);
    }
}
