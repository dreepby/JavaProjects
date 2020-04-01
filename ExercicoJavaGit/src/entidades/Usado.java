package entidades;
import entidades.Situacao;

public final class Usado extends Imovel {

	private Situacao sit;

	public Usado(String nome, String endereco, double area, double valor, Situacao sit) {
		super(nome, endereco, area, valor);
		this.sit = sit;
	}

	public Situacao getSituacao() {
		return sit;
	}
	
	public void setSituacao(Situacao sit) {
		this.sit = sit;
	}
	
	   @Override
	    public double mostrarValorVenda() {
	        double ValorNovo;
	        ValorNovo = valor * 1.1;
	        return ValorNovo;
	    }

	
	   @Override
		public String toString() {
			return "Situa��o atual " + getSituacao()   
			+ "\nImovel pertence a " + getNome() 
			+ " \nest� localizado em " + getEndereco() 
			+ " \npossui uma �rea de " + getArea() + "m�\n"
			+ " e tem um valor de R$" + String.format("%.2f", mostrarValorVenda())+  "\n";
		}
}
	   