package pkg_exercicio_dia07;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a = 0, b = 0, c = 0;

        System.out.println("Informe o valor de A: ");
        a = entrada.nextInt();
        System.out.println("Informe o valor de B: ");
        b = entrada.nextInt();
        System.out.println("Informe o valor de C: ");
        c = entrada.nextInt();

        if(a > b ) {
            if(b > c) {
                System.out.printf("1. A \n" + "2. B \n" + "3. C \n" );
            } else {
                if(a > c) {
                    System.out.println("1. A" + "2. C" + "3. B" );
                } else {
                    System.out.println("1. C" + "2. A" + "3. B" );
                }
            }
        } else {
            if(b > c) {
                if (a > c) {
                    System.out.println("1. B" + "2. A" + "3. C" );
                } else {
                    System.out.println("1. B" + "2. C" + "3. A" );
                }
            } else {
                System.out.println("1. C" + "2. B" + "3. A" );
            }
        }
    }
}
