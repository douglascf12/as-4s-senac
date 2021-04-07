package Aula02_Exercicio01_Rev;

public class Funcionario extends PessoaFisica {
    
    private int matricula;
    
    public Funcionario() {}

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
    
}
