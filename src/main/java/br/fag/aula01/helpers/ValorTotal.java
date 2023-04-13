package br.fag.aula01.helpers;

public class ValorTotal {

    public static float valorTotal;

    public static float getValorTotal() {
        return valorTotal;
    }

    public static void setValorTotal(float valorTotal) {
        ValorTotal.valorTotal += valorTotal;
    }
}

