package Aula02_BatalhaTanques;

public class batalhaTanques {
    public static void main(String[] args) {
        Tanque tanque = new Tanque();
        tanque.setCores(CoresRGB.red, CoresRGB.green);
        tanque.atirar();
        tanque.adPosicaoX(12);
        tanque.adPosicaoY(45);
        System.out.println(tanque.retPosicaoX());
        System.out.println(tanque.retPosicaoY());
        System.out.println(tanque.getCorTanque());
        System.out.println(tanque.getCorCanhao());
    }
}
