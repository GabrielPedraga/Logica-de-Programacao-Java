package exercícios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de eleitores no município :");
		int eleitores = sc.nextInt();
		System.out.println("Digite a quantidade de votos brancos :");
		float votosBrancos = sc.nextFloat();
		System.out.println("Digite a quantidade de votos nulos :");
		float votosNulos = sc.nextFloat();
		System.out.println("Digite a quantidade de votos válidos :");
		float votosValidos = sc.nextFloat();
		float quantVotosBrancos = votosBrancos * 100 / eleitores ;
		float quantVotosNulos = votosNulos * 100 / eleitores;
		float quantVotosValidos = votosValidos * 100 / eleitores;
		System.out.println("A porcentagem de votos bracos é : "+quantVotosBrancos+" %");
		System.out.println("A porcentagem de votos nulos é : "+quantVotosNulos+" %");
		System.out.println("A porcentagem de votos válidos é : "+quantVotosValidos+" %");
		sc.close();
	}

}
