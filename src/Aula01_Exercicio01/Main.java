package Aula01_Exercicio01;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        Funcionario funcionario = new Funcionario(1234, 11122233344L, "Joãozinho");
        pessoas.add(funcionario);
        
        PessoaJuridica pessoaJuridica = new PessoaJuridica("Mariazinha", 55566677788L);
        pessoas.add(pessoaJuridica);
        
        PessoaFisica pessoaFisica = new PessoaFisica(99988877722L, "Pedrinho");
        pessoas.add(pessoaFisica);
        
        for(Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
        }
    }

}