package pkg_exercicio_dia07;

import java.util.*;

class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String nome = entrada.nextLine();
        Double salario = entrada.nextDouble();
        Double vendas = entrada.nextDouble();

        Double salarioFinal = calcVendas(salario, vendas, 15);

        
        System.out.println("Nome: " + nome);
        System.out.printf("Salário Fixo: %.2f \n", salario);
        System.out.printf("Salário Final: %.2f \n", salarioFinal);

    }
    public static Double calcVendas(Double salario, Double vendas, Integer comissao) {
        double bonus = ((vendas * 15) / 100);
        return salario + bonus;
    }
}

   