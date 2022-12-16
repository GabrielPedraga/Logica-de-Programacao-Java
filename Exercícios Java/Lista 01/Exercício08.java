package exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Para calcular a área do triângulo, siga as seguintes instruções :");
		System.out.println("Digite o tamanho da base do triângulo :");
		float base = sc.nextFloat();
		System.out.println("Digite a altura do triângulo :");
		float altura = sc.nextFloat();
		float area = base * altura / 2;
		System.out.println("O valor da área do triângulo é: " + area + " cm²");
		sc.close();

	}

}