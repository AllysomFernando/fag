package fag.ally.transporte;

public class Aviao {
    private String codigo;
    private String carga;
    private int quantidadeEconomica;

    private int quantidadeExecutiva;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCarga() {
        return carga;
    }

    public void setCarga(String carga) {
        this.carga = carga;
    }

    public int getQuantidadeEconomica() {
        return quantidadeEconomica;
    }

    public void setQuantidadeEconomica(int quantidadeEconomica) {
        this.quantidadeEconomica = quantidadeEconomica;
    }

    public int getQuantidadeExecutiva() {
        return quantidadeExecutiva;
    }

    public void setQuantidadeExecutiva(int quantidadeExecutiva) {
        this.quantidadeExecutiva = quantidadeExecutiva;
    }

    public int getQuantidadePrimeira() {
        return quantidadePrimeira;
    }

    public void setQuantidadePrimeira(int quantidadePrimeira) {
        this.quantidadePrimeira = quantidadePrimeira;
    }

    private int quantidadePrimeira;
}
