package Aula02_ProjetoVeiculos;

public class CriarVeiculos {
    public static void main(String[] args) {
        Veiculo v;
        int op = 2;
        if(op == 1) {
            v = new Carro();
            v.acelerar();
            v.painel();
        } else if(op == 2) {
            v = new Moto();
            v.acelerar();
            v.painel();
        }
    }
}
