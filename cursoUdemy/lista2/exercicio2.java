package cursoUdemy.lista2;

import java.util.Scanner;

public class exercicio2 {

	/*
	 * Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou
	 * �mpar
	 */

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.print("Digite um numero inteiro: ");
		numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O numero digitado � par.");
		}

		else {
			System.out.println("O numero digitado � impar.");
		}

	}

}
