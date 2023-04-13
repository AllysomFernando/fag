package br.fag.aula01.bebidas.controller;

import java.util.Arrays;
import java.util.Scanner;

import br.fag.aula01.atendimento.Cliente;
import br.fag.aula01.atendimento.Pagamento;
import br.fag.aula01.bebidas.Bebidas;
import br.fag.aula01.bebidas.types.TipoAgua;
import br.fag.aula01.bebidas.types.TipoRefri;
import br.fag.aula01.bebidas.types.TipoSuco;

public class ControllBebidas {
    private static final Scanner scanner = new Scanner(System.in);

    public static void outputBebidas() {
        Bebidas bebidas = new Bebidas();

        int leitor;

        System.out.println("Qual seria a bebida?\n");
        System.out.println("1 - Refrigerante");
        System.out.println("2 - Água");
        System.out.println("3 - Suco");
        System.out.println("4 - Nenhuma");
        leitor = scanner.nextInt();

        switch (leitor) {
            case 1:
                System.out.println("Selecione o tipo do refrigerante:");
                for(TipoRefri tipoRefri: bebidas.getTipoRefri()){
                    System.out.printf("%d - %s\n",tipoRefri.ordinal()+1,tipoRefri.getNomedoRefri());
                }
                leitor = scanner.nextInt();
                bebidas.setTipo(String.valueOf(leitor));
                break;
            case 2:
                System.out.println("Selecione o tipo da água:");
                for(TipoAgua tipoAgua: bebidas.getTipoAgua()){
                    System.out.printf("%d - %s\n",tipoAgua.ordinal()+1,tipoAgua.getNomedaAgua());
                }
                leitor = scanner.nextInt();
                bebidas.setTipo(String.valueOf(leitor));
                break;
            case 3:
                System.out.println("Selecione o tipo do suco:");
                for(TipoSuco tipoSuco: bebidas.getTipoSuco()){
                    System.out.printf("%d - %s\n",tipoSuco.ordinal()+1,tipoSuco.getNomedoSuco());
                }
                leitor = scanner.nextInt();
                bebidas.setTipo(String.valueOf(leitor));
                break;
            case 4:
                System.out.println("Ok, a opção de selecionar nenhuma bebida é válida.");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }
}
