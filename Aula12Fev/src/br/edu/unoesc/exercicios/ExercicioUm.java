package br.edu.unoesc.exercicios;

import java.util.Scanner;

public class ExercicioUm {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);		
		System.out.println("Informe valor pago por hora:");
		float ValorHora = teclado.nextFloat();
		System.out.println("Informe a quantidade de horas trabalhadas:");
		int HorasTrabalhadas = teclado.nextInt();
		System.out.printf("Você deve receber o valor de: R$ %.2f", ValorHora * HorasTrabalhadas);
		teclado.close();

	}

}
