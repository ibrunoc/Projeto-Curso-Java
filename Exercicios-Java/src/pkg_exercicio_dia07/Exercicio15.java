package pkg_exercicio_dia07;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade = 0, soma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " Idade: " );
            idade = entrada.nextInt();
            soma += idade;
        }

        int somaFinal = soma;

        System.out.println(somaFinal);
    }

}
