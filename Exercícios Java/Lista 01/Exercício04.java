package exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um valor :");
		int valor1 = sc.nextInt();
		System.out.println("Digite um segundo valor :");
		int valor2 = sc.nextInt();
		int subtracao = valor1 - valor2;
		System.out.println("O valor total da subtração entr os valores é : " + subtracao);
		sc.close();

	}

}