package br.fag.aula01.bebidas.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import br.fag.aula01.atendimento.Cliente;
import br.fag.aula01.atendimento.Pagamento;
import br.fag.aula01.bebidas.Bebidas;
import br.fag.aula01.bebidas.types.TipoAgua;
import br.fag.aula01.bebidas.types.TipoRefri;
import br.fag.aula01.bebidas.types.TipoSuco;
import br.fag.aula01.helpers.ValorTotal;

public class ControllBebidas {
    private static final Scanner scanner = new Scanner(System.in);

    public static void outputBebidas() {
        Bebidas bebidas = new Bebidas();
        ValorTotal valorTotal = new ValorTotal();

        int leitor;

        System.out.println("Qual seria a bebida?\n");
        System.out.println("1 - Refrigerante");
        System.out.println("2 - Água");
        System.out.println("3 - Suco");
        System.out.println("4 - Nenhuma");
        leitor = scanner.nextInt();
        ArrayList<Float> valoresBebida = new ArrayList<Float>();
        switch (leitor) {
            case 1:

                System.out.println("Selecione o tipo do refrigerante:");
                for(TipoRefri tipoRefri: bebidas.getTipoRefri()){
                    System.out.printf("%d - %s\n",tipoRefri.ordinal()+1,tipoRefri.getNomedoRefri());
                    valoresBebida.add(tipoRefri.getValordoRefri());
                }
                leitor = scanner.nextInt();

                valorTotal.setValorTotal(valoresBebida.get((leitor - 1)));

                bebidas.setTipo(String.valueOf(leitor));

                break;
            case 2:
                System.out.println("Selecione o tipo da água:");
                for(TipoAgua tipoAgua: bebidas.getTipoAgua()){
                    System.out.printf("%d - %s\n",tipoAgua.ordinal()+1,tipoAgua.getNomedaAgua());
                    valoresBebida.add(tipoAgua.getValordaAgua());
                }
                leitor = scanner.nextInt();

                valorTotal.setValorTotal(valoresBebida.get((leitor - 1)));

                bebidas.setTipo(String.valueOf(leitor));
                break;
            case 3:
                System.out.println("Selecione o tipo do suco:");
                for(TipoSuco tipoSuco: bebidas.getTipoSuco()){
                    System.out.printf("%d - %s\n",tipoSuco.ordinal()+1,tipoSuco.getNomedoSuco());
                    valoresBebida.add(tipoSuco.getValordoSuco());
                }
                leitor = scanner.nextInt();

                valorTotal.setValorTotal(valoresBebida.get((leitor - 1)));
                bebidas.setTipo(String.valueOf(leitor));
                break;
            case 4:
                System.out.println("Ok, a opção de selecionar nenhuma bebida é válida.");
                break;
            default:
                System.out.println("Opção inválida.");
                outputBebidas();
        }
    }
}
