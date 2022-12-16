package exercícios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da prestação a ser paga :");
		float valor = sc.nextFloat();
		System.out.println("Digite a taxa de atraso :");
		float taxa = sc.nextFloat();
	    System.out.println("Digite o tempo de atraso da prestação :");
	    float atraso = sc.nextFloat();
	    float prestacao = valor + ((valor * taxa / 100) * atraso);
	    System.out.println("O valor da pretação é : "+prestacao);
	    sc.close();

	}

}