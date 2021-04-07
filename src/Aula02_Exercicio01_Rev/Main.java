package Aula02_Exercicio01_Rev;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Douglas");
        System.out.println(p.getNome());
        
        Funcionario f = new Funcionario(1, 123456, "Daniela");
        System.out.println(f.getMatricula() + " " + f.getCpf() + " " + f.getNome());
    }
}
