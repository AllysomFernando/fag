package br.fag.aula01.atendimento;

import java.util.Date;

public class Pagamento{

    private static Enum tipo;

    public static Enum getTipo() {
        return tipo;
    }

    public static void setTipo(Enum tipo) {
        Pagamento.tipo = tipo;
    }

    public static String getNumeroCartao() {
        return NumeroCartao;
    }

    public static void setNumeroCartao(String numeroCartao) {
        NumeroCartao = numeroCartao;
    }

    public static Integer getCVA() {
        return CVA;
    }

    public static void setCVA(Integer CVA) {
        Pagamento.CVA = CVA;
    }

    public static Date getDataVencimento() {
        return DataVencimento;
    }

    public static void setDataVencimento(Date dataVencimento) {
        DataVencimento = dataVencimento;
    }

    private static String NumeroCartao;

    private static Integer CVA;

    private static Date DataVencimento;

    public Pagamento(){}
}
