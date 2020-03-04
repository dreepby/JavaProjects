package br.edu.unoesc.aula;

import java.util.Scanner;
import entidades.Triangulo;

public class ProgramaComOO {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Triangulo oTriangulo = new Triangulo();
		System.out.println("Informe a base:");
		oTriangulo.Base = ler.nextDouble();
		
		System.out.println("Informe a altura:");
		oTriangulo.Altura = ler.nextDouble();
		
		ler.close();
	}

}
