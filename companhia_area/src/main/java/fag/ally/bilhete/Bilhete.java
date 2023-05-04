package fag.ally.bilhete;

import fag.ally.pessoa.Pessoa;

import java.util.Calendar;

public class Bilhete {

    SituacaoBilhete situacaoBilhete = new SituacaoBilhete();
    private int numero;
    private String assento;

    private String passageiro;

    private String horario;

    public Bilhete(int numero, String assento, String passageiro, String horario) {
        this.numero = numero;
        this.assento = assento;
        this.passageiro = passageiro;
        this.horario = horario;
    }

    public static String decodePeriod(final Calendar time) {
        String decodedPeriod = null;
        int hour = time.get(Calendar.HOUR_OF_DAY);
        if (hour >= 18) {
            decodedPeriod = "\nBoa noite!\n";
        } else if (hour >= 12) {
            decodedPeriod = "\nBoa tarde!\n";
        } else {
            decodedPeriod = "\nBom dia!\n";
        }
        return decodedPeriod;
    }

    public static void gerarBilhete(){
        Calendar time = Calendar.getInstance();
        System.out.println(decodePeriod(time));
        Pessoa.gerarPessoa();

    }






    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAssento() {
        return assento;
    }

    public void setAssento(String assento) {
        this.assento = assento;
    }

    public String getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(String passageiro) {
        this.passageiro = passageiro;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }



    //escolhe um assento, horario, destino,












}
