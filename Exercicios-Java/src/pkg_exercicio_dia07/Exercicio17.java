package pkg_exercicio_dia07;

import java.util.Scanner;

public class Exercicio17{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idades[] = new int[20];
        int maiores = 0;

        for (int idade : idades) {
            System.out.println("Insira uma idade: ");
            idade = entrada.nextInt();
            if (idade >= 18) maiores++;
        }

        System.out.println(maiores);
    }
}