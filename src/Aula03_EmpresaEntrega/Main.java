package Aula03_EmpresaEntrega;

public class Main {
    
    public static void main(String[] args) {
        
        Distancia distancia = new Distancia(100);
        System.out.println(determinarFrete(ListaEmpresas.ABC, distancia));
        
    }
    
    public static double determinarFrete(ListaEmpresas empresa, Distancia distancia) {
        double frete = 0;
        return empresa.calcularFrete(distancia);
    }
}
