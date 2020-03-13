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
	
	public static LocalDate GetLocalDate(Date ADate) {
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
	
	private LocalDate GetAniversario(LocalDate DataAtual) {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(this.DataNascimento);
		return LocalDate.of(DataAtual.getYear(), calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
	}
	
	public Boolean JaFezAniversario() {
		LocalDate ldDataAtual = GetLocalDate(new Date());
		LocalDate ldAniversario = GetAniversario(ldDataAtual);	    
		
		return ldAniversario.isBefore(ldDataAtual) || ldAniversario.isEqual(ldDataAtual); 		
	}
	
	
	public Boolean HojeEhAniversario() {
		LocalDate ldDataAtual = GetLocalDate(new Date());
		LocalDate ldAniversario = GetAniversario(ldDataAtual);	    
		
		return ldAniversario.isEqual(ldDataAtual); 		
	}
	
	@Override
	public String toString() {
		DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
		return "Pessoa [Nome=" + Nome + ", DataNascimento=" + df1.format(DataNascimento) + "]";
	}
}
