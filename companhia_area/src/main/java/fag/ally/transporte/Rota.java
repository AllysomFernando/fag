package fag.ally.transporte;

import fag.ally.horario.Horario;

import java.util.Random;
import java.util.Scanner;

public class Rota {
    private String codigo;
    private String descricao;
    private String rota;


    public static Rota gerarRota() {
        Random gerador = new Random();
        Scanner scanner = new Scanner(System.in);
        Rota rota = new Rota();
        rota.setCodigo(String.valueOf(gerador.nextInt(1000)));
        rota.setDescricao("Descrição da rota " + rota.getCodigo());
        System.out.println("Digite a rota:");
        rota.setRota(scanner.nextLine());
        Horario horario = new Horario();
        System.out.println("O codigo da sua data é: " + horario.getCodigo());
        System.out.println("A data da usa partida é: " + horario.getDataPartida());
        System.out.println("A data da sua chegada é: " + horario.getDataChegada());
        return rota;
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

    public String getRota() {
        return rota;
    }

    public void setRota(String rota) {
        this.rota = rota;
    }
}