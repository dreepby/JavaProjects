package entidades;

public class Imovel {

	protected String Nome;
	protected String Endereco;
	protected double Area;
	protected double Valor;
	
	public Imovel(String ANome, String AEndereco, double AArea, double AValor) {
		this.Nome = ANome;
		this.Endereco = AEndereco;
		this.Area = AArea;
		this.Valor = AValor;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public String getEndereco() {
		return Endereco;
	}
	
	public void setEndereco(String Endereco) {
		this.Endereco = Endereco;
	}
	
	public double getArea() {
		return Area;
	}
	
	public void setArea(double Area) {
		this.Area = Area;
	}
	
	public double getValor() {
		return Valor;
	}
	
	public void setValor(double Valor) {
		this.Valor = Valor;
	}
	
	public double mostrarValorVenda() {
		return getValor();
	}
	
	
	@Override
	public String toString() {
		return "Imovel Proprietario=" + getNome()
				+ ", Endereco=" + getEndereco()
				+ ", Area=" + getArea()
				+ ", Valor=" + getValor();
	}
	
	
	
}