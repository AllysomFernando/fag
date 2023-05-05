package br.fag.aula01;

import java.util.Scanner;

public class Divisao implements OperacaoMatematica {
    @Override
    public void equal() {
        Scanner scanner = new Scanner(System.in);
        int primeiroValor = 0;
        int segundoValor = 0;
        System.out.println("Coloque o primeiro valor para fazer a operação de divisão: ");

        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
            scanner.next();
        }
        primeiroValor = scanner.nextInt();
        System.out.println("Coloque o segundo valor para fazer a operação de divisão: *Lembrando que um número não pode ser dividido pro zero  ou negativo");

        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
            scanner.next();
        }
        segundoValor = scanner.nextInt();
        if(segundoValor <= 0){
            System.out.println("Por favor coloque um númeor que não seja zero ou negativo");
        }else {
            int resultado = 0;

            resultado = primeiroValor / segundoValor;

            System.out.println("O seu resultado é: " + resultado);
        }

    }
}

