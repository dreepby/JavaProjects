package principal;

import entidades.Imovel;
import entidades.Novo;
import entidades.Usado;

import entidades.Situacao;


public class ClasseTeste {

	public static void main(String[] args) {		
		Imovel oCasa = new Imovel("André luis Moriera", "Rua marcilio dias, N490 - Estrela", 755.0 , 20000.00);
		Novo oApartamento = new Novo("Jardelino Moreira", "Rua marcilio dias, N495 - Estrela", 1200.0, 200000.0, 22, 04, 2020);
		Usado oCasa2 = new Usado("Lenonilza Borges", "Rua marcilio dias, N498 - Estrela", 600.0, 102300.0, Situacao.OCUPADO);
		System.out.println(oCasa.toString());
		System.out.println(oApartamento.toString());
		System.out.println(oCasa2.toString());
		
	}

}