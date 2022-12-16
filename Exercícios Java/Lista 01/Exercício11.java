package exercicios;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Para calcular a área do trapézio, siga as seguintes instruções :");
		System.out.println("Digite o valor da base maior :");
		float bmaior = sc.nextFloat();
		System.out.println("Digite o valor da base menor :");
		float bmenor = sc.nextFloat();
		System.out.println("Digite o valor da altura :");
		float altura = sc.nextFloat();
		float area = ((bmaior + bmenor) * altura) / 2;
		System.out.println("O valor total da área do trapézio é : " + area + " cm²");
		sc.close();

	}

}