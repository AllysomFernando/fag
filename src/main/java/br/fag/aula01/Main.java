package br.fag.aula01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leitor = 0;
        System.out.println("Escolha a operação matemática que você deseja realizar: ");
        System.out.println("=======================");
        while (leitor < 1 || leitor > 4) {
            System.out.println("Escolha uma operação:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão \n");
            leitor = scanner.nextInt();
            switch (leitor) {
                case 1:
                    Somar somar = new Somar();
                    somar.operacao();
                    if(verificarSimouNao()) {
                        main(args);
                    }

                    break;
                case 2:
                    Subtracao subtracao = new Subtracao();
                    subtracao.operacao();
                    if (verificarSimouNao()) {
                        main(args);
                    }
                    break;
                case 3:
                    Multiplicacao multiplicacao = new Multiplicacao();
                    multiplicacao.operacao();
                    if (verificarSimouNao()) {
                        main(args);
                    }
                    break;
                case 4:
                    Divisao divisao = new Divisao();
                    divisao.operacao();
                    if (verificarSimouNao()) {
                        main(args);
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 4.");
                    break;
            }
        }
    }
    public static boolean verificarSimouNao(){

        System.out.println("Deseja fazer uma nova operação? 1 - [S] / 2 - [N]");
        Scanner scanner = new Scanner(System.in);
        int leitor = scanner.nextInt();
        return leitor == 1;
    }
}
