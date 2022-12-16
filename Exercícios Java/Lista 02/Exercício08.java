package exercícios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tempo gasto durante a viagem :");
		int tempo = sc.nextInt();
		System.out.println("Digite a velocidade média :");
		int velocidade = sc.nextInt();
		float distancia = tempo * velocidade;
		float litrosUsados = distancia / 12;
		System.out.println("A distância percorrida foi : "+distancia+" km");
		System.out.println("A quantida de litros usados durante a viagem foi : "+litrosUsados);
		sc.close();
		

	}

}