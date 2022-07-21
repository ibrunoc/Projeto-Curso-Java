package pck_aula;
import org.w3c.dom.ls.LSOutput;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Imc {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a sua altura:");
        Float altura = entrada.nextFloat();

        System.out.println("Entre com seu peso:");
        Float peso = entrada.nextFloat();

        Float imc = (peso) / (altura*altura);

        if(imc <= 18.5){
            System.out.printf("Voce esta no abaixo do peso, Seu imc foi: %.2f" , imc);
        }else if(imc>= 18.6 && imc <= 24.9) {
            System.out.printf("Voce esta no peso ideal, Seu imc foi: %.2f" , imc);
        }else if(imc>= 25.0 && imc <= 29.9) {
            System.out.printf("Voce levemente acima do peso, Seu imc foi: %.2f" , imc);
        }else if(imc>= 30.0 && imc <= 34.9) {
            System.out.printf("Voce no grau 1 de obesidade, Seu imc foi: %.2f" , imc);
        }else if(imc>= 35.0 && imc <= 39.9) {
            System.out.printf("Voce no grau 2 de obesidade, Seu imc foi: %.2f" , imc);
        }else if(imc >= 40.0){
            System.out.printf("Voce no grau 3 de obesidade, Seu imc foi: %.2f" , imc);
        }
    }
}
