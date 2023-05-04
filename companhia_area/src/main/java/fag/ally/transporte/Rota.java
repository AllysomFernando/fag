package fag.ally.transporte;

import java.util.Scanner;

public class Rota {
    static Scanner inputScanner = new Scanner(System.in);
    private String codigo;
    private String descricao;


    private String rota;

    public Rota(String codigo, String descricao, String rota) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.rota = rota;
    }



    public String getPonte() {
        return rota;
    }

    public void setPonte(String ponte) {
        this.rota = ponte;
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




}
