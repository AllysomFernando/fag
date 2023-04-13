package br.fag.aula01.pizza;

import br.fag.aula01.bebidas.types.TipoRefri;
import br.fag.aula01.pizza.types.SaborDoce;
import br.fag.aula01.pizza.types.SaborSalgada;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private List<SaborSalgada> sabores;
    private List<SaborDoce> saboresDoces;






public Pizza(){
    this.saboresDoces = new ArrayList<>();
    this.saboresDoces.addAll(List.of(SaborDoce.values()));
    this.sabores = new ArrayList<>();
    this.sabores.addAll(List.of(SaborSalgada.values()));
}

    public List<SaborDoce> getSaboresDoces(){
        return this.saboresDoces;
    }


    public List<SaborSalgada> getSaboresSalgada(){
        return this.sabores;
    }


    public void setNome(String nome) {
    }

}

