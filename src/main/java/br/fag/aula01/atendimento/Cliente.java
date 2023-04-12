package br.fag.aula01.atendimento;
import java.util.Scanner;
import java.util.Calendar;


public class Cliente{
    private static String nome;
    private static String telefone;
    private static String bairro;
    private static String rua;
    private static String numero;

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Cliente.nome = nome;
    }

    public static String getTelefone() {
        return telefone;
    }

    public static void setTelefone(String telefone) {
        Cliente.telefone = telefone;
    }

    public static String getBairro() {
        return bairro;
    }

    public static void setBairro(String bairro) {
        Cliente.bairro = bairro;
    }

    public static String getRua() {
        return rua;
    }

    public static void setRua(String rua) {
        Cliente.rua = rua;
    }

    public static String getNumero() {
        return numero;
    }

    public static void setNumero(String numero) {
        Cliente.numero = numero;
    }

    public static void outPut() {
        Scanner inputUser = new Scanner(System.in);
        int leitor;
        int tipo;
        Cliente Usuario;

        Calendar time = Calendar.getInstance();
        System.out.print(decodePeriod(time));
        System.out.println("Qual seria o tipo de retirada? \n");
        System.out.println("1 Delivery \n2 Retirada Balcao \n3 La Carte\n");
        leitor = inputUser.nextInt();

        if(leitor == 1){
            Usuario = new Cliente();
            Usuario.Dados();
            System.out.println("Selecione o tipo de pagamento: ");
            System.out.println("1 Débito \n2 Crédito \n3 Pix\n");
            tipo = inputUser.nextInt();
            switch (tipo){
                case 1:
                    System.out.print("Informe o número do cartão: ");
                    Usuario.setNumeroCartao(new Pagamento());
                    Usuario.getNumeroCartao().setTipo("Débito");
                    Usuario.getNumeroCartao().setNumeroCartao(scanner.nextLine());
                    break;
            }
        }else if(leitor == 2){
            Usuario = new Cliente();
            Usuario.DadosBalcao();
        }else{

        }
    }



    public Cliente(){}
    private static void Dados(){
        Scanner leitorNome = new Scanner(System.in);
        System.out.println("Qual seria o seu nome para colocar no pedido: ");
        setNome(leitorNome.nextLine());
        System.out.println("Qual seria o telefone para contato: ");
        setTelefone(leitorNome.nextLine());
        System.out.println("Qual seria o bairro para entrega: ");
        setBairro(leitorNome.nextLine());
        System.out.println("Qual seria a rua para entrega: ");
        setRua(leitorNome.nextLine());
        System.out.println("Qual seria o numero da casa para entrega: ");
        setNumero(leitorNome.nextLine());
    }

    private static void DadosBalcao(){
        Scanner leitorNome = new Scanner(System.in);
        System.out.println("Qual seria o seu nome para colocar no pedido: ");
        nome = leitorNome.nextLine();
        System.out.println("Qual seria o telefone para contato: ");
        telefone = leitorNome.nextLine();
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