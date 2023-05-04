package fag.ally.pessoa;
import fag.ally.endereco.Endereco;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Pessoa {

    private String codigo;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate nascimento;
    private String rg;
    private String cpf;

    private Endereco endereco;


    public Pessoa(String codigo, String nome, String email, String telefone, LocalDate nascimento, String rg, String cpf, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void criarEndereco() {
        endereco = Endereco.criarEndereco();
    }

    public void lerNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        setNome(nome);
    }

    public void lerEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o email:");
        String email = scanner.nextLine();
        setEmail(email);
    }

    public void lerTelefone() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();
        setTelefone(telefone);
    }

    public void lerData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a data de nascimento (no formato yyyy-MM-dd):");
        LocalDate date = LocalDate.parse(scanner.nextLine());
        setNascimento(date);
    }

    public void lerRg() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o RG:");
        String rg = scanner.nextLine();
        setRg(rg);
    }

    public void lerCpf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CPF:");
        String cpf = scanner.nextLine();
        setCpf(cpf);
    }



    private static String gerarCodigo() {
        Random geradorAleatorio = new Random();
        return String.valueOf(geradorAleatorio.nextInt(100));
    }

    public static Pessoa gerarPessoa(){
        String codigo = gerarCodigo();
        Pessoa pessoa = new Pessoa(codigo, null, null, null, null, null, null, null);
        pessoa.lerNome();
        pessoa.lerEmail();
        pessoa.lerTelefone();
        pessoa.lerData();
        pessoa.lerRg();
        pessoa.lerCpf();
        pessoa.criarEndereco();
        return pessoa;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}

/*

package fag.ally.pessoa;

import fag.ally.endereco.Endereco;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Pessoa {

    private String codigo;
    private String nome;
    private String email;
    private String telefone;
    private LocalDate nascimento;
    private String rg;
    private String cpf;
    private Endereco endereco;

    public Pessoa(String codigo, String nome, String email, String telefone, LocalDate nascimento, String rg, String cpf, Endereco endereco) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void lerNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();
        setNome(nome);
    }

    public void lerEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o email:");
        String email = scanner.nextLine();
        setEmail(email);
    }

    public void lerTelefone() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o telefone:");
        String telefone = scanner.nextLine();
        setTelefone(telefone);
    }

    public void lerDataNascimento() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a data de nascimento (no formato yyyy-MM-dd):");
        LocalDate date = LocalDate.parse(scanner.nextLine());
        setNascimento(date);
    }

    public void lerRg() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o RG:");
        String rg = scanner.nextLine();
        setRg(rg);
    }

    public void lerCpf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o CPF:");
        String cpf = scanner.nextLine();
        setCpf(cpf);
    }

    public void criarEndereco() {
        endereco = Endereco.criarEndereco();
    }

    private static String gerarCodigo() {
        Random geradorAleatorio = new Random();
        return String.valueOf(geradorAleatorio.nextInt(100));
    }

    public static Pessoa gerarPessoa() {
        String codigo = gerarCodigo();
        Pessoa pessoa = new Pessoa(codigo, null, null, null, null, null, null, null);
        pessoa.lerNome();
        pessoa.lerEmail();
        pessoa.lerTelefone();
        pessoa.lerDataNascimento();
        pessoa.lerRg();
        pessoa.lerCpf();
        pessoa.criarEndereco();
        return pessoa;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg =
 */