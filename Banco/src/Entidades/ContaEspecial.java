package Entidades;

public class ContaEspecial extends Conta{
	private double limite;

	public ContaEspecial(int numero, String cliente, double saldo, double limite) {
		super(numero, cliente, saldo);
		this.limite = limite;
	}
	
}
