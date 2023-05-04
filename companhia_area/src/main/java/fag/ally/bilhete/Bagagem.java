package fag.ally.bilhete;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Bagagem {
    private String codigo;
    private String tipo;
    private int peso;

    public Bagagem(String codigo, String tipo, int peso) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.peso = peso;
    }

    public static List<Bagagem> criarTiposDeBagagem() {
        List<Bagagem> tiposDeBagagem = new ArrayList<>();
        tiposDeBagagem.add(new Bagagem(gerarCodigo(), "De mão", gerarPeso()));
        tiposDeBagagem.add(new Bagagem(gerarCodigo(), "De rodinha", gerarPeso()));
        return tiposDeBagagem;
    }

    public static void colocarBagagem() {
        List<Bagagem> tiposDeBagagem = criarTiposDeBagagem();

        System.out.println("Qual é o seu tipo de bagagem?");
        for (int i = 0; i < tiposDeBagagem.size(); i++) {
            System.out.printf("%d. %s%n", i + 1, tiposDeBagagem.get(i).getTipo());
        }

        int tipoEscolhido = obterEscolhaDoUsuario(1, tiposDeBagagem.size());
        Bagagem bagagemEscolhida = tiposDeBagagem.get(tipoEscolhido - 1);

        System.out.println("Coloque a sua bagagem na balança...");
        System.out.println("----- Pesando ------");
        System.out.println("O peso da sua bagagem é: " + bagagemEscolhida.getPeso() + " kg");

        if (bagagemEscolhida.getPeso() <= 30) {
            System.out.println("A sua bagagem está leve... Pode passar.");
        } else if (bagagemEscolhida.getPeso() > 31 && bagagemEscolhida.getPeso() <= 80) {
            System.out.println("A sua bagagem está média... Pode passar.");
        } else {
            System.out.println("A sua bagagem está pesada... Precisa pagar uma taxa para poder embarcar.");
        }
    }

    private static String gerarCodigo() {
        Random geradorAleatorio = new Random();
        return String.valueOf(geradorAleatorio.nextInt(100));
    }

    private static int gerarPeso() {
        Random geradorAleatorio = new Random();
        return geradorAleatorio.nextInt(100);
    }

    private static int obterEscolhaDoUsuario(int opcaoMinima, int opcaoMaxima) {
        Scanner scanner = new Scanner(System.in);
        int escolha;
        do {
            System.out.printf("Escolha uma opção de %d a %d: ", opcaoMinima, opcaoMaxima);
            escolha = scanner.nextInt();
        } while (escolha < opcaoMinima || escolha > opcaoMaxima);
        return escolha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
