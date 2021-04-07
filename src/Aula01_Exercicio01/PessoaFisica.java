package Aula01_Exercicio01;

public class PessoaFisica extends Pessoa {
    
    private long cpf;

    public PessoaFisica() {
    }
    
    public PessoaFisica(String nome) {
        super(nome);
    }

    public PessoaFisica(long cpf) {
        this.cpf = cpf;
    }

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
    public String toString(){
        return "Nome: "+this.getNome()+'\n'
                          +"CPF: "+this.getCpf()+'\n';
    }
    
}