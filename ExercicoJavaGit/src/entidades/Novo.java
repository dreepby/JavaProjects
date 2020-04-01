package entidades;

import java.util.Calendar;


public final class Novo extends Imovel {

    protected Calendar disponivel = Calendar.getInstance();
    protected int Dia = disponivel.get(Calendar.DAY_OF_MONTH);
    protected int Mes = disponivel.get(Calendar.MONTH);
    protected int Ano = disponivel.get(Calendar.YEAR);



    public Novo(String ANome, String AEndereco, double AArea, double AValor, int ADia, int AMes, int AAno) {
        super(ANome, AEndereco, AArea, AValor);
        this.Dia = ADia;
        this.Mes = AMes; 
        this.Ano = AAno;
    }

    public int getDia() {
        return Dia;
    }

    public int getMes() {
        return Mes;
    }

    public int getAno() {
        return Ano;
    }

    @Override
    public double mostrarValorVenda() {
        return Valor + (Valor * 1.1);
    }


    @Override
    public String toString() {
        return"Imovel disponível em: " + Dia + "/" + Mes + "/" + Ano 
        	+ "\nPertence a: " + getNome() 
            + "\nLocalização: " + getEndereco() 
            + "\nÁrea:" + getArea() + "m²\n"
            + "Valor: R$" + String.format("%.2f", mostrarValorVenda()) + "\n";
        }

}