package br.edu.unoesc.exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner Teclado = new Scanner(System.in);
		System.out.println("Informe uma frase: ");
		String sFrase = Teclado.nextLine();
		String sFraseAlterada = new String();
		
		System.out.println("Informe a palavra que você deseja alterar: ");
		String sPalavraAlterar = Teclado.nextLine();		
		String sNovaPalavra= new String();
		
		if (sFrase.indexOf(sPalavraAlterar) >= 0) {
			System.out.println("Informe a nova palavra: ");
			sNovaPalavra = Teclado.nextLine();
			sFraseAlterada = sFrase.replaceAll(sPalavraAlterar, sNovaPalavra);
		}
		
		System.out.println("Frase informada: " + sFrase);
		if (sNovaPalavra.length() > 0)
			System.out.println("Frase alterada: " + sFraseAlterada);
		
		Teclado.close();
	}

}
