package br.fag.aula01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a operação matemática que você deseja realizar: ");
        System.out.println("=======================");
        System.out.println("1 - Adição, 2 - Subtração, 3 - Multiplicação, 4 - Divisão");

        int leitor = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            if (!scanner.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro válido.");
                scanner.next();
            } else {
                leitor = scanner.nextInt();
                if (leitor == 0) {
                    System.out.println("Valor inválido. Por favor, escolha uma opção diferente de zero.");
                } else {
                    entradaValida = true;
                }
            }
        }

        switch (leitor) {
            case 1:
                Somar somar = new Somar();
                somar.operacao();
                break;
            case 2:
                Subtracao subtracao = new Subtracao();
                subtracao.operacao();
                break;
            case 3:
                Multiplicacao multiplicacao = new Multiplicacao();
                multiplicacao.operacao();
                break;
            case 4:
                Divisao divisao = new Divisao();
                divisao.operacao();
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 4.");
                break;
        }
    }
}
