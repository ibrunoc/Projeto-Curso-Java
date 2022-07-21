package pkg_exercicio_dia07;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int valor = 0, soma = 0;
		
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " Número: " );
			valor = entrada.nextInt();
			soma += valor;
		}
		
		System.out.println(soma);
	}
}
