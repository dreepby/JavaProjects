package br.edu.unoesc.exercicios;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
	  	Scanner teclado = new Scanner(System.in);
	  	System.out.println("Informe a altura entre os andares");
	  	float AlturaAndares = teclado.nextFloat();
	  	
	  	System.out.println("Informe a quantidade de degraus:");
	  	int QuantidadeDegrau = teclado.nextInt();
	  	
	  	System.out.printf("Altura de cada degrau: %f", (AlturaAndares * 100) /  QuantidadeDegrau);
	  	teclado.close();
	}
	
}
