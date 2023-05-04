package fag.ally.endereco;

import java.util.Random;
import java.util.Scanner;

public class Endereco {
    private String codigo;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    private static String gerarCodigo() {
        Random geradorAleatorio = new Random();
        return String.valueOf(geradorAleatorio.nextInt(100));
    }
    public static Endereco criarEndereco() {
        Scanner scanner = new Scanner(System.in);
        int codigo = Integer.parseInt(gerarCodigo());
        System.out.println("Digite o logradouro:");
        String logradouro = scanner.nextLine();
        System.out.println("Digite o bairro:");
        String bairro = scanner.nextLine();
        System.out.println("Digite a cidade:");
        String cidade = scanner.nextLine();
        System.out.println("Digite o estado:");
        String estado = scanner.nextLine();
        System.out.println("Digite o país:");
        String pais = scanner.nextLine();

        Endereco endereco = new Endereco();
        endereco.setCodigo(String.valueOf(codigo));
        endereco.setLogradouro(logradouro);
        endereco.setBairro(bairro);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);
        endereco.setPais(pais);
        return endereco;
    }
}
