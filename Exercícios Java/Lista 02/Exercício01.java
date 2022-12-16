package exercícios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade em anos :");
		int anos = sc.nextInt();
		System.out.println("Digite sua idade em meses :");
		int meses = sc.nextInt();
		System.out.println("Digite a quantidade de dias que passaram após o seu mêsversario :");
		int dias = sc.nextInt();
		int idade = 0;
	    idade = idade + (anos * 365);
	    idade = idade + (meses * 30);
	    idade = idade + dias;
	    System.out.println("A sua idade em dias é : "+idade);
	    sc.close();
		

	}

}
