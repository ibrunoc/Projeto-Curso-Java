package pkg_exercicio_dia07;
import java.util.*;

class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira um saldo: ");
        double saldo = entrada.nextDouble();

        System.out.printf("o saldo com um reajuste de 1.5% e %.2f", saldo*1.5);
    }
}