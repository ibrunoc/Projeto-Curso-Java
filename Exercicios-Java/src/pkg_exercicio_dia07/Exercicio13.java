package pkg_exercicio_dia07;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a temperatura em celsius: ");
        double celsius = entrada.nextDouble();
        double fahrenheit = 0.0;


        fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Temperatura em fahrenheit: " + fahrenheit);
    }
}
