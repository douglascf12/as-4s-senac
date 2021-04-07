package Aula03_EmpresaEntrega;

public class SENAC implements Empresa {

    @Override
    public double calcularFrete(Distancia distancia) {
        return distancia.getDistancia() * 0.4;
    }
    
}
