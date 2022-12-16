package exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Para calcular a área do retângulo, siga as seguintes instruções :");
		System.out.println("Digite o tamanho da base do retângulo :");
		int base = sc.nextInt();
		System.out.println("Digite a altura do retângulo :");
		int altura = sc.nextInt();
		int area = base * altura;
		System.out.println("O valor da área do retângulo é : " + area + " cm²");
		sc.close();

	}

}
