package exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor :");
		float valor1 = sc.nextFloat();
		System.out.println("Digite um segundo valor :");
		float valor2 = sc.nextFloat();
		float divisao = valor1 / valor2;
		System.out.println("O valor totalda divisão entre os valores é : " + divisao);
		sc.close();

	}

}
