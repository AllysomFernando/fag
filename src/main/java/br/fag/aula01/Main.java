package br.fag.aula01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a opercação matematica que você deseja realizar: ");
        System.out.println("=======================");
        System.out.println("1 - Adição, 2 - Subtração, 3 - Multiplicação, 4 - Divisão");
        int leitor = scanner.nextInt();
        if(leitor == 1){
            Somar somar = new Somar();
            somar.equal();
        }else if(leitor == 2){
            Subtracao subtracao = new Subtracao();
            subtracao.equal();
        }else if(leitor == 3){
            Multiplicacao multiplicacao = new Multiplicacao();
            multiplicacao.equal();
        }else if(leitor == 4){
            Divisao divisao = new Divisao();
            divisao.equal();
        }else{
            System.out.println("Tente colocar um valor valido");
        }
    }
}