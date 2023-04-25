package fundamentos;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);

//        inicializando a variavel com var o java irá determinar o tipo da váriavel conforme o valor

        var b = 4.5; // aqui b é do tipo double
        var c = "texto"; // aqui c será do tipo String

        // OBS: após inicializar uma váriavel, seu tipo não pode ser alterado

        var teste = "diego";

        System.out.println(teste);

        System.out.println(b + c);
    }
}
