package fundamentos;

import javax.swing.*;
import java.util.Scanner;

/**
 * receber via console 3 salarios, sendo 8000,00 | 7500.00 | 7500,00
 * dividir os salarios informados por 3
 * devolver o valor da média salarial do funcionario
 */

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro salario:");
        String salario01 = entrada.nextLine().replace(",",".");

        System.out.println("Informe o primeiro salario:");
        String salario02 = entrada.nextLine().replace(",",".");

        System.out.println("Informe o primeiro salario:");
        String salario03 = entrada.nextLine().replace(",",".");

       double sal01 = Double.parseDouble(salario01);
       double sal02 = Double.parseDouble(salario02);
       double sal03 = Double.parseDouble(salario03);

       double soma = sal01 + sal02 + sal03;
       double mediaSalarial = soma / 3;

       System.out.printf("A media salarial é %.2f", mediaSalarial);

       entrada.close();
    }
}
