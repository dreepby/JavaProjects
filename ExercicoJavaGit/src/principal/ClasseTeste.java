package principal;

import entidades.Imovel;
import entidades.Novo;
import entidades.Usado;

import entidades.Situacao;


public class ClasseTeste {

	public static void main(String[] args) {
		
		
		Imovel casa = new Imovel("Luiz Henrique", "Rua Leonir Vargas 31", 750.0 , 1000000.00);
		Novo casa2 = new Novo("Luiz Henrique", "Rua Leonir Vargas 31", 600.0, 1000000.0, 30, 03, 2020);
		Usado casa3 = new Usado("Luiz Henrique", "Rua Leonir Vargas 31", 600.0, 1000000.0, Situacao.OCUPADO);
		System.out.println(casa);
		System.out.println(casa2);
		System.out.println(casa3);
		
	}

}