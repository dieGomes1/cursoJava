package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
//                ( F - 32 ) * 5 / 9  = C
        double temperatudaFahrenheit;
        double temperaturaCelsius;

        final double AJUSTE = 32;
        final double FATOR = 5.0/9.0;

        temperatudaFahrenheit = 300;
        temperaturaCelsius = (temperatudaFahrenheit - AJUSTE) * FATOR;

        System.out.println(temperatudaFahrenheit + " em Fahrenheit é igual a " + temperaturaCelsius + " em Celsius");



    }
}
