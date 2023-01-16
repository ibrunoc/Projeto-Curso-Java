package pkg_exercicio_dia07;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Insera um número: ");
        int n = entrada.nextInt();

        if(n % 10 == 0){
            System.out.println("Esse número é divisivel por 10");
        } else if(n % 5 == 0){
            System.out.println("Esse número é divisivel por 5");
        }else if(n % 2 == 0){
            System.out.println("Esse número é divisivel por 2");
        }else{
            System.out.println("Não é possível dividir");
        }
    }
}
