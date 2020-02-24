package br.edu.unoesc.exercicios;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		System.out.println("Informe uma frase: ");
		String sFrase = Teclado.nextLine();
		StringBuilder sFraseInvertida = new StringBuilder(sFrase);
		sFraseInvertida.reverse();
		System.out.println("Frase informada: " + sFrase);
		System.out.println("Frase ao contrario: " + sFraseInvertida);		
		
		Teclado.close();
	}

}
