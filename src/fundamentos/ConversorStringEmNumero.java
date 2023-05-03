package fundamentos;

import javax.swing.*;

public class ConversorStringEmNumero {
    public static void main(String[] args) {
        String texto1 = JOptionPane.showInputDialog("Digite o texto");

        String texto2 = JOptionPane.showInputDialog("Digite o segundo texto");

        System.out.println(texto1 + texto2);

        double numero01 = Double.parseDouble(texto1);
        double numero02 = Double.parseDouble(texto2);

        double soma = numero01 + numero02;

//        formatação de double
        System.out.printf("%.2f", soma);




    }
}
