package fag.ally.horario;

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

    private static String gerarCodigo() {
        Random geradorAleatorio = new Random();
        return String.valueOf(geradorAleatorio.nextInt(100));
    }

    public static List<Horario> criarClasseVoo() {
        List<Horario> tiposClasseVoo = new ArrayList<>();
        tiposClasseVoo.add(new Horario(gerarCodigo(), LocalDate.of(2023, 1, 22), LocalDate.of(2023, 2, 12), "Economica"));
        tiposClasseVoo.add(new Horario(gerarCodigo(), LocalDate.of(2023, 1, 22), LocalDate.of(2023, 2, 12), "Executiva"));
        tiposClasseVoo.add(new Horario(gerarCodigo(), LocalDate.of(2023, 1, 22), LocalDate.of(2023, 2, 12), "Primeira-Classe"));


        return tiposClasseVoo;
    }

    public static LocalDate gerarDataAleatoria() {
        LocalDate dataInicial = LocalDate.of(2023, 1, 30);
        LocalDate dataFinal = LocalDate.of(2023, 12, 30);
        long dias = ChronoUnit.DAYS.between(dataInicial, dataFinal);
        long diasAleatorios = ThreadLocalRandom.current().nextLong(dias + 1);
        return dataInicial.plusDays(diasAleatorios);
    }
}
