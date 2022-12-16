package exercícios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma temperatura em graus Celsius :");
		float grausCelsius = sc.nextFloat();
		float grausFahrenheit = (9 * grausCelsius + 160) / 5;
		System.out.println("A temperatura convertida para Fahrenheit é : "+grausFahrenheit+" °F");
		sc.close();
	}

}

