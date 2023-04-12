package br.fag.aula01.bebidas.controller;

import br.fag.aula01.atendimento.Cliente;
import br.fag.aula01.atendimento.Pagamento;

import java.util.Scanner;

public class ControllBebidas {
    static Pagamento pagamento = new Pagamento();
    static Cliente usuario = new Cliente();

    public static void outPutBebidas(){
        Scanner scanner = new Scanner(System.in);

        int leitor;
        int tipo;


        System.out.println("Qual seria a bebida? \n");
        System.out.println("1 Refrigerante \n2 Água \n3 Suco \n4 Nenhum");
        leitor = scanner.nextInt();

        if(leitor == 1){
            int leitor2;

            Scanner inputBebida = new Scanner(System.in);

            switch(leitor){
                case 1:
                    System.out.println("Selecione o tipo do refrigente");

            }

        }
    }
}
