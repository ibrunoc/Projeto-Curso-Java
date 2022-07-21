package pck_aula;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a primeira nota:");
        Float nota1 = entrada.nextFloat();

        System.out.println("Entre com a segunda nota:");
        Float nota2 = entrada.nextFloat();

        System.out.println("Entre com a terceira nota:");
        Float nota3 = entrada.nextFloat();

        Float media = (nota1+nota2+nota3) / 3;

        if(media >= 6){
            System.out.println("Aluno aprovado!");
            System.out.printf("A media foi: %.2f" , media);
        }else if(media >= 5){
            System.out.println("Aluno em recuperacao!");
            System.out.printf("A media foi: %.2f" , media);
        }else{
            System.out.println("Aluno reprovado!");
            System.out.printf("A media foi: %.2f" , media);
        }
    }
}
