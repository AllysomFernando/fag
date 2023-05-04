package fag.ally.transporte;

import java.util.Random;

public class CompanhiaAerea {
    private String codigo;
    private String descricao;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static CompanhiaAerea gerarCompanhiaAerea() {
        CompanhiaAerea companhia = new CompanhiaAerea();
        Random random = new Random();
        companhia.setCodigo("CIA-" + random.nextInt(1000));
        companhia.setDescricao("Companhia " + (random.nextInt(20) + 1));
        return companhia;
    }
}
