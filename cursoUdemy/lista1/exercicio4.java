package cursoUdemy.lista1;

import java.util.Scanner;

public class exercicio4 {

	/*
	 * Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas
	 * trabalhadas, o valor que recebe por hora e calcula o sal�rio desse
	 * funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas
	 * casas decimais
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codFuncionario;
		double horasTrabalhadas, salarioHora, salarioMes;
		
		System.out.print("Codigo do funcionario: ");
		codFuncionario = sc.nextInt();
		
		System.out.print("Horas trabalhadas no m�s: ");
		horasTrabalhadas = sc.nextDouble();
		
		System.out.print("Salario hora: R$");
		salarioHora = sc.nextDouble();
		
		salarioMes = horasTrabalhadas * salarioHora;
		
		System.out.printf("Funcionario: %d\nSalario no M�s: R$%.2f",codFuncionario, salarioMes);
		
	}

}
