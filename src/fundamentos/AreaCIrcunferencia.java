package fundamentos;

public class AreaCIrcunferencia {
    public static void main(String[] args) {

        double raio = 3.5;
        final double PI = 3.14159;

        double area = PI * raio * raio;
        System.out.println(area);

        raio = 10;
        area = PI * raio * raio;

        System.out.println("A area da circunferência é " + area);


    }
}
