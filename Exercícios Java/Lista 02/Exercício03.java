package exercícios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do seu salário mensal atual :");
		float salarioAtual = sc.nextFloat();
		System.out.println("Digite o percentual de reajuste :");
		float reajuste = sc.nextFloat();
		float salarioFinal = salarioAtual + (salarioAtual * reajuste / 100);
		System.out.println("Após o reajuste o seu salário será : R$ "+salarioFinal);
		sc.close();

	}

}
