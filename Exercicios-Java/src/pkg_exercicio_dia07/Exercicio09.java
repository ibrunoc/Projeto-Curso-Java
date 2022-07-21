package pkg_exercicio_dia07;

import java.util.*;

public class Exercicio09 {
	public static void main(String[] args) {
		int minimo = 1212;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor salarial: ");
		double salario = entrada.nextDouble();
		
		double resultado = salario / minimo; 
		
		System.out.printf("A quantidade de salários minimos são: %.0f",  resultado);
	}
}
