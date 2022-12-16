package exercicios;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Para calcular a área de um circulo, siga seguintes instruções :");
		System.out.println("Digite o valor do raio :");
		float raio = sc.nextFloat();
		double area = 3.14 * (raio * raio);
		System.out.println("O valor da área do círculo é : " + area + " cm²");
		sc.close();

	}

}