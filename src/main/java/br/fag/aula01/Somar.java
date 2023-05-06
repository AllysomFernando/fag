package br.fag.aula01;

import java.util.Scanner;

public class Somar implements OperacaoMatematica {
    @Override
    public void operacao() {
        Scanner scanner = new Scanner(System.in);
        int primeiroValor = 0;
        int segundoValor = 0;
        System.out.println("Coloque o primeiro valor para fazer a operação de soma: ");

        primeiroValor = verificacao(scanner);
        System.out.println("Coloque o segundo valor para fazer a operação de soma: ");
        segundoValor = verificacao(scanner);

        int resultado = primeiroValor + segundoValor;


        System.out.println("O seu resultado é: " + resultado);
    }
    @Override
    public int verificacao(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
            scanner.next();
        }
        return scanner.nextInt();
    }
}
