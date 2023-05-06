package br.fag.aula01;

import java.util.Scanner;

public class Divisao implements OperacaoMatematica {

    @Override
    public void operacao() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int primeiroValor = verificacao(scanner);

        System.out.print("Digite o segundo valor (não pode ser zero ou negativo): ");
        int segundoValor = lerInteiroPositivo(scanner);

        int resultado = primeiroValor / segundoValor;

        System.out.println("O resultado da divisão é: " + resultado);
    }
    @Override
    public int verificacao(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
            scanner.next();
        }
        return scanner.nextInt();
    }
    private int lerInteiroPositivo(Scanner scanner) {
        while (true) {
            int valor = verificacao(scanner);
            if (valor > 0) {
                return valor;
            } else {
                System.out.print("Valor inválido. Digite um número positivo: ");
            }
        }
    }

}
