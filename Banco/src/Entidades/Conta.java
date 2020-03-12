package Entidades;

public class Conta {
	private int numero;
	private String cliente;
	private double saldo;
	
	public Conta(int numero, String cliente, double saldo) {
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Banco \n Número da conta=" + numero + "\n Cliente=" + cliente + "\n Saldo=" + saldo;
	}

	public void deposito(double valor) {
		saldo+= valor;
	}
	
	public void saque(double qtd) {
		double taxa = 5.0f;
		double saque;
		saque = this.saldo - qtd;
		saque -= taxa;
		System.out.println("Você sacou: R$" + qtd);
		System.out.println("SALDO: R$" + saque);
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
