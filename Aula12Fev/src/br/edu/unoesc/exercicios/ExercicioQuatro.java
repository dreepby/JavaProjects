package br.edu.unoesc.exercicios;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Tamanho da escada:");
		float TamanhoEscada = teclado.nextFloat();
		
		System.out.println("Altura em que deseja pregrar o quadro:");
		float AlturaQuadro = teclado.nextFloat();
		teclado.close();
	}

}
