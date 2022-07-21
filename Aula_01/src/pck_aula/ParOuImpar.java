package pck_aula;
import org.w3c.dom.ls.LSOutput;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int valor = entrada.nextInt();

        for(int n = 1; n <= valor; n++){
            if(n % 2 == 0){
                System.out.println(n + " numero PAR");
            }else{
                System.out.println(n + " numero IMPAR");
            }
        }

        /* DEFINIR OS NÚMERO PARES E IMPARES INSERIDOS
        int par = 0;
        int impar = 0;

         for(int n = 1; n <= 10; n++){
            System.out.println(n + " entre com o valor:");
            int valor = entrada.nextInt();

            if(valor % 2 == 0){
                System.out.println("numero PAR");
                par = par + 1;
            }else{
                System.out.println("numero IMPAR");
                impar = impar + 1;
            }
        }

        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números impares: " + impar);
        */
    }
}
