package exercicios;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Para calcular a área do quadrado, siga as seguintes instruções :");
		System.out.println("Digite o tamanho do lado do quadrado :");
		float lado = sc.nextFloat();
		float area = lado * lado;
		System.out.println("O valor tota da área do quadrado é : " + area + " cm²");
		sc.close();
	}

}