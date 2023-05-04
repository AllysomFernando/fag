package fag.ally.transporte;

import java.util.Random;

public class Aeroporto {
    private String codigo;
    private String descricao;
    private String sigla;

    public void gerarValoresAleatorios() {
        Random random = new Random();

        String codigo = "";
        for (int i = 0; i < 4; i++) {
            codigo += String.valueOf(random.nextInt(10));
        }
        setCodigo(codigo);

        String descricao = "";
        for (int i = 0; i < 10; i++) {
            char c = (char) (random.nextInt(26) + 'a');
            descricao += c;
        }
        setDescricao(descricao);

        String sigla = "";
        for (int i = 0; i < 3; i++) {
            char c = (char) (random.nextInt(26) + 'a');
            sigla += c;
        }
        setSigla(sigla);
    }

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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}


