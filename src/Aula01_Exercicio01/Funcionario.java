package Aula01_Exercicio01;

public class Funcionario extends PessoaFisica {

    private int matricula;

    public Funcionario(int matricula, long cpf, String nome) {
        super(cpf, nome);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome()+'\n'
                + "CPF: " + this.getCpf()+'\n'
                + "Matricula: " + this.getMatricula()+'\n';
    }
}