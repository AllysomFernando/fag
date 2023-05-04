package fag.ally.pessoa;

import java.time.LocalDate;
import java.util.Random;

public class Passageiro extends Pessoa {

    private String codigo;

    private String passaporte;

    public String getPassaporte() {
        return passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }


    public Passageiro(String codigo, String nome, String email, String telefone, LocalDate nascimento, String rg, String cpf, String endereco) {
        super(codigo, nome, email, telefone, nascimento, rg, cpf, endereco);
        this.codigo = codigo;
    }

    public void gerarPassageiro(){

    }

}
