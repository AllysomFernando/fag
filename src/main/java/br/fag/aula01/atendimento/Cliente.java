package br.fag.aula01.atendimento;
import java.util.Scanner;
import java.util.Calendar;


public class Cliente {
    private static String nome;
    private static String telefone;
    private static String bairro;
    private static String rua;
    private static String numero;

    private static Pagamento pagamento;

    public static Pagamento getPagamento() {
        return pagamento;
    }

    public static void setPagamento(Pagamento pagamento) {
        Cliente.pagamento = pagamento;
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Cliente.nome = nome;
    }

    public static String getTelefone() {
        return telefone;
    }

    public static void setTelefone(String telefone) {
        Cliente.telefone = telefone;
    }

    public static String getBairro() {
        return bairro;
    }

    public static void setBairro(String bairro) {
        Cliente.bairro = bairro;
    }

    public static String getRua() {
        return rua;
    }

    public static void setRua(String rua) {
        Cliente.rua = rua;
    }

    public static String getNumero() {
        return numero;
    }

    public static void setNumero(String numero) {
        Cliente.numero = numero;
    }


}