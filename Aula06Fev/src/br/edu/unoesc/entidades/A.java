package br.edu.unoesc.entidades;

public class A {
	int i;
	int j;
	
	public A(int i, int j) {
		this.i= i;
		this.j = j;
		
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getJ() {
		return j;
	}

	public void setJ(int j) {
		this.j = j;
	}
	
	
	public void motraij() {
		System.out.println("i = " + this.i +" j = "+ this.j);
	}
}
