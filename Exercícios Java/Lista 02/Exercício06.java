package exercícios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite uma temperatura em Fahrenheit :");
		float grausFahrenheit = sc.nextFloat();
		float grausCelsius = (grausFahrenheit - 32) * (5/9);
		System.out.println("A temperatura convertida para Celsius é : "+grausCelsius+" °C");
		sc.close();

	}

}