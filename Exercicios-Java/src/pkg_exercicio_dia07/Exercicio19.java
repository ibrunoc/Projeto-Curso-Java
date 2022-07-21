package pkg_exercicio_dia07;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

       double real, dolar, cotacao;

       System.out.println("Insira a quantidade em dolar: " );
       dolar = entrada.nextDouble();

       System.out.println("Insira a cotação do dolar: " );
       cotacao = entrada.nextDouble();

       real = dolar * cotacao;

       System.out.printf("Você possui em reais: " + real);
    }
}
