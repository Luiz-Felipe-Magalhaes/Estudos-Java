package cursoUdemy.lista1;

import java.util.Scanner;

public class exercicio5 {
	
	/*
	 * Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o
	 * valor unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e
	 * o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, codPeca2, qtdPeca1, qtdPeca2;
		double precoPeca1, precoPeca2, precoTotal;
		
		System.out.print("Codigo da Pe�a: ");
		codPeca1 = sc.nextInt();
		
		System.out.printf("Quantidade de Pe�as %d: ",codPeca1);
		qtdPeca1 = sc.nextInt();
		
		System.out.printf("Pre�o unitario da Pe�a %d: ",codPeca1);
		precoPeca1 = sc.nextInt();
		
		System.out.print("Codigo da Pe�a: ");
		codPeca2 = sc.nextInt();
		
		System.out.printf("Quantidade de Pe�as %d: ",codPeca2);
		qtdPeca2 = sc.nextInt();
		
		System.out.printf("Pre�o unitario da Pe�a %d: ",codPeca2);
		precoPeca2 = sc.nextInt();
		
		precoTotal = qtdPeca1 * precoPeca1 + qtdPeca2 * precoPeca2;
		
		System.out.printf("Valor total: R$%.2f",precoTotal);
		
	}

}
