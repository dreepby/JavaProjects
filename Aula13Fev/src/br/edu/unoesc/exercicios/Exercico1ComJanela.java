package br.edu.unoesc.exercicios;

import javax.swing.JOptionPane;

public class Exercico1ComJanela {
	
	public static void main(String[] args) {
		float ValorHora = Float.parseFloat(JOptionPane.showInputDialog("Informe valor pago por hora:"));
		int HorasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas:"));
		System.out.printf("Você deve receber o valor de: R$ %.2f",  (float) ValorHora * HorasTrabalhadas);
	}


}
