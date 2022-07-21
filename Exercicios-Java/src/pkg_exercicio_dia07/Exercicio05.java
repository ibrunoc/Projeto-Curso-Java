package pkg_exercicio_dia07;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        int idade = entrada.nextInt();

        if (idade < 16){
            System.out.println("Não pode votar");
        } else if (idade >= 18 && idade <= 64) {
            System.out.println("Voto obrigátorio");
        }else if (idade >= 16 && idade <= 17 || idade > 65){
            System.out.println("Voto Opcional");
        }


    }
}
