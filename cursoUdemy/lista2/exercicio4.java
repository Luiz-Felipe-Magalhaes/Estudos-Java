package cursoUdemy.lista2;

import java.util.Scanner;

public class exercicio4 {

	/*
	 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a dura��o do
	 * jogo, sabendo que o mesmo pode come�ar em um dia e terminar em outro, tendo
	 * uma dura��o m�nima de 1 hora e m�xima de 24 horas.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracaoJogo;
		
		System.out.print("Hora inicial: ");
		horaInicial = sc.nextInt();
		
		System.out.print("Hora final: ");
		horaFinal = sc.nextInt();
				
		duracaoJogo = horaFinal - horaInicial;
		
		if (duracaoJogo < 1) {
			System.out.println("O jogo n�o acabou.");
		}
		
		else {
			duracaoJogo = 24 - horaInicial + horaFinal;
			System.out.println("Dura��o: "+duracaoJogo+" horas");
		}
		
		
		

	}

}
