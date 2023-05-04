package fag.ally.pessoa;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Passageiro extends Pessoa {

    private String codigo;

    private String passaporte;

    public Passageiro(String codigo, String nome, String email, String telefone, LocalDate nascimento, String rg, String cpf, String endereco) {
        super(codigo, nome, email, telefone, nascimento, rg, cpf, endereco);
        this.codigo = codigo;
    }


    public void gerarPassaport(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque o número do seu passaporte");
        String passaporte = scanner.nextLine();
        setPassaporte(passaporte);
    }

    public void gerarPassageiro(){
        Passageiro pasassageiro = new Passageiro(codigo, getNome(), getEmail(), getTelefone(), getNascimento(), getRg(), getCpf(), getEndereco());
        pasassageiro.gerarPassaport();
    }


    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

}
