package entidades;

public enum Situacao {

    DESOCUPADO(1, "Desocupado"),
    OCUPADO(2,"Ocupado"),
    EM_REFORMA(3, "Em Reforma");


    private int Value;
    private String Desc;

    private Situacao(int AValue, String ADesc) {
        this.Desc = ADesc;
        this.Value = AValue;
    }

    public int getValorSit() {
        return Value;
    }

    public String getSit() {
        return Desc;
    }



}