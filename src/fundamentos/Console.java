package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = entrada.nextLine();

        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();

        System.out.println("Seu nome é " + nome);
        System.out.printf("Sua idade é %d anos",idade);

        entrada.close();
    }
}
