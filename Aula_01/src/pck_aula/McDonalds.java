package pck_aula;
import org.w3c.dom.ls.LSOutput;
import java.sql.SQLOutput;
import java.util.Scanner;

public class McDonalds {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Selecione o combo: " +
        "\n 1-Combo 1 \n 2-Combo 2 \n 3-Combo 3 \n 4-Combo 4");

        int Combo = entrada.nextInt();
        String Itens;

        switch(Combo){
            case 1: Itens="\n BigMac" + "\n Batata Média" + "\n Refrigerante CocaCola";break;
            case 2: Itens="\n Quarterão" + "\n Batata Pequena" + "\n MilkShake de Chocolate";break;
            case 3: Itens="\n BigCheddar" + "\n Batata Grande" + "\n Refrigerante CocaCola";break;
            case 4: Itens="\n BigChicken" + "\n Batata Média" + "\n MilkShake de Morango";break;
            default:Itens="Não possuimos esse combo";
        }

        System.out.println("O combo selecionado é: " + Itens);
    }
}
