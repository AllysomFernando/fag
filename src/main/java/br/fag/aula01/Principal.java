package br.fag.aula01;


import java.util.Scanner;
public class Principal implements Verificacao{
    public void calculadora(){
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
            leitor = verificacao(scanner);
            switch (leitor) {
                case 1 -> {
                    Somar somar = new Somar();
                    somar.operacao();
                    if (verificarSimouNao()) {
                        calculadora();
                    }
                }
                case 2 -> {
                    Subtracao subtracao = new Subtracao();
                    subtracao.operacao();
                    if (verificarSimouNao()) {
                        calculadora();
                    }
                }
                case 3 -> {
                    Multiplicacao multiplicacao = new Multiplicacao();
                    multiplicacao.operacao();
                    if (verificarSimouNao()) {
                        calculadora();
                    }
                }
                case 4 -> {
                    Divisao divisao = new Divisao();
                    divisao.operacao();
                    if (verificarSimouNao()) {
                        calculadora();
                    }
                }
                default -> System.out.println("Opção inválida. Por favor, escolha uma opção entre 1 e 4.");
            }
        }
    }


    public static boolean verificarSimouNao(){
        System.out.println("Deseja fazer uma nova operação? 1 - [S] / 2 - [N]");
        Scanner scanner = new Scanner(System.in);
        int leitor = scanner.nextInt();
        return leitor == 1;
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
