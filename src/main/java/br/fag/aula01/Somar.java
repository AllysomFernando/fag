package br.fag.aula01;

import java.util.Scanner;

public class Somar implements OperacaoMatematica {

    @Override
    public void equal() {
        Scanner scanner = new Scanner(System.in);
        int primeiroValor = 0;
        int segundoValor = 0;
        System.out.println("Coloque o primeiro valor para fazer a operação de soma: ");

        while(!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
            scanner.next();
        }
        primeiroValor = scanner.nextInt();
        System.out.println("Coloque o segundo valor para fazer a operação de soma: ");

        while(!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
            scanner.next();
        }
        segundoValor = scanner.nextInt();

        int resultado = 0;

        resultado = primeiroValor + segundoValor;

        System.out.println("O seu resultado é: " + resultado);
    }
}
