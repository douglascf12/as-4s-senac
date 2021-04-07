package Aula03_EmpresaEntrega;

public class XPTO implements Empresa {

    @Override
    public double calcularFrete(Distancia distancia) {
        return distancia.getDistancia() * 0.1;
    }
    
}
