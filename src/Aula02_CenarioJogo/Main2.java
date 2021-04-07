package Aula02_CenarioJogo;

public class Main2 extends Thread {
    
    @Override
    public void run() {
        Singleton s = Singleton.getInstance();
        System.out.println(s);
    }
    
    public static void main(String[] args) {
        Main2 m1 = new Main2();
        Main2 m2 = new Main2();
        m1.start();
        m2.start();
    }
}
