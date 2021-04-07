package Aula02_CenarioJogo;

public class Singleton {
    
    private static Singleton sin = new Singleton();
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        return sin;
    }
    
}
