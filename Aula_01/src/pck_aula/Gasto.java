package pck_aula;
import org.w3c.dom.ls.LSOutput;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Gasto {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com os gastos de janeiro nota:");
        Double janeiro = entrada.nextDouble();

        System.out.println("Entre com os gastos de fevereiro nota:");
        Double fevereiro = entrada.nextDouble();

        System.out.println("Entre com os gastos de marco nota");
        Double marco = entrada.nextDouble();

        Double Gastos = (janeiro+fevereiro+marco) / 3;

        if(Gastos >= 20000){
            System.out.printf("Iniciar corte de gastos: %.2f" , Gastos);
        }else{
            System.out.println("Gastos dentro do esperado");
        }
    }
}
