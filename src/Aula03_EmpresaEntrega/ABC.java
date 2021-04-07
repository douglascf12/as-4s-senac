package Aula03_EmpresaEntrega;

public class ABC implements Empresa {

    @Override
    public double calcularFrete(Distancia distancia) {
        return distancia.getDistancia() * 0.2;
    }
    
}
