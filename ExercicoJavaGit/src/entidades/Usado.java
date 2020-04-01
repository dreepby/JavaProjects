package entidades;
import entidades.Situacao;

public final class Usado extends Imovel {

	private Situacao situacao;

	public Usado(String ANome, String AEndereco, double AArea, double AValor, Situacao ASituacao) {
		super(ANome, AEndereco, AArea, AValor);
		this.situacao = ASituacao;
	}

	public Situacao getSituacao() {
		return situacao;
	}
	
	public void setSituacao(Situacao sit) {
		this.situacao = sit;
	}
	
	   @Override
	    public double mostrarValorVenda() {
	        return Valor - (Valor * 1.1);
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
	   