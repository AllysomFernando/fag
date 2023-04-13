package br.fag.aula01.bebidas;

import br.fag.aula01.bebidas.types.TipoAgua;
import br.fag.aula01.bebidas.types.TipoRefri;
import br.fag.aula01.bebidas.types.TipoSuco;
import br.fag.aula01.pizza.types.SaborDoce;
import br.fag.aula01.pizza.types.SaborSalgada;

import java.util.ArrayList;
import java.util.List;

public class Bebidas {
    private static String tipo;

    private static String valordoRefri;

    private static String quantidade;

    private static String marca;


    private List<TipoRefri> refri;


    private List<TipoSuco> suco;

    private List<TipoAgua> agua;

    public Bebidas(){
        this.refri = new ArrayList<>();
        this.refri.addAll(List.of(TipoRefri.values()));
        this.suco = new ArrayList<>();
        this.suco.addAll(List.of(TipoSuco.values()));
        this.agua = new ArrayList<>();
        this.agua.addAll(List.of(TipoAgua.values()));
    }
    public List<TipoRefri> getTipoRefri(){
        return refri;
    }
    public List<TipoSuco> getTipoSuco(){
        return suco;
    }
    public List<TipoAgua> getTipoAgua(){
        return agua;
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
