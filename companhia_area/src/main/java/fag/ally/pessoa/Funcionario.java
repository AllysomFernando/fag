package fag.ally.pessoa;

import fag.ally.endereco.Endereco;

import java.time.LocalDate;
import java.util.Date;

public class Funcionario extends Pessoa {
    private String codigo;
    private String contaCorrente;

    public Funcionario(String codigo, String nome, String email, String telefone, LocalDate nascimento, String rg, String cpf, Endereco endereco) {
        super(codigo, nome, email, telefone, nascimento, rg, cpf, endereco);
    }

}
