package fag.ally.horario;

import fag.ally.transporte.Aviao;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Horario {
    private String codigo;
    private LocalDate dataPartida;
    private LocalDate dataChegada;
    private String classeVoo;

    public Horario(String codigo, LocalDate dataPartida, LocalDate dataChegada, String classeVoo) {
        this.codigo = codigo;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        this.classeVoo = classeVoo;
    }

    public Horario() {

    }


    private static String gerarCodigo() {
        Random geradorAleatorio = new Random();
        return String.valueOf(geradorAleatorio.nextInt(100));
    }

    public static LocalDate gerarDataAleatoria() {
        LocalDate dataPartida = LocalDate.of(2023, 1, 30);
        LocalDate dataChegada = LocalDate.of(2023, 12, 30);
        long dias = ChronoUnit.DAYS.between(dataPartida, dataChegada);
        long diasAleatorios = ThreadLocalRandom.current().nextLong(dias + 1);
        return dataPartida.plusDays(diasAleatorios);
    }


    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(LocalDate dataPartida) {
        this.dataPartida = dataPartida;
    }

    public LocalDate getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(LocalDate dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getClasseVoo() {
        return classeVoo;
    }

    public void setClasseVoo(String classeVoo) {
        this.classeVoo = classeVoo;
    }
}
