package br.edu.unoesc.exercicios;

import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe uma frase:");
		String sFrase = new String();
		sFrase = teclado.nextLine();
		
		
		String sFraseSemEsp = new String(sFrase);
		sFraseSemEsp.trim();
		
		String sFraseTrocadoNum = new String(sFrase);
		sFraseTrocadoNum.trim();
		sFraseTrocadoNum = TrocarNumeros(sFraseTrocadoNum);		
		
		System.out.println("Tamanho da frase: " + sFrase.length());
		System.out.println("Tamanho da frase sem espaço no inicio e fim: " + sFraseSemEsp.length());
		System.out.println("Quantidade de vogais: " + QuantidadeVogais(sFrase));
		System.out.println("Quantidade de palavras: " + QuantidaDePalavras(sFrase));
		System.out.println("String com numeros trocado: " + sFraseTrocadoNum);
		

		teclado.close();	
	}
	
	public static int QuantidadeVogais(String AFrase) {
		int iQuantidade = 0;
		String sVogais = new String("AEIOU");
		for (int i=0;i<AFrase.length();i++) {
			if (sVogais.indexOf(Character.toUpperCase(AFrase.charAt(i))) >= 0)
				iQuantidade++;
		}
		return(iQuantidade);
	}

	public static int QuantidaDePalavras(String AFrase) {
		String[] sPalavras = AFrase.split(" ");
		return(sPalavras.length);		
	}
	
	public static String TrocarNumeros(String AFrase) {
		char aNumeros[] = {'0','1','2','3','4','5','6','7','8','9'};
		for(char i:aNumeros) {
			AFrase = AFrase.replace(i, '*');
		}
		return(AFrase);
	}
	
}
