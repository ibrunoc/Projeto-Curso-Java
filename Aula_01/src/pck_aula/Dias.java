package pck_aula;
import org.w3c.dom.ls.LSOutput;
import java.sql.SQLOutput;
import java.util.Scanner;


public class Dias {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com dia da semana: \n 1-DOMINGO \n 2-SEGUNDA \n 3-TERÇA \n 4-QUARTA \n 5-QUINTA \n 6-SEXTA \n 7-SABÁDO");
        int DiaSemana = entrada.nextInt();
        String NomeDia;

        switch(DiaSemana){
            case 1: NomeDia="Domingo";break;
            case 2: NomeDia="Segunda";break;
            case 3: NomeDia="Terça";break;
            case 4: NomeDia="Quarta";break;
            case 5: NomeDia="Quinta";break;
            case 6: NomeDia="Sexta";break;
            case 7: NomeDia="Sabádo";break;
            default:NomeDia="Dia inválido";
        }

        System.out.println("O dia da semana é: " + NomeDia);
    }
}
