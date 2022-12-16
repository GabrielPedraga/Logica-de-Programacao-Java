package exercícios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor para A :");
		int a = sc.nextInt();
		System.out.println("Digite um valor para B :");
		int b = sc.nextInt();
		int c = a;
		a = b;
		b = c;
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		sc.close();

	}

}