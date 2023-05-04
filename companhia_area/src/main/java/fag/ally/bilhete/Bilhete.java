package fag.ally.bilhete;

import java.util.Random;
import java.util.Scanner;



public class Bilhete {

    private static final Scanner inputScanner = new Scanner(System.in);





    public static void comprar(){

        int LeitorTipo;

        Random gerador = new Random();

        System.out.println("Qual vai ser o tipo de pagamento");

        System.out.println("1 - Débito");
        System.out.println("2 - Crédito");
        System.out.println("3 - PIX");

        LeitorTipo = inputScanner.nextInt();

        System.out.println("Pagamento realizado!");

        System.out.println("O numero do assento é: " + gerador.nextInt(40));


    }











    private int numero;
    private String assento;

    private String passageiro;

    private String horario;

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

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    private String situacao;

}
