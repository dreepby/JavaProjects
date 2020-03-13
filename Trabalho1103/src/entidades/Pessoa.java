package entidades;

import java.util.Date;
import java.text.DateFormat;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	private String Nome;
	private Date DataNascimento;
	
	public Pessoa(String nome, Date dataNascimento) {
		Nome = nome;
		DataNascimento = dataNascimento;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getNome() {
		return Nome;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}
	
	public Date getDataNascimento() {
		return DataNascimento;
	}
	
	private LocalDate GetLocalDate(Date ADate) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(ADate);
		
		return LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
	}
	
	public int GetIdadePessoa() {
		LocalDate ldDataNascimento = GetLocalDate(DataNascimento);
		LocalDate ldDataAtual = GetLocalDate(new Date());
		
		Period periodo = Period.between(ldDataNascimento, ldDataAtual);
		return periodo.getYears();
	}
	
	public Boolean JaFezAniversario() {
		Calendar dataNasci = new GregorianCalendar();
		dataNasci.setTime(this.DataNascimento);
		
		Calendar dataAtual = new GregorianCalendar();
		dataAtual.setTime(new Date());
		
		return dataNasci.get(Calendar.MONTH) <= dataAtual.get(Calendar.MONTH) && dataNasci.get(Calendar.DAY_OF_MONTH) <= dataAtual.get(Calendar.DAY_OF_MONTH) 
				&&  dataNasci.get(Calendar.YEAR) <= dataAtual.get(Calendar.YEAR); 		
	}
	
	
	public Boolean HojeEhAniversario() {
		Calendar dataNasci = new GregorianCalendar();
		dataNasci.setTime(this.DataNascimento);
		
		Calendar dataAtual = new GregorianCalendar();
		dataAtual.setTime(new Date());
		
		return dataNasci.get(Calendar.MONTH) == dataAtual.get(Calendar.MONTH) && dataNasci.get(Calendar.DAY_OF_MONTH) == dataAtual.get(Calendar.DAY_OF_MONTH)
				&&  dataNasci.get(Calendar.YEAR) <= dataAtual.get(Calendar.YEAR); 	
	}
	
	@Override
	public String toString() {
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		return "Pessoa [Nome=" + Nome + ", DataNascimento=" + df1.format(DataNascimento) + "]";
	}
}
