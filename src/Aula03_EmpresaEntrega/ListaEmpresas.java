package Aula03_EmpresaEntrega;

public enum ListaEmpresas implements Empresa {
    XPTO {
        @Override
        public double calcularFrete(Distancia distancia) {
            return distancia.getDistancia() * 0.1;
        }
    },
    ABC {
        @Override
        public double calcularFrete(Distancia distancia) {
            return distancia.getDistancia() * 0.2;
        }
    },
    SENAC {
        @Override
        public double calcularFrete(Distancia distancia) {
            return distancia.getDistancia() * 0.4;
        }
    };
}
