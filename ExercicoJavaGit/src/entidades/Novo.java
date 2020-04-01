package entidades;

import java.util.Calendar;


public final class Novo extends Imovel {

    protected Calendar disponivel = Calendar.getInstance();
    protected int dia = disponivel.get(Calendar.DAY_OF_MONTH);
    protected int mes = disponivel.get(Calendar.MONTH);
    protected int ano = disponivel.get(Calendar.YEAR);



    public Novo(String nome, String endereco, double area, double valor, int dia, int mes,int ano) {
        super(nome, endereco, area, valor);
        this.dia = dia;
        this.mes = mes; 
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }



    public int getMes() {
        return mes;
    }



    public int getAno() {
        return ano;
    }



    @Override
    public double mostrarValorVenda() {
        double ValorNovo;
        ValorNovo = valor * 1.1;
        return ValorNovo;
    }



    @Override
    public String toString() {
        return"Imovel disponível em " + dia +"/" + mes + "/" + ano 
        	+ "\npertence a " + getNome() 
            + "\nestá localizado em " + getEndereco() 
            + "\npossui uma área de " + getArea() + "m²\n"
            + "e tem um valor de R$ " + String.format("%.2f", mostrarValorVenda()) + "\n";
        }

}