package br.fag.aula01.atendimento;

public class Pagamento{

    private static String tipo;
    public static String getTipo() {
        return tipo;
    }

    public static void setTipo(String tipo) {
        Pagamento.tipo = tipo;
    }

    public static String getNumeroCartao() {
        return NumeroCartao;
    }

    public static void setNumeroCartao(String numeroCartao) {
        NumeroCartao = numeroCartao;
    }

    public static Integer getCVA() {
        return CVA;
    }

    public static void setCVA(Integer CVA) {
        Pagamento.CVA = CVA;
    }

    public static int getDataVencimento() {
        return DataVencimento;
    }

    public static void setDataVencimento(int dataVencimento) {
        DataVencimento = dataVencimento;
    }

    private static String NumeroCartao;

    private static Integer CVA;

    private static int DataVencimento;

    private static String CPF;
    private static String chaveAleatoria;
    private static String numero;
    private static String email;

    public static String getCPF() {
        return CPF;
    }

    public static void setCPF(String CPF) {
        Pagamento.CPF = CPF;
    }

    public static String getChaveAleatoria() {
        return chaveAleatoria;
    }

    public static void setChaveAleatoria(String chaveAleatoria) {
        Pagamento.chaveAleatoria = chaveAleatoria;
    }

    public static String getNumero() {
        return numero;
    }

    public static void setNumero(String numero) {
        Pagamento.numero = numero;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Pagamento.email = email;
    }

    public Pagamento(){}
}
