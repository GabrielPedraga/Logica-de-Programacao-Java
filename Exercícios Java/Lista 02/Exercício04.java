package exercícios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o custo de fabricação do carro :");
		float fabricacao = sc.nextFloat();
		float porcentagemDist = fabricacao * 28 /100;
		float porcentagemImp = fabricacao * 45 / 100;
		float custoFinal = fabricacao + porcentagemDist + porcentagemImp;
		System.out.println("O custo final do carro é : R$ "+custoFinal);
		sc.close();
		

	}

}