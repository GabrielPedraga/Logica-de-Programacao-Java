package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Para calcular a área do losango, siga as seguintes instruções :");
		System.out.println("Digite o valor da diagonal maior :");
		float dmaior = sc.nextFloat();
		System.err.println("Digite o valor da diagonal menor :");
		float dmenor = sc.nextFloat();
		float area = (dmaior * dmenor) / 2;
		System.out.println("O valor total da área do losango é : " + area + " cm²");
		sc.close();

	}

}