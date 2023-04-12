package br.fag.aula01.bebidas;

import br.fag.aula01.bebidas.types.TipoRefri;

import java.util.ArrayList;
import java.util.List;

public class Bebidas {
    private static String tipo;

    private static String valordoRefri;

    private static String quantidade;

    private static String marca;

    private List<TipoRefri> bebidas;

    public List<TipoRefri> getTipoBebidas(){
        this.bebidas = new ArrayList<>();
        this.bebidas.addAll(List.of(TipoRefri.values()));
        return this.bebidas;
    }










    public static String getTipo() {
        return tipo;
    }

    public static void setTipo(String tipo) {
        Bebidas.tipo = tipo;
    }

    public static String getvalordoRefri() {
        return valordoRefri;
    }

    public static void setvalordoRefri(String valordoRefri) {
        Bebidas.valordoRefri = valordoRefri;
    }

    public static String getQuantidade() {
        return quantidade;
    }

    public static void setQuantidade(String quantidade) {
        Bebidas.quantidade = quantidade;
    }

    public static String getMarca() {
        return marca;
    }

    public static void setMarca(String marca) {
        Bebidas.marca = marca;
    }
}
