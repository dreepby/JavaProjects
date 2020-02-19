package br.edu.unoesc.exercicios;

import java.lang.Math;

public class Exercicio_4_3 {
	
	public static void main(String[] args) {
		int aNumeros[] = new int[10];
		
        SortearNumeros(aNumeros);
        MostrarNumeros(aNumeros);
        
        System.out.printf("A soma dos números sorteados é: %d\n", SomarNumeros(aNumeros));
        System.out.printf("Média números pares: %.2f\n", MediaNumerosPares(aNumeros));
        
        int iMenorNumero = 0, iMaiorNumero = 0;
        LocalizarMenorNumeroEMaiorNumero(aNumeros, iMenorNumero, iMaiorNumero);
        System.out.printf("Menor número %d, maior número %d", iMenorNumero, iMaiorNumero);       
	}
	
	public static void SortearNumeros(int ANumeros[]) {
		for (int i=0;i<10;i++) {
			ANumeros[i] = (int)(1 + Math.random( )* 9);
		}
	}
	
	public static void MostrarNumeros(int ANumeros[]) {
		for (int iNumero: ANumeros) {
			System.out.println(iNumero);
		}
	}

	public static int SomarNumeros(int ANumeros[]) {
		int iSoma = 0;
		for (int iNumero: ANumeros) {
			iSoma += iNumero;
		}
		return(iSoma);
	}
	
	public static float MediaNumerosPares(int ANumeros[]) {
		int iSoma = 0, iQuantidadeNumerosPares = 0;
		for (int iNumero: ANumeros) {
			if (iNumero % 2 == 0) {
				iSoma += iNumero;
				iQuantidadeNumerosPares++;
			}
		}
		return((float)iSoma/iQuantidadeNumerosPares);
	}
	
	public static void LocalizarMenorNumeroEMaiorNumero(int ANumeros[], int AMenorNumero, int AMaiorNumero) {
		for (int i=0;i<10;i++) {
		   if ((i==0) || (ANumeros[i] < AMenorNumero))
			   AMenorNumero =  ANumeros[i];
		   if ((i==0) || (ANumeros[i] > AMaiorNumero))
			   AMaiorNumero =  ANumeros[i];		   
		}
	}
}
