package pck_aula;
import org.w3c.dom.ls.LSOutput;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Selecione o mês: " +
        "\n 1-Janeiro \n 2-Fevereiro \n 3-Março \n 4-Abril \n 5-Maio \n 6-Junho " +
        "\n 7-Julho \n 8-Agosto \n 9-Setembro \n 10-Outubro \n 11-Novembro \n 12-Dezembro");

        int Mes = entrada.nextInt();
        String NomeMes;

        switch(Mes){
            case 1: NomeMes="Janeiro";break;
            case 2: NomeMes="Fevereiro";break;
            case 3: NomeMes="Março";break;
            case 4: NomeMes="Abril";break;
            case 5: NomeMes="Maio";break;
            case 6: NomeMes="Junho";break;
            case 7: NomeMes="Julho";break;
            case 8: NomeMes="Agosto";break;
            case 9: NomeMes="Setembro";break;
            case 10: NomeMes="Outubro";break;
            case 11: NomeMes="Novembro";break;
            case 12: NomeMes="Dezembro";break;
            default:NomeMes="Mês inválido";
        }

        System.out.println("O mês é: " + NomeMes);
    }
}
