package br.fag.aula01.atendimento.controller;

import br.fag.aula01.atendimento.Cliente;
import br.fag.aula01.atendimento.Pagamento;
import br.fag.aula01.bebidas.controller.ControllBebidas;

import java.util.Calendar;
import java.util.Scanner;

public class ControllerCliente {
    private static final Scanner inputScanner = new Scanner(System.in);
    private static final Pagamento pagamento = new Pagamento();
    private static final Cliente cliente = new Cliente();

    public static void outPut() {
        Calendar time = Calendar.getInstance();
        System.out.println(decodePeriod(time));

        int LeitorTipo;

        System.out.println("Qual seria o tipo de retirada?");
        System.out.println("1 - Delivery");;
        System.out.println("2 - Retirada Balcão");
        System.out.println("3 - La Carte");
        LeitorTipo = inputScanner.nextInt();

        switch (LeitorTipo) {
            case 1:
                setDadosCliente();
                Cliente.setPagamento(getPagamento());
                break;
            case 2:
                setBalcao();
                Cliente.setPagamento(getPagamento());
                break;
            case 3:

            default:
                System.out.println("Opção inválida.");
        }
    }

    private static Pagamento getPagamento() {

        int leitorTipoPagamento;

        System.out.println("Selecione o tipo de pagamento:");
        System.out.println("1 - Débito");
        System.out.println("2 - Crédito");
        System.out.println("3 - Pix");

        leitorTipoPagamento = inputScanner.nextInt();

        switch (leitorTipoPagamento) {
            case 1:
              return criarPagamento("Débito");
            case 2:
                return criarPagamento("Crédito");
            case 3:
                return criarPagamento("Pix");
            default:
                System.out.println("Opção inválida.");
               return null;
        }

    }

    private static Pagamento criarPagamento(String tipo) {

        if(tipo == "Débito"){

            System.out.print("Informe o número do cartão: ");
            Pagamento.setNumeroCartao(inputScanner.next());
            System.out.print("Informe o CVA: ");
            Pagamento.setCVA(inputScanner.nextInt());
            System.out.print("Informe a data de vencimento: ");
            Pagamento.setDataVencimento(inputScanner.nextInt());

        }else if(tipo == "Crédito"){

            System.out.print("Informe o número do cartão: ");
            Pagamento.setNumeroCartao(inputScanner.next());
            System.out.print("Informe o CVA: ");
            Pagamento.setCVA(inputScanner.nextInt());
            System.out.print("Informe a data de vencimento: ");
            Pagamento.setDataVencimento(inputScanner.nextInt());

        } else if (tipo == "Pix") {

            int Leitor;
            System.out.println("Selecione o tipo de chave:");
            System.out.println("1 - CPF");
            System.out.println("2 - Chave Aleatoria");
            System.out.println("3 - Número");
            System.out.println("4 - E-mail");
            Leitor = Integer.parseInt(inputScanner.next());
            switch (Leitor) {
                case 1:
                    System.out.println("Informe seu CPF:");
                    Pagamento.setCPF(inputScanner.next());
                    break;
                case 2:
                    System.out.println("Informe a sua chave aleatória:");
                    Pagamento.setChaveAleatoria(inputScanner.next());
                    break;
                case 3:
                    System.out.println("Informe o seu número de telefone:");
                    Pagamento.setNumero(inputScanner.next());
                    break;
                case 4:
                    System.out.println("Informe o seu E-mail:");
                    Pagamento.setEmail(inputScanner.next());
                    break;
                default:
                    System.out.println("Opção inválida.");
                    return null;
            }
        }else{
            System.out.printf("Nenhuma opção válida");
        }


        Pagamento pagamento = new Pagamento();
        Pagamento.setTipo(tipo);

        return pagamento;
    }

    private static void setDadosCliente() {
        System.out.print("Qual seria o seu nome para colocar no pedido: ");
        cliente.setNome(inputScanner.next());
        System.out.print("Qual seria o telefone para contato: ");
        cliente.setTelefone(inputScanner.next());
        System.out.print("Qual seria o bairro para entrega: ");
        cliente.setBairro(inputScanner.next());
        System.out.print("Qual seria a rua para entrega: ");
        cliente.setRua(inputScanner.next());
        System.out.print("Qual seria o numero da casa para entrega: ");
        cliente.setNumero(inputScanner.next());
    }

    private static void setBalcao() {
        System.out.print("Qual seria o seu nome para colocar no pedido: ");
        cliente.setNome(inputScanner.next());
        System.out.print("Qual seria o telefone para contato: ");
        cliente.setTelefone(inputScanner.next());
    }

    public static String decodePeriod(final Calendar time) {
        String decodedPeriod = null;
        int hour = time.get(Calendar.HOUR_OF_DAY);
        if (hour >= 18) {
            decodedPeriod = "\nBoa noite!\n";
        } else if (hour >= 12) {
            decodedPeriod = "\nBoa tarde!\n";
        } else {
            decodedPeriod = "\nBom dia!\n";
        }
        return decodedPeriod;
    }
}
