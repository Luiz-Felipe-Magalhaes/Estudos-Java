package cursoUdemy.lista1;

import java.util.Scanner;

public class exercicio6 {

	/*
	 * Fazer um programa que leia tr�s valores com ponto flutuante de dupla
	 * precis�o: A, B e C. Em seguida, calcule e mostre: 
	 * a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura. 
	 * b) a �rea do c�rculo de raio C.(pi = 3.14159) 
	 * c) a �rea do trap�zio que tem A e B por bases e C por altura.
	 * d) a �rea do quadrado que tem lado B. 
	 * e) a �rea do ret�ngulo que tem lados A e B
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		double a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;
		double pi = 3.14159;
		
		System.out.print("Digite o valor de A: ");
		a = sc.nextDouble();
		
		System.out.print("Digite o valor de B: ");
		b = sc.nextDouble();
		
		System.out.print("Digite o valor de C: ");
		c = sc.nextDouble();
		
		areaTriangulo = (a * c) / 2;
		
		//area = r�*pi
		areaCirculo = Math.pow(c, 2) * pi;
		
		//area = ((Base + base)*h)/2
		areaTrapezio = ((a + b) * c) / 2;
		
		areaQuadrado = b * b;
		
		areaRetangulo = a * b;
		
		System.out.println("Triangulo: "+areaTriangulo);
		System.out.println("Circulo: "+areaCirculo);
		System.out.println("Trapezio: "+areaTrapezio);
		System.out.println("Quadrado: "+areaQuadrado);
		System.out.println("Retangulo: "+areaRetangulo);
		
	}

}
