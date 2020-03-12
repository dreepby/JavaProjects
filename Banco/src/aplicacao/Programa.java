package aplicacao;

import Entidades.Conta;
import Entidades.ContaEspecial;

public class Programa {

	public static void main(String[] args) {
		Conta oConta = new Conta(1 , "Rafael", 1000f);
		ContaEspecial oContaE = new ContaEspecial(2, "João", 1000f, 2000f);
		System.out.println(oContaE);
		
		oContaE.deposito(5000f);
		System.out.println(oContaE);
	}
	
}
