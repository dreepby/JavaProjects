package entidades;

import java.util.Date;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
	private String Nome;
	private Date DataNascimento;
	
	
	public void setNome(String nome) {
		Nome = nome;
	}

	public String getNome() {
		return Nome;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		DataNascimento = dataNascimento;
	}
	
	public void SetData(String AData) {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		try {
			this.DataNascimento = formatter.parse(AData);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Date getDataNascimento() {
		return DataNascimento;
	}
	
	public int GetIdadePessoa() {
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(DataNascimento);
		
		Calendar hoje = Calendar.getInstance();
		
		LocalDate ldDataNascimento = LocalDate.of(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH)+1, calendar.get(Calendar.DAY_OF_MONTH));
		LocalDate ldDataAtual = LocalDate.of(hoje.get(Calendar.YEAR), hoje.get(Calendar.MONTH)+1, hoje.get(Calendar.DAY_OF_MONTH));
		
		Period periodo = Period.between(ldDataNascimento, ldDataAtual);
		return periodo.getYears();
	}
	
	
	public Boolean DataValida(String AData) {
		try {
			GregorianCalendar gc = new GregorianCalendar();
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	        gc.setTime(formatter.parse(AData));
	        return true;
	    } catch (ParseException e) {	  
	    	return false;
	    }
	}
	
	private int CompararDataNascimento(Date AData) {
		Calendar cDataNascismento = new GregorianCalendar();
		cDataNascismento.setTime(this.DataNascimento);
		
		Calendar cData = new GregorianCalendar();
		cData.setTime(AData);
		
		return cData.compareTo(cDataNascismento);
	}
	
	public Boolean DataDeNascimentoAnteriorADiaAtual() {				
		int iReturn = CompararDataNascimento(new Date());
		
		if (iReturn < 0)
			return true;
		else
			return false;
	}
	
	public Boolean JaFezAniversario() {
		int iReturn = CompararDataNascimento(new Date());
		
		if (iReturn <= 0)
			return true;
		else
			return false;
			   
	}
	
	public Boolean HojeEhAniversario() {
		int iReturn = CompararDataNascimento(new Date());
		
		if (iReturn == 0)
			return true;
		else
			return false;
	}
	
	@Override
	public String toString() {
		return "Pessoa [Nome=" + Nome + ", DataNascimento=" + DataNascimento + "]";
	}
}
