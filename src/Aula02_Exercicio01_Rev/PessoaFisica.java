package Aula02_Exercicio01_Rev;

public class PessoaFisica extends Pessoa {
    
    private long cpf;
    
    public PessoaFisica() {}

    public PessoaFisica(long cpf, String nome) {
        super(nome);
        this.cpf = cpf;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    
    
}
