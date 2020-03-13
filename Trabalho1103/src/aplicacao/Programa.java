package aplicacao;

import entidades.Pessoa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe seu nome:");
		String sNome = teclado.nextLine();
		
		System.out.println("Informe a data de nascimento:");
		String Data = teclado.nextLine();
		if ((IsDateValid(Data)) && (DataDeNascimentoAnteriorADiaAtual(GetDate(Data)))) {
			Pessoa oPessoa = new Pessoa(sNome, GetDate(Data));
			System.out.println(oPessoa.toString());
        
			System.out.println("idade pessoa:" + oPessoa.GetIdadePessoa());
			System.out.println("Ja fez aniversario: " + oPessoa.JaFezAniversario());
			System.out.println("Hoje é aniversario: " + oPessoa.HojeEhAniversario());
		}
		else
		  System.out.println("Data inválida!");
		teclado.close();
	}
	
	public static Boolean IsDateValid(String AData) {
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			formatter.setLenient(false);
	        formatter.parse(AData);
	        return true;
	    } catch (ParseException e) {	  
	    	return false;
	    }
	}
	
	public static Date GetDate(String AData) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return formatter.parse(AData);
		} catch (ParseException e) {
			return new Date();
		}
	}
	
	public static Boolean DataDeNascimentoAnteriorADiaAtual(Date AData) {
		LocalDate ldDataNascimento = Pessoa.GetLocalDate(AData);
		LocalDate ldDataAtual = Pessoa.GetLocalDate(new Date());
		
		return ldDataNascimento.isBefore(ldDataAtual);
	}

}
