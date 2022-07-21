package pkg_exercicio_dia07;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double valor;
		
		System.out.println("Insira o IPI: ");
		double ipi = entrada.nextDouble();
		
		System.out.println("Digite o código do produto 01. : ");
		int codigo1 = entrada.nextInt();
		System.out.println("Digite o valor do produto 01. : ");
		double valor1 = entrada.nextDouble();
		System.out.println("Digite a quantidade do produto 01. : ");
		int quantia1 = entrada.nextInt();
		
		System.out.println("Digite o código do produto 02. : ");
		int codigo2 = entrada.nextInt();
		System.out.println("Digite o valor do produto 02. : ");
		double valor2 = entrada.nextDouble();
		System.out.println("Digite a quantidade do produto 02. : ");
		int quantia2 = entrada.nextInt();
		
		valor = (valor1*quantia1*valor2*quantia2)*(ipi/100+1);
		
		System.out.println("Total: " + valor);
	}
}
