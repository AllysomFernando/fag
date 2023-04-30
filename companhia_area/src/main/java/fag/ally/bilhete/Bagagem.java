package fag.ally.bilhete;

public class Bagagem {
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getBilhete() {
        return bilhete;
    }



    private String codigo;
    private String tipo;
    private String peso;
    private String bilhete;
}
