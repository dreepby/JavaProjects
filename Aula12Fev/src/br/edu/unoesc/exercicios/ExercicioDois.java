package br.edu.unoesc.exercicios;

import java.util.Scanner;


public class ExercicioDois {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);		
		
		System.out.println("Informe a altura:");
		float Altura = teclado.nextFloat();
		
		System.out.println("Informe a base menor:");
		float BaseMenor = teclado.nextFloat();
		
		System.out.println("Informe a base maior:");
		float BaseMaior = teclado.nextFloat();	
		
		System.out.printf("Area do trapézio: %.2f", (Altura * (BaseMenor + BaseMaior)) / 2);
		teclado.close();
	}

}
