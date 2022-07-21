package pkg_exercicio_dia07;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int idades[] = new int[11];
		String nomes[] = new String[11];

		int maisNovo = 100;
		String nomeNovo = null;

		for(int n = 1; n < 11; n++) {

			System.out.println(n + " Insira um nome: ");
			nomes[n] = entrada.nextLine();

			System.out.println(n + " Insira a idade: ");
			idades[n] = entrada.nextInt();

			entrada.nextLine();
			System.out.println();

			if(idades[n] < maisNovo) {
				maisNovo = idades[n];
				nomeNovo = nomes[n];
			}
		}

		System.out.println("O mais novo foi: " + nomeNovo +  " com " + maisNovo + " anos.");
	}
}