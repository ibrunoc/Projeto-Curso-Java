package pkg_exercicio_dia07;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num=0;
        int antecessor=0;
        int sucessor=0;
        String saida="";

        System.out.println("Entre com o número");
        num = entrada.nextInt();

        antecessor = num -1;
        sucessor = num +1;

        saida += " O antecessor de " + num + " é " + antecessor + "\n O sucessor de " + num + " é " + sucessor;

        System.out.println(saida);
    }
}
