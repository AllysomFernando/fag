package br.fag.aula01.atendimento.controller;

import br.fag.aula01.atendimento.Cliente;
import br.fag.aula01.atendimento.Pagamento;

import java.util.Calendar;
import java.util.Scanner;

public class ControllerCliente {
    static Pagamento pagamento = new Pagamento();
    static Cliente usuario = new Cliente();
    public static void outPut() {

        Scanner inputUser = new Scanner(System.in);
        int leitor;
        int tipo;


        Calendar time = Calendar.getInstance();
        System.out.print(decodePeriod(time));
        System.out.println("Qual seria o tipo de retirada? \n");
        System.out.println("1 Delivery \n2 Retirada Balcao \n3 La Carte\n");
        leitor = inputUser.nextInt();

        if(leitor == 1){
            int leitor2;
            Scanner inputCartao = new Scanner(System.in);
            Cliente.getPagamento();

            Dados();
            System.out.println("Selecione o tipo de pagamento: ");
            System.out.println("1 Débito \n2 Crédito \n3 Pix\n");
            tipo = inputUser.nextInt();
            switch (tipo){
                case 1:
                    System.out.print("Informe o número do cartão: ");
                    leitor2 = inputCartao.nextInt();
                    pagamento.setTipo("Débito");
                    pagamento.setNumeroCartao(String.valueOf(leitor2));
                    usuario.setPagamento(pagamento);
                    break;
                case 2:
                    System.out.print("Informe o número do cartão: ");
                    leitor2 = inputCartao.nextInt();
                    pagamento.setTipo("Crédito");
                    pagamento.setNumeroCartao(String.valueOf(leitor2));
                    usuario.setPagamento(pagamento);
                    System.out.print("Informe o CVA: ");
                    leitor2 = inputCartao.nextInt();
                    pagamento.setCVA((leitor2));
                    break;
            }
        }else if(leitor == 2){
            int leitor2;

            Scanner inputCartao = new Scanner(System.in);
            Cliente.getPagamento();
            tipo = inputUser.nextInt();
            DadosBalcao();

            switch (tipo){
                case 1:
                    System.out.print("Informe o número do cartão: ");
                    Integer leitor2 = inputCartao.nextInt();
                    pagamento.setTipo("Débito");
                    pagamento.setNumeroCartao(String.valueOf(leitor2));
                    usuario.setPagamento(pagamento);
                    break;
                case 2:
                    System.out.print("Informe o número do cartão: ");
                    leitor2 = inputCartao.nextInt();
                    pagamento.setTipo("Crédito");
                    pagamento.setNumeroCartao(String.valueOf(leitor2));
                    usuario.setPagamento(pagamento);
                    System.out.print("Informe o CVA: ");
                    leitor2 = inputCartao.nextInt();
                    pagamento.setCVA((leitor2));
                    break;
            }
        }else{

        }
    }



    public ControllerCliente(){}
    private static void Dados(){
        Scanner leitorNome = new Scanner(System.in);
        System.out.println("Qual seria o seu nome para colocar no pedido: ");
        usuario.setNome(leitorNome.nextLine());
        System.out.println("Qual seria o telefone para contato: ");
        usuario.setTelefone(leitorNome.nextLine());
        System.out.println("Qual seria o bairro para entrega: ");
        usuario.setBairro(leitorNome.nextLine());
        System.out.println("Qual seria a rua para entrega: ");
        usuario.setRua(leitorNome.nextLine());
        System.out.println("Qual seria o numero da casa para entrega: ");
        usuario.setNumero(leitorNome.nextLine());
    }

    private static void DadosBalcao(){
        Scanner leitorNome = new Scanner(System.in);
        System.out.println("Qual seria o seu nome para colocar no pedido: ");
        usuario.setNome(leitorNome.nextLine());
        System.out.println("Qual seria o telefone para contato: ");
        usuario.setTelefone(leitorNome.nextLine());
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
