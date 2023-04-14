package br.fag.aula01.atendimento.controller;

import br.fag.aula01.atendimento.Cliente;
import br.fag.aula01.atendimento.Pagamento;
import br.fag.aula01.bebidas.controller.ControllBebidas;
import br.fag.aula01.helpers.ValorTotal;
import br.fag.aula01.pizza.controller.ControllerPizza;

import java.util.Calendar;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ControllerCliente {
    private static final Scanner inputScanner = new Scanner(System.in);
    private static final Pagamento pagamento = new Pagamento();
    private static final Cliente cliente = new Cliente();

    public static void outPut() {
        Calendar time = Calendar.getInstance();
        System.out.println(decodePeriod(time));

        ValorTotal valorTotal = new ValorTotal();

        int LeitorTipo;

        System.out.println("Qual seria o tipo de retirada?");
        System.out.println("1 - Delivery");;
        System.out.println("2 - Retirada Balcão");
        System.out.println("3 - La Carte");
        LeitorTipo = inputScanner.nextInt();


        switch (LeitorTipo) {
            case 1:
                setDadosCliente();
                ControllerPizza.adicionarPizza();
                ControllBebidas.outputBebidas();
                System.out.println("O valor total do pedido é: " + valorTotal.getValorTotal() + "R$ \n");

                Cliente.setPagamento(getPagamento());

                System.out.println("Deseja confirmar o pedido?\n[1] Sim\n[2] Não");
                LeitorTipo = inputScanner.nextInt();

                switch (LeitorTipo){
                    case 1:
                        System.out.println("Pedido confirmado.");
                        break;
                    case 2:
                        System.out.println("Ok, tente novamente.");
                        setDadosCliente();
                        break;
                    default:
                        System.out.println("Input inválido, tente novamente.");
                        setDadosCliente();
                        break;
                }

                break;
            case 2:


                setBalcao();
                ControllerPizza.adicionarPizza();
                ControllBebidas.outputBebidas();
                System.out.println("O valor total do pedido é: " + valorTotal.getValorTotal() + "R$ \n");
                Cliente.setPagamento(getPagamento());
                int leitoTipo;

                System.out.println("Deseja confirmar o pedido?\n[1] Sim\n[2] Não");
                leitoTipo = inputScanner.nextInt();

                switch (leitoTipo){
                    case 1:
                        System.out.println("Pedido confirmado.");
                        break;
                    case 2:
                        System.out.println("Ok, tente novamente.");
                        setBalcao();
                        break;
                    default:
                        System.out.println("Input inválido, tente novamente.");
                        setBalcao();
                        break;
                }
                break;

            case 3:
                ControllerPizza.adicionarPizza();
                ControllBebidas.outputBebidas();
                System.out.println("O valor total do pedido é: " + valorTotal.getValorTotal() + "R$ \n");
                Cliente.setPagamento(getPagamento());
                System.out.println("Deseja confirmar o pedido?\n[1] Sim\n[2] Não");
                leitoTipo = inputScanner.nextInt();;
                switch (leitoTipo){
                    case 1:
                        System.out.println("Pedido confirmado.");
                        break;
                    case 2:
                        System.out.println("Ok, tente novamente.");
                        ControllerPizza.adicionarPizza();
                        break;
                    default:
                        System.out.println("Input inválido, tente novamente.");
                        ControllerPizza.adicionarPizza();
                        break;
                }
                break;
            default:
                System.out.println("Opção inválida.");
                ControllerCliente.outPut();
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
          break;
        }

        return null;
    }

    private static Pagamento criarPagamento(String tipo) {

        if(tipo == "Débito"){

            System.out.print("Informe o número do cartão: ");
            Pagamento.setNumeroCartao(inputScanner.next());
            System.out.print("Informe o CVA: ");
            Pagamento.setCVA(inputScanner.nextInt());
            System.out.print("Informe a data de vencimento: ");
            Pagamento.setDataVencimento(inputScanner.next());


        }else if(tipo == "Crédito"){

            System.out.print("Informe o número do cartão: ex: 2345662347652834");
            Pagamento.setNumeroCartao(inputScanner.nextLine());
            System.out.print("Informe o CVA: ex: 120");
            Pagamento.setCVA(inputScanner.nextInt());
            System.out.print("Informe a data de vencimento: ex: 2901");
            Pagamento.setDataVencimento(inputScanner.nextLine());

        } else if (tipo == "Pix") {

            int Leitor;
            System.out.println("Selecione o tipo de chave:");
            System.out.println("1 - CPF ex: 11046567865");
            System.out.println("2 - Chave Aleatoria: ex: h123jg4j12378adasjdasasf123125122");
            System.out.println("3 - Número: ex: 45999171638");
            System.out.println("4 - E-mail: ex: user@gmail.com");
            Leitor = parseInt(inputScanner.next());
            switch (Leitor) {
                case 1:
                    System.out.println("Informe seu CPF: ex: 11046567865");
                    Pagamento.setCPF(inputScanner.next());
                    break;
                case 2:
                    System.out.println("Informe a sua chave aleatória: ex: h123jg4j12378adasjdasasf123125122");
                    Pagamento.setChaveAleatoria(inputScanner.next());
                    break;
                case 3:
                    System.out.println("Informe o seu número de telefone: ex: 45999171638");
                    Pagamento.setNumero(inputScanner.next());
                    break;
                case 4:
                    System.out.println("Informe o seu E-mail: ex: user@gmail.com");
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
        System.out.print("\n");
        cliente.setNome(inputScanner.nextLine());
        System.out.print("Qual seria o seu nome para colocar no pedido: ex: Allysom \n");
        cliente.setNome(inputScanner.nextLine());
        System.out.print("Qual seria o telefone para contato: ex: 45999142392 \n");
        cliente.setTelefone(inputScanner.nextLine());
        System.out.print("Qual seria o bairro para entrega: ex: Consolata \n");
        cliente.setBairro(inputScanner.nextLine());
        System.out.print("Qual seria a rua para entrega: ex: Alcides-Paese \n");
        cliente.setRua(inputScanner.nextLine());
        System.out.print("Qual seria o numero da casa para entrega: ex: 120 \n");
        cliente.setNumero(inputScanner.nextLine());
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