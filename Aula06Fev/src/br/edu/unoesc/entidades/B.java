package br.edu.unoesc.entidades;

public class B extends A{
	int k;	
	
	public B(int i, int j, int k) {
		super(i, j);
		this.k = k;
	}

	public void mostrak() {
		System.out.println(this.k);
	}
}
a