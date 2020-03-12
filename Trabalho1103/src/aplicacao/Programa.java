package aplicacao;

import entidades.Pessoa;
import java.util.Date;

public class Programa {

	public static void main(String[] args) {
		Pessoa oPessoa = new Pessoa();
        oPessoa.setNome("André");
		oPessoa.SetData("01/01/2000");
		System.out.println(oPessoa.toString());
        
        System.out.println("idade pessoa:" + oPessoa.GetIdadePessoa());
		System.out.println("Data válida:" + oPessoa.DataValida("01/01/2000"));
		System.out.println("Data inválida:" + oPessoa.DataValida("51/31/22200"));
		System.out.println("Data nascimento anterior ao dia atual(s): " + oPessoa.DataDeNascimentoAnteriorADiaAtual());
		System.out.println("Ja fez aniversario: (s)" + oPessoa.JaFezAniversario());
		
		oPessoa.SetData("01/01/2030");
		System.out.println("Ja fez aniversario: (n)" + oPessoa.JaFezAniversario());
		System.out.println("Data nascimento anterior ao dia atual(não)" + oPessoa.DataDeNascimentoAnteriorADiaAtual());
		System.out.println("Hoje é aniversario: (n)" + oPessoa.HojeEhAniversario());
		
		oPessoa.setDataNascimento(new Date());
		System.out.println("Hoje é aniversario: (s)" + oPessoa.HojeEhAniversario());
		
	}

}
