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
        int leitorTipoRetirada = getTipoRetirada();

        if (leitorTipoRetirada == 1) { // Delivery
            cliente.setPagamento(getPagamento());
            setDadosCliente();

        } else if (leitorTipoRetirada == 2) { // Retirada Balcao
            setDadosClienteBalcao();
            cliente.setPagamento(getPagamento());

        } else { // La Carte

        }

    }

    private static int getTipoRetirada() {
        Calendar time = Calendar.getInstance();
        System.out.println(decodePeriod(time));

        System.out.println("Qual seria o tipo de retirada?");
        System.out.println("1 - Delivery");
        System.out.println("2 - Retirada Balcão");
        System.out.println("3 - La Carte");

        return inputScanner.nextInt();
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
                Pagamento pagamento = criarPagamento("Crédito");
                System.out.print("Informe o CVA: ");
                pagamento.setCVA(inputScanner.nextInt());
                return pagamento;
            default:
                return criarPagamento("Pix");
        }
    }

    private static Pagamento criarPagamento(String tipo) {
        System.out.print("Informe o número do cartão: ");
        String numeroCartao = inputScanner.next();

        Pagamento pagamento = new Pagamento();
        pagamento.setTipo(tipo);
        pagamento.setNumeroCartao(numeroCartao);

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

    private static void setDadosClienteBalcao() {
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
