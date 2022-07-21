package pkg_exercicio_dia07;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int valor[] = new int[20];
		int valores = 0;
		
		for (int n = 1; n < 21; n++) {
			System.out.println(n + " valor: ");
			valor[n] = entrada.nextInt();
		}
		for(Integer item: valor) {
			if(item > 8) {
				valores++;
			}
		}

		System.out.println(valores);
	}
}
