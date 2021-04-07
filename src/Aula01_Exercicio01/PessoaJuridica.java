package Aula01_Exercicio01;

public class PessoaJuridica extends Pessoa {

    private long cnpj;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String nome, long cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.getNome()+'\n'
                + "CNPJ: " + this.getCnpj()+'\n';
    }
    
}