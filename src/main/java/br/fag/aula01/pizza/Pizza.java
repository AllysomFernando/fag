package br.fag.aula01.pizza;

import br.fag.aula01.status.Status;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String nome;
    private Status sabor;
    private Float preco;

    private List<SaborSalgada> sabores;
    private List<SaborDoce> saboresDoces;


    public List<SaborSalgada> getSaboresSalgada(){
        this.sabores = new ArrayList<>();
        this.sabores.addAll(List.of(SaborSalgada.values()));
        return this.sabores;
    }

    public List<SaborDoce> getSaboresDoces(){
        this.sabores = new ArrayList<>();
        this.saboresDoces.addAll(List.of(SaborDoce.values()));
        return this.saboresDoces;
    }

public Pizza(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Status getSabor() {
        return sabor;
    }

    public void setSabor(Status sabor) {
        this.sabor = sabor;
    }
}

