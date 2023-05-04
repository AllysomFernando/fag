package fag.ally.bilhete;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class SituacaoBilhete {

    Random geradorAleatorio = new Random();
    int numeroAleatorio = geradorAleatorio.nextInt(100);

    private String codigo;
    private String descricao;
    private String situacao;

    public SituacaoBilhete(String situacao,String codigo, String descricao){
        this.situacao = situacao;
        this.descricao = descricao;
        this.codigo = codigo;
    }

    public SituacaoBilhete() {

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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        situacao = situacao;
    }

    public int geradorNumero(){
        Random geradorAleatorio = new Random();
        return geradorAleatorio.nextInt(100);
    }
    public List<SituacaoBilhete> gerarSituacao(){
        List<SituacaoBilhete> situacao = new ArrayList<SituacaoBilhete>(3);
        situacao.add(new SituacaoBilhete("Concluido", String.valueOf(geradorNumero()), "O bilhete esta com estado como concluido"));
        situacao.add(new SituacaoBilhete("Cancelado", String.valueOf(geradorNumero()), "O bilhete esta com estado como cancelado"));
        situacao.add(new SituacaoBilhete("Pendente", String.valueOf(geradorNumero()), "O bilhete esta com estado como pendente"));

        return situacao;
    }



}
