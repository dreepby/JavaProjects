package br.edu.unoesc.exercicios;

import javax.swing.JOptionPane;

public class Exercicio3_1 {

	public static void main(String[] args) {	
		try {
			int iIdade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
		  
			String sMensagem;
			if ((iIdade <= 15)) {
				sMensagem = "Voc� n�o pode votar.";
		    }  else if (((iIdade >= 16) && (iIdade <= 17))  || (iIdade > 70)){
		    	sMensagem = "Voto opcional.";
		    }  else {
		    	sMensagem = "Voto obrigat�rio";
		    }
			
			JOptionPane.showMessageDialog(null, sMensagem);
		} catch (Exception e) {
		   JOptionPane.showMessageDialog(null, "Idade inv�lida!");
		}				
	}

}
