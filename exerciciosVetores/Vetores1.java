package exerciciosVetores;

import java.util.Scanner;

public class Vetores1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int vetor[] = new int[5];
		
		for (int i = 0; i < vetor.length ; i++) {
			vetor[i] = sc.nextInt();
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		sc.close();
	}
}