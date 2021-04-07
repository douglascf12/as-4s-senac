package Aula02_BatalhaTanques;

public class Tanque implements Posicao, Canhao, Cores {
    
    private CoresRGB corTanque;
    private CoresRGB corCanhao;
    private double x;
    private double y;

    @Override
    public void adPosicaoX(double x) {
        this.x = x;
    }

    @Override
    public double retPosicaoX() {
        return this.x;
    }

    @Override
    public void adPosicaoY(double y) {
        this.y = y;
    }

    @Override
    public double retPosicaoY() {
        return this.y;
    }

    @Override
    public void atirar() {
        System.out.println("Disparando...");
    }

    @Override
    public void setCores(CoresRGB corTanque, CoresRGB corCanhao) {
        this.corCanhao = corTanque;
        this.corCanhao = corCanhao;
    }

    @Override
    public CoresRGB getCorTanque() {
        return this.corTanque;
    }

    @Override
    public CoresRGB getCorCanhao() {
        return this.corCanhao;
    }

    
    
}
