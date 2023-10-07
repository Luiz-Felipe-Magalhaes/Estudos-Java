package cursoUdemy.lista2;

import java.util.Scanner;

public class exercicio3 {

	/*
	 * Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma mensagem
	 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos s�o
	 * m�ltiplos entre si. Aten��o: os n�meros devem poder ser digitados em ordem
	 * crescente ou decrescente
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int valor1, valor2;

		System.out.printf("Digite o primeiro valor: ");
		valor1 = sc.nextInt();

		System.out.printf("Digite o segundo valor: ");
		valor2 = sc.nextInt();

		if (valor1 == 0 || valor2 == 0) {
			System.out.println("Os numeros s�o multiplos entre si.");
		}

		else if ((valor1 == 1 && valor2 != 1) || (valor2 == 1 && valor1 != 1)) {
			System.out.println("Os numeros n�o s�o multiplos entre si.");
		}

		else if ((valor1 % valor2 == 0) || (valor2 % valor1 == 0)) {
			System.out.println("Os numeros s�o multiplos entre si.");
		}

		else {
			System.out.println("Os numeros n�o s�o multiplos entre si.");
		}

	}

}
