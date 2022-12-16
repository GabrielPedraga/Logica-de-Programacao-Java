package exercícios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Para saber o volume de uma lata de óleo, siga as seguintes instruções :");
		System.out.println("Digite o tamanho do raio da lata :");
		float raio = sc.nextFloat();
		System.out.println("Digite a altura da lata :");
		float altura = sc.nextFloat();
		double volume = (3.14 * (raio * raio)) * altura;
		System.out.println("O volume total da lata de óleo é : "+volume+" m³");
		sc.close();

	}

}
